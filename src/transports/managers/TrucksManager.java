package transports.managers;

import transports.domain_entities.Good;
import transports.domain_entities.Truck;
import transports.exceptions.InputNotAvaiableException;
import transports.exceptions.InvalidManagerInputException;
import transports.exceptions.NullInputException;

import java.util.Collection;
import java.util.Iterator;

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
        if(goodsManager == null)
            throw new NullPointerException("The manager passed is null");
        this.goodsManager = goodsManager;
    }

    public Collection<Truck> getContainer() {
        return container;
    }

    /**
     * Checks if the truck provided exists in this manager
     * @param truck The truck to search in this manager
     * @return true - if the truck is in this manager, false - otherwise
     * @throws NullInputException if the input is null
     */
    public boolean existsTruck(Truck truck) throws NullInputException, InputNotAvaiableException {
        if(truck == null)
            throw new NullInputException("The truck passed is null");
        if(existsTruck(truck))
            throw new InputNotAvaiableException(truck);
        return getContainer().contains(truck);
    }



    /**
     * Takes care of adding a truck passed in this manager
     * @param truck Represents a truck object,not present in this manager to be added
     * @throws InvalidManagerInputException If the truck is already in
     * @throws NullInputException If the input is null
     * @throws InputNotAvaiableException if at least one good associated with the truck is not present in the manager of goods
     */

    public void insert(Truck truck) throws NullInputException, InputNotAvaiableException {
        if(truck == null)
            throw new NullInputException("The truck passed is null");
        if(existsTruck(truck))
            throw new InputNotAvaiableException(truck);

        Iterator<Good> itGoodsSupported = truck.getGoodsSupported();
        while(itGoodsSupported.hasNext()) {
            Good currGood = itGoodsSupported.next();
            if (!this.goodsManager.existsGood(currGood)){
                throw new InputNotAvaiableException(currGood);
            }
        }

        getContainer().add(truck);
    }



    /**
     * Takes care of removing the truck given
     * @param  truck  Truck object that will be removed from this manager
     * @throws InvalidManagerInputException  If the truck passed doesn't exist
     * @throws NullInputException If the input is null
     */

    public void remove(Truck truck) throws NullInputException, InputNotAvaiableException {
        if(truck == null)
            throw new NullInputException("The truck passed is null");
        if(!existsTruck(truck))
            throw new InputNotAvaiableException(truck);

        getContainer().remove(truck);
    }




}
