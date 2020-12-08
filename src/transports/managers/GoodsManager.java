package transports.managers;

import transports.domain_entities.Good;
import transports.exceptions.InvalidManagerInputException;
import transports.exceptions.NullInputException;

import java.util.Collection;
import java.util.Vector;

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
        this.container= new Vector<Good>();

    }

    /**
     * Checks if the good provided exists in this manager
     * @param good The good to search in this manager
     * @return true - if is in this manager, false - otherwise
     *
     * @throws NullInputException if the input is null
     */
    public boolean existsGood(Good good)throws NullInputException{
        if(good==null){
            throw new NullInputException("the parameter passed is null");
        }
        if(this.container.contains(good)){
            return true;
        }
        else{
            return false;
        }
    }

    /**
     * Takes care of adding a good in this manager, if not present
     * @param good Represents a good object, not present in this manager, to be added
     *
     * @throws InvalidManagerInputException if already present (good with same name) in this manager
     * @throws NullInputException if the input is null
     */
    public void insert(Good good)throws InvalidManagerInputException,NullInputException{
        if(existsGood(good)){
            throw new InvalidManagerInputException(good);
        }
        else if(good==null){
            throw new NullInputException("the parameter passed is null");
        }
        else{
            this.container.add(good);
        }



    }


    /**
     * Takes care of removing the good given, if present in this manager
     * @param good Good object that will be removed from this manager, if present
     *
     * @throws InvalidManagerInputException if doesn't exist
     * @throws NullInputException if the input is null
     */

    public void remove(Good good)throws InvalidManagerInputException,NullInputException{
        if(!existsGood(good)){
            throw new InvalidManagerInputException(good);
        }else if(good==null){
            throw new NullInputException("the parameter passed is null");
        }
        else{
            this.container.remove(good);
        }


    }




}
