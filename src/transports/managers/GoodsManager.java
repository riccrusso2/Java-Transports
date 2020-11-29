package transports.managers;

import transports.domain_entities.Good;
import transports.exceptions.InvalidManagerInputException;
import transports.exceptions.NullinputException;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

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
     * @throws NullinputException if the input is null
     */
    private boolean existsGood(Good good){
        return false;
    }

    /**
     * Takes care of adding a good in this manager
     * @param good Represents a good object, already instantiated, to be added
     *@throws InvalidManagerInputException  already existing
     * @throws NullinputException if the input is null
     */

    public void insert(Good good){

    }


    /**
     * Takes care of removing the good given
     * @param good Good object that will be removed from this manager
     *@throws InvalidManagerInputException  doesn't exist
     * @throws NullinputException if the input is null
     */

    public void remove(Good good){


    }
}
