package transports.managers;

import transports.domain_entities.Good;
import transports.enumerators.GoodType;
import transports.enumerators.UnitMeasure;

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
     */
    private boolean existsGood(Good good){
        return false;
    }

    /**
     * Takes care of adding a good in this manager
     * @param good Represents a good object, already instantiated, to be added
     *
     */
    /*
        (EXCEPTIONAL CASES)
            -Good passed is null
            -or is already in
    */
    public void insert(Good good){

    }

    /**
     * Takes care of instantiating a new good object and then add it in this manager
     * @param contentName Represents the name of the content of the new good
     * @param goodType Represents the type of the new good
     * @param unitMeasure Represents the unit of measure of the new good
     */
    /*
        (EXCEPTIONAL CASES)
            -At least 1 param passed is null
            -or the new good is already in
    */
    public void insert(String contentName, GoodType goodType, UnitMeasure unitMeasure){

    }

    /**
     * Takes care of removing the good given
     * @param good Good object that will be removed from this manager
     */
    /*
        (EXCEPTIONAL CASES)
            -Good is null
            -or not in this manager
    */
    public void remove(Good good){


    }

}
