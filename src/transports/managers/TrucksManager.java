package transports.managers;

import transports.domain_entities.Truck;
import transports.exceptions.InputNotAvaiableException;
import transports.exceptions.InvalidManagerInputException;
import transports.exceptions.NullInputException;

import java.util.Collection;

/**
 * This ADT is used to represent a manager for Truck available
 * @see Truck
 */


public class TrucksManager {
    private Collection<Truck> container;
    private GoodsManager goodsManager;

    /**
     * Creates a new instace of a manager of trucks
     * @param goodsManager the manager of goods
     */
    public TrucksManager(GoodsManager goodsManager) {

    }

    /**
     * Checks if the truck provided exists in this manager
     * @param truck The truck to search in this manager
     * @return true - if the truck is in this manager, false - otherwise
     * @throws NullInputException if the input is null
     */
    public  boolean existsTruck(Truck truck){
        return false;
    }



    /**
     * Takes care of adding a truck passed in this manager
     * @param truck Represents a truck object,not present in this manager to be added
     * @throws InvalidManagerInputException If the truck is already in
     * @throws NullInputException If the input is null
     * @throws InputNotAvaiableException if at least one good associated with the truck is not present in the manager of goods
     */

    public void insert(Truck truck){

    }



    /**
     * Takes care of removing the truck given
     * @param  truck  Truck object that will be removed from this manager
     * @throws InvalidManagerInputException  If the truck passed doesn't exist
     * @throws NullInputException If the input is null
     */

    public void remove(Truck truck){


    }




}
