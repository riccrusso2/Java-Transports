package transports.managers;
import transports.domain_entities.Customer;

import java.util.Collection;

/**
 * This ADT is used to represent a manager for customers available
 * @see Customer
 */
public class CustomersManager {
    private Collection<Customer> container;


    /**
     * Creates a new instance of a manager of customers
     */
    public CustomersManager(){

    }

    /**
     * @param customer The customer to search in this manager
     * @return True if is in this manager, false otherwise
     */
    private boolean existsCustomer(Customer customer){
        return false;
    }

    /**
     * Takes care of adding customer in this manager
     * @param customer Represents a customer object, already existing, to be added
     *
     */
    /*
        (EXCEPTIONAL CASES)
            -Customer passed is null
            -or is already in
    */
    public void insert(Customer customer){

    }



    /**
     * Takes care of removing the customer given
     * @param customer Customer object that will be removed from this manager
     */
    /*
        (EXCEPTIONAL CASES)
            -Customer is null
            -Customer doesn't exist
    */
    public void remove(Customer customer){

    }


}
