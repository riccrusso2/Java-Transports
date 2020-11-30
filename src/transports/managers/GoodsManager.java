package transports.managers;

import transports.domain_entities.Good;
import transports.exceptions.InvalidManagerInputException;

import java.util.Collection;

/**
 * This ADT is used to represent a manager for goods available
 * @see Good
 */
public class GoodsManager {
    private Collection<Good> container;

    /**
     * Creates a new instance of a manager of goods
     */
    public GoodsManager(){

    }

    /**
     * Checks if the good provided exists in this manager
     * @param good The good to search in this manager
     * @return true - if is in this manager, false - otherwise
     *
     * @throws NullPointerException if the input is null
     */
    private boolean existsGood(Good good){
        return false;
    }

    /**
     * Takes care of adding a good in this manager, if not present
     * @param good Represents a good object, not present in this manager, to be added
     *
     * @throws InvalidManagerInputException if already present in this manager
     * @throws NullPointerException if the input is null
     */
    public void insert(Good good){

    }


    /**
     * Takes care of removing the good given, if present in this manager
     * @param good Good object that will be removed from this manager, if present
     *
     * @throws InvalidManagerInputException if doesn't exist
     * @throws NullPointerException if the input is null
     */

    public void remove(Good good){


    }

    /**
     *search the container for a good with the associated name given
     *
     * @param goodName name of the good to search
     * @return the good you are looking for if it present in this manager
     * @throws InvalidManagerInputException if doesn't exist
     * @throws NullPointerException if the input is null
     */

    public Good getGood(String goodName){

    }


}
