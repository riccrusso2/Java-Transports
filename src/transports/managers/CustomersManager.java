package transports.managers;

import transports.domain_entities.Customer;

import transports.exceptions.InvalidManagerInput;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

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
    return true;
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
     * @throws InvalidManagerInput   Customer passed is null or already in
     */

    public void insert(Customer customer){

    }



    /**
     * Takes care of removing the customer given
     * @param customer Customer object that will be removed from this manager
     * @throws InvalidManagerInput   customer passed is null or doesn't exist
     */

    public void remove(Customer customer){

    }


    /**
     *it is based on the private  iterator method
     * @param n is the number of customers you want
     * @return arrayList that contain n customer you want
     *
     */
    public ArrayList<Customer> getCustomersSupported(int n){

    }

    /**
     * @return a standard iterator over the good of this collection
     */
    private Iterator<Customer> iterator(){
        Iterator res= new Iterator(this.container);
        return res;

    }


}
