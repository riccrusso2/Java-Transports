package transports.managers;

import transports.domain_entities.Route;
import transports.domain_entities.Transport;
import transports.exceptions.InputNotAvaiableException;
import transports.exceptions.InvalidManagerInputException;
import transports.exceptions.NullInputException;

import java.util.Collection;
import java.util.Iterator;

/**
 * This ADT is used to represent a manager for Transports available
 */
public class TransportsManager {

    private Collection<Transport> container;
    private PeriodOccupiedManager periodOccupiedManager;
    private TrucksManager trucksManager;
    private RoutesManager routesManager;

    /**
     * Instances a new manager of transport
     *
     * @param periodOccupiedManager the manager of period occupied
     * @param trucksManager         the manager of trucks
     * @param routesManager         the manager of routes
     * @throws NullInputException at least one of the parameters is null
     */

    public TransportsManager(PeriodOccupiedManager periodOccupiedManager, TrucksManager trucksManager, RoutesManager routesManager) throws NullInputException {
        if (periodOccupiedManager == null || trucksManager == null || routesManager == null) {
            throw new NullInputException("one of the parameters is null");
        }
        this.periodOccupiedManager = periodOccupiedManager;
        this.trucksManager = trucksManager;
        this.routesManager = routesManager;

    }

    /**
     * takes care of adding the transport in this manager
     *
     * @param transport Represents a transport object, not present in this manager, to be added
     * @throws InvalidManagerInputException if is already in
     * @throws NullInputException           if the input is null
     * @throws InputNotAvaiableException    if there aren't  trucks avaiable for that period
     *                                      or there aren't trucks avaiable for those goods and quantities
     *                                      or there aren't routes avaiable
     */
    //i percorsi del trasporto devono essere collegati tra di loro

    public void insert(Transport transport) throws InvalidManagerInputException, NullInputException, InputNotAvaiableException {

        // TODO: Controllare se il truck associato è disponibile nel periodo scritto nel transport
        // TODO: Dopo questa sopra, controllare se

        if (transport == null) {
            throw new NullInputException("input passed is null");
        }
        if (existsTransport(transport)) {
            throw new InvalidManagerInputException(transport);
        }
        Iterator<Route> itRoute = transport.getTransportRoutes();
        while (itRoute.hasNext()) {
            Route route = itRoute.next();
            if (!this.routesManager.existRoute(route)) {
                throw new InputNotAvaiableException(route);
            }
        }
        if (this.periodOccupiedManager.existsPeriod(transport.getPeriodOccupied())) {
            throw new InputNotAvaiableException(transport.getPeriodOccupied());
        }


    }

    /**
     * Checks if  the transport provided exists in this manager
     *
     * @param transport The  transport to search in this manager
     * @return true - if is in this manager, false - otherwise
     * @throws NullInputException if the input is null
     */
    public boolean existsTransport(Transport transport) throws NullInputException {
        if (transport == null) {
            throw new NullInputException("input passed is null");
        }
        return this.container.contains(transport);
    }


    /**
     * Takes care of removing the period given, if is present in this manager
     *
     * @param transport Transport object that will be removed, if present, from this manager
     * @throws InvalidManagerInputException if doesn't exist
     * @throws NullInputException           if the input is null
     */
    public void remove(Transport transport) throws InvalidManagerInputException, NullInputException {
        if (transport == null) {
            throw new NullInputException("input passed is null");
        }
        if (!existsTransport(transport)) {
            throw new InvalidManagerInputException(transport);

        }
        this.container.remove(transport);


    }
}


