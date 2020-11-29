package transports.managers;

import transports.domain_entities.Customer;
import transports.exceptions.InvalidManagerInputException;
import transports.exceptions.NullinputException;

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
     * @throws NullPointerException if the input is null
     */
    private boolean existsCustomer(Customer customer)throws NullPointerException{
        return false;
    }




    /**
     * Takes care of adding customer in this manager
     * @param customer Represents a customer object, already existing, to be added
     * @throws InvalidManagerInputException already in this manager
     * @throws NullPointerException if the input is null
     */

    public void insert(Customer customer) throws InvalidManagerInputException,NullPointerException{

    }



    /**
     * Takes care of removing the customer given
     * @param customer Customer object that will be removed from this manager
     * @throws InvalidManagerInputException  if the city doesn't exist
     * @throws NullPointerException if the input is null
     */

    public void remove(Customer customer) throws InvalidManagerInputException,NullinputException{


    }







}
