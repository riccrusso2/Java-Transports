package transports.managers;

import transports.domain_entities.Truck;
import transports.enumerators.GoodType;
import transports.exceptions.InvalidManagerInputException;
import transports.exceptions.NullinputException;

import java.util.Collection;
import java.util.List;

/**
 * This ADT is used to represent a manager for Truck available
 * @see Truck
 */


public class TrucksManager {
    private Collection<Truck> container;
    private GoodsManager goodsManager;

    /**
     * Creates a new instace of a manager of trucks
     */
    public TrucksManager(GoodsManager goodsManager) {

    }

    /**
     * Checks if the truck provided exists in this manager
     * @param truck The truck to search in this manager
     * @return true - if the truck is in this manager, false - otherwise
     * @throws NullinputException if the input is null
     */
    private boolean existsTruck(Truck truck){
        return false;
    }



    /**
     * Takes care of adding a truck passed in this manager
     * @param truck Represents a truck object,not present in this manaher to be added
     * @throws InvalidManagerInputException If the truck is already in
     * @throws NullinputException If the input is null
     */

    public void insert(Truck truck){

    }



    /**
     * Takes care of removing the truck given
     * @param  truck  Truck object that will be removed from this manager
     * @throws InvalidManagerInputException  If the truck passed doesn't exist
     * @throws NullinputException If the input is null
     */

    public void remove(Truck truck){


    }

    /**
     * Check if in the collection there is a truck that can trasport the type of good passed
     * and has a capacity greater equal than kg passed
     *
     * @param goodType type of good you want to transport
     * @param kg weight of the goods you want to transport
     * @return the truck that satisfied those conditions
     */
    public List<Truck> findTruck(GoodType goodType, double kg){
        return null;
    }


}
