package transports.managers;

import transports.domain_entities.Customer;
import transports.domain_entities.Good;
import transports.exceptions.InvalidManagerInput;

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
     */
    private boolean existsGood(Good good){
        return false;
    }

    /**
     * Takes care of adding a good in this manager
     * @param good Represents a good object, already instantiated, to be added
     *@throws InvalidManagerInput  good passed is null or already existing
     */

    public void insert(Good good){

    }


    /**
     * Takes care of removing the good given
     * @param good Good object that will be removed from this manager
     *@throws InvalidManagerInput  good passed is null or doesn't exist
     */

    public void remove(Good good){


    }


    /**
     *it is based on the private  iterator method
     * @param n is the number of good you want
     * @return arrayList that contain n goods you want
     *
     */
    public ArrayList<Good> getGoodsSupported(int n){

    }

    /**
     * @return a standard iterator over the good of this collection
     */
    private Iterator<Good> iterator(){
        Iterator res= new Iterator(this.container);
        return res;

    }


}
