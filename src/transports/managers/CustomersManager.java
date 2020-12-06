package transports.managers;

import transports.domain_entities.Customer;
import transports.exceptions.InvalidManagerInputException;
import transports.exceptions.NullInputException;

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
     * Checks if the customer passed is in this manager
     * @param customer The customer to search in this manager
     * @return True if is in this manager, false otherwise
     * @throws NullInputException if the input is null
     */
    public boolean existsCustomer(Customer customer)throws NullInputException {
        return false;
    }




    /**
     * Takes care of adding customer in this manager
     * @param customer Represents a customer object, already existing, to be added
     * @throws InvalidManagerInputException already in this manager
     * @throws NullInputException if the input is null
     */

    public void insert(Customer customer) throws InvalidManagerInputException, NullInputException {

    }



    /**
     * Takes care of removing the customer given
     * @param customer Customer object that will be removed from this manager
     * @throws InvalidManagerInputException  if the city doesn't exist
     * @throws NullInputException if the input is null
     */

    public void remove(Customer customer) throws InvalidManagerInputException, NullInputException {


    }







}
