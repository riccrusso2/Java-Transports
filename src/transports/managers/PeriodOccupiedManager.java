package transports.managers;
import transports.domain_entities.PeriodOccupied;
import transports.domain_entities.Truck;
import transports.exceptions.InvalidManagerInputException;
import transports.exceptions.NullInputException;
import transports.exceptions.InputNotAvaiableException;

import java.util.Collection;
import java.util.Iterator;
import java.util.Vector;

/**
 * This ADT is used to represent a manager for periods (of use) occupied by trucks
 * @see PeriodOccupied
 */

public class PeriodOccupiedManager {
    private Collection<PeriodOccupied> container;
    private TrucksManager trucksManager;


    /**
     * Creates a new instace of a manager of PeriodOccupied
     * @param trucksManager the manager of trucks
     * @throws  NullInputException if the input is null
     */
    public PeriodOccupiedManager(TrucksManager trucksManager) {
        if(trucksManager == null)
            throw new NullPointerException("The manager passed is null");
        this.container = new Vector<PeriodOccupied>();
        this.trucksManager = trucksManager;
    }

    public Collection<PeriodOccupied> getContainer(){
        return this.container;
    }

    /**
     * Checks if the period provided exists in this manager
     *
     * @param periodOccupied The period to search in this manager
     * @return true - if is in this manager, false - otherwise
     * @throws NullInputException if the input is null
     */
    public boolean existsPeriod(PeriodOccupied periodOccupied) throws NullInputException {
        if(periodOccupied == null)
            throw new NullPointerException("The period passed is null");
        return getContainer().contains(periodOccupied);
    }


    /**
     * Takes care of adding a period, if not present, in this manager
     *
     * @param periodOccupied Represents a period object, not present in this manager, to be added
     * @throws InvalidManagerInputException if is already in
     * @throws NullInputException         if the input is null
     * @throws InputNotAvaiableException if the truck associated is not present in manager of trucks
     *                                   or if the interval associated to the period to be inserted is in another period with the same truck
     */
    public void insert(PeriodOccupied periodOccupied) throws NullInputException, InvalidManagerInputException, InputNotAvaiableException {
        if(periodOccupied == null)
            throw new NullInputException("The period passed is null");
        if(existsPeriod(periodOccupied))
            throw new InvalidManagerInputException(periodOccupied);
        Truck newPeriodTruck = periodOccupied.getTruck();
        if(!this.trucksManager.existsTruck(newPeriodTruck))
            throw new InputNotAvaiableException(newPeriodTruck);

        Iterator<PeriodOccupied> itPeriods = getContainer().iterator();
        while(itPeriods.hasNext()) {
            PeriodOccupied currPeriod = itPeriods.next();
            if (currPeriod.containsPeriod(periodOccupied) || periodOccupied.containsPeriod(currPeriod) && currPeriod.getTruck().equals(newPeriodTruck)) {
                //SIGNIFICATE -->> "The period passed is partially (or totally) a part of another occupied period for that truck"
                throw new InputNotAvaiableException(periodOccupied);
            }
        }

        getContainer().add(periodOccupied);
    }


    /**
     * Takes care of removing the period given, if is present in this manager
     *
     * @param periodOccupied Period object that will be removed, if present, from this manager
     * @throws InvalidManagerInputException if doesn't exist
     * @throws NullInputException         if the input is null
     */
    public void remove(PeriodOccupied periodOccupied) throws InvalidManagerInputException, NullInputException {
        if(periodOccupied == null)
            throw new NullInputException("The period passed is null");
        if(!existsPeriod(periodOccupied))
            throw new InvalidManagerInputException(periodOccupied);
        getContainer().remove(periodOccupied);
    }

}

