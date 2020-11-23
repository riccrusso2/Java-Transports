package transports.managers;

import transports.domain_entities.Good;
import transports.domain_entities.Truck;
import transports.enumerators.GoodType;
import transports.enumerators.UnitMeasure;

import java.util.Collection;

/**
 * This ADT is used to represent a manager for Truck available
 * @see Truck
 */


public class TrucksManager {
    Collection<Truck> container;

    /**
     *  creates a new instace of a manager of trucks
     *
     */
    public TrucksManager(){

    }

    /**
     * Checks if the truck provided exists in this manager
     * @param truck The truck to search in this manager
     * @return true - if is in this manager, false - otherwise
     */
    private boolean existsTruck(Truck truck){
        return false;
    }

    /**
     * Takes care of adding a truck,already instantiaded, in this manager
     * @param truck Represents a truck object, already instantiated, to be added
     *
     */
    /*
        (EXCEPTIONAL CASES)
            -truck passed is null
            -or is already in
    */
    public void insert(Truck truck){

    }



    /**
     * Takes care of removing the truck given
     * @param  truck  Truck object that will be removed from this manager
     */
    /*
        (EXCEPTIONAL CASES)
            -truck is null
            -or not in this manager
    */
    public void remove(Truck truck){


    }

}
}
