package transports.managers;

import transports.domain_entities.Customer;
import transports.domain_entities.Good;
import transports.enumerators.GoodType;
import transports.enumerators.PaymentType;
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
     * @param good The good to search in this manager
     * @return True if is in this manager, false otherwise
     */
    private boolean existsGood(Good good){
        return false;
    }

    /**
     * Takes care of adding a good in this manager
     * @param good Represents a good object, already existing, to be added
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
     * Takes care of creating a new good object and then add it in this manager
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
     * Takes care of modifying the name, surname and fiscal code of the customer given
     * @param unitMeasure Customer object that will be modified
     *
     */
    /*
        (EXCEPTIONAL CASES)

    */
    public void modify(Good good, UnitMeasure unitMeasure){

    }

    /**
     * Takes care of modifying the type of payment of the customer given
     * @param customer Customer object that will be modified
     * @param paymentType The new type of payment of the customer
     *
     */
    /*
        (EXCEPTIONAL CASES)
            -Customer is null or not in this manager
            -At least 1 param passed is null (except of customer)
    */
    public void modify(Customer customer,PaymentType paymentType){

    }

    /**
     * Takes care of modifying the address of the customer given
     * @param customer customer object that will be modified
     * @param newAddress the new address of the customer
     *
     */
    /*
        (EXCEPTIONAL CASES)
            -Customer is null or not in this manager
            -At least 1 param passed is null (except of customer)
    */
    public void modify(Customer customer,String newAddress){


    }

    //TODO: Finire a scrivere tutti i contratti delle modifiche
}
