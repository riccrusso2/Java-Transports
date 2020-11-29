package transports.managers;

import transports.domain_entities.Truck;
import transports.exceptions.InvalidManagerInputException;

import java.util.Collection;

/**
 * This ADT is used to represent a manager for Truck available
 * @see Truck
 */


public class TrucksManager {
    Collection<Truck> container;

    /**
     * Creates a new instace of a manager of trucks
     */
    public TrucksManager(){

    }

    /**
     * Checks if the truck provided exists in this manager
     * @param truck The truck to search in this manager
     * @return true - if the truck is in this manager, false - otherwise
     * @throws NullPointerException if the input is null
     */
    private boolean existsTruck(Truck truck){
        return false;
    }



    /**
     * Takes care of adding a truck passed in this manager
     * @param truck Represents a truck object,not present in this manaher to be added
     * @throws InvalidManagerInputException If the truck is already in
     * @throws NullPointerException If the input is null
     */

    public void insert(Truck truck){

    }



    /**
     * Takes care of removing the truck given
     * @param  truck  Truck object that will be removed from this manager
     * @throws InvalidManagerInputException  If the truck passed doesn't exist
     * @throws NullPointerException If the input is null
     */

    public void remove(Truck truck){


    }


}
