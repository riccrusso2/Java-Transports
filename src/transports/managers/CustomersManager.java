package transports.managers;
import transports.domain_entities.Customer;
import transports.enumerators.PaymentType;

import java.util.Collection;

/**
 * This ADT is used to represent a manager for customers available
 * @see Customer
 */
public class CustomersManager {
    private Collection<Customer> container;

    /**
     * @param customer The customer to search in this manager
     * @return True if is in this manager, false otherwise
     */
    private boolean existsCustomer(Customer customer){
        return false;
    }

    /**
     * Takes care of adding customer in the collection container
     * @param customer Represents a customer object, already existing, to be added
     *
     */
    /*
        (EXCEPTIONAL CASES)
            -Customer passed is null
    */
    public void insert(Customer customer){

    }

    /**
     * Takes care of creating a new customer object and then add it in this manager
     * @param name Represents the customer's name
     * @param surname Represents the customer's surname
     * @param address Represents the customer's address
     * @param fiscalCode Represents the customer's fiscalCode
     * @param paymentType Represents the type of payment a customer has
     *
     */
    /*
        (EXCEPTIONAL CASES)
            -At least 1 param passed is null
    */
    public void insert(String name, String surname, String address, String fiscalCode, PaymentType paymentType){

    }

    /**
     * Takes care of modifying the name, surname and fiscal code of the customer given
     * @param customer Customer object that will be modified
     * @param newName The new name of the customer
     * @param newSurname The new surname of the customer
     * @param newFiscalCode The new fiscal code of the customer
     * @throws  NullPointerException  when customer is null or one of the parameters is null
     */
    /*
        (EXCEPTIONAL CASES)
            -Customer is null or not in this manager
            -At least 1 param passed is null (except of customer)
    */
    public void modify(Customer customer,String newName,String newSurname,String newFiscalCode){


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

    /**
     * Takes care of removing the customer given
     * @param customer Customer object that will be removed
     */
    /*
        (EXCEPTIONAL CASES)
            -Customer is null
            -Customer doesn't exist
    */
    public void remove(Customer customer){

    }


}
