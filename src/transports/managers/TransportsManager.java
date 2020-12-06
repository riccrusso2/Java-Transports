package transports.managers;

import transports.domain_entities.Transport;
import transports.exceptions.InputNotAvaiableException;
import transports.exceptions.InvalidManagerInputException;
import transports.exceptions.NullInputException;

import java.util.Collection;

/**
 * This ADT is used to represent a manager for Transports available
 */
public class TransportsManager {

    private Collection<Transport> container;
    private PeriodOccupiedManager periodOccupied;
    private TrucksManager trucksManager;
    private RoutesManager routesManager;

    /**
     * Instances a new manager of transport
     * @param periodOccupied the manager of period occupied
     * @param trucksManager the manager of trucks
     * @param routesManager the manager of routes
     * @throws NullInputException at least one of the parameters is null
     */

    public TransportsManager(PeriodOccupiedManager periodOccupied,TrucksManager trucksManager,RoutesManager routesManager){

    }

    /**
     *takes care of adding the transport in this manager
     * @param transport Represents a transport object, not present in this manager, to be added
     * @throws InvalidManagerInputException if is already in
     * @throws NullInputException         if the input is null
     * @throws InputNotAvaiableException if there aren't  trucks avaiable for that period
     *                                   or there aren't trucks avaiable for those goods and quantities
     *                                   or there aren't routes avaiable
     */

    public void insert(Transport transport){

    }

    /**
     * Checks if  the transport provided exists in this manager
     *
     * @param transport The  transport to search in this manager
     * @return true - if is in this manager, false - otherwise
     * @throws NullInputException if the input is null
     */
    public boolean existsTransport(Transport transport) {
        return false;
    }





    /**
     * Takes care of removing the period given, if is present in this manager
     *
     * @param transport Transport object that will be removed, if present, from this manager
     * @throws InvalidManagerInputException if doesn't exist
     * @throws NullInputException         if the input is null
     */
    public void remove(Transport transport) {


    }

}
