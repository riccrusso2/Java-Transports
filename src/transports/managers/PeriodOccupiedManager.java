package transports.managers;
import transports.domain_entities.PeriodOccupied;
import transports.exceptions.InvalidManagerInputException;
import transports.exceptions.NullinputException;

import java.util.Collection;

/**
 * This ADT is used to represent a manager for periods (of use) occupied by trucks
 * @see PeriodOccupied
 */

public class PeriodOccupiedManager {
    private Collection<PeriodOccupied> container;
    private TrucksManager trucksManager;


    /**
     * Creates a new instace of a manager of PeriodOccupied
     */
    public PeriodOccupiedManager(TrucksManager trucksManager) {

    }


    /**
     * Checks if the period provided exists in this manager
     *
     * @param periodOccupied The period to search in this manager
     * @return true - if is in this manager, false - otherwise
     * @throws NullinputException if the input is null
     */
    private boolean existsPeriod(PeriodOccupied periodOccupied) {
        return false;
    }


    /**
     * Takes care of adding a period, if not present, in this manager
     *
     * @param periodOccupied Represents a period object, not present in this manager, to be added
     * @throws InvalidManagerInputException if is already in
     * @throws NullinputException         if the input is null
     */
    public void insert(PeriodOccupied periodOccupied) {

    }


    /**
     * Takes care of removing the period given, if is present in this manager
     *
     * @param periodOccupied Period object that will be removed, if present, from this manager
     * @throws InvalidManagerInputException if doesn't exist
     * @throws NullinputException         if the input is null
     */
    public void remove(PeriodOccupied periodOccupied) {


    }
}

