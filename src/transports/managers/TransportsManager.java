package transports.managers;

import transports.domain_entities.Transport;
import transports.exceptions.InputNotAvaiableException;
import transports.exceptions.InvalidManagerInputException;
import transports.exceptions.NullinputException;

import java.util.Collection;
import java.util.List;

/**
 * This ADT is used to represent a manager for Transports available
 */
public class TransportsManager {

    private Collection<Transport> container;
    private PeriodOccupiedManager periodOccupied;
    private TrucksManager trucks;

    /**
     * Instances a new transportManager that creates a collection of transport
     * @param periodOccupied the manager of period occupied
     * @param trucks the manager of trucks
     * @throws NullinputException
     */

    public TransportsManager(PeriodOccupiedManager periodOccupied,TrucksManager trucks){

    }

    /**
     * before inserting the transport in the container we need to check if
     * there are trucks avaiable for that period
     * there are trucks avaiable for those goods and quantities
     * there is a route avaiable
     *
     * @param transport Represents a transport object, not present in this manager, to be added
     * @throws InvalidManagerInputException if is already in
     * @throws NullinputException         if the input is null
     * @throws InputNotAvaiableException if the at least one of the condition is not satisfied
     */

    public void insert(Transport transport){

    }

    /**
     * Checks if all the transport provided exists in this manager
     *
     * @param transport The list of  transport to search in this manager
     * @return true - if is in this manager, false - otherwise
     * @throws NullinputException if the input is null
     */
    private boolean existsTransport(List<Transport>transport) {
        return false;
    }





    /**
     * Takes care of removing the period given, if is present in this manager
     *
     * @param transport Transport object that will be removed, if present, from this manager
     * @throws InvalidManagerInputException if doesn't exist
     * @throws NullinputException         if the input is null
     */
    public void remove(Transport transport) {


    }

}
