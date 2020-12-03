package transports.managers;

import transports.domain_entities.Order;
import transports.exceptions.InvalidManagerInputException;
import transports.exceptions.NullinputException;
import transports.exceptions.InputNotAvaiableException;
import java.util.Collection;

/**
 *  This ADT is used to represent a manager for orders available
  * @see Order
 */

public class OrdersManager {

    Collection<Order> container;
    CustomersManager customersManager;
    TransportsManager transportsManager;


    /**
     * creates a new instance of manager of orders
     */
    public OrdersManager(CustomersManager customersManager,TransportsManager transportsManager){

    }

    /**
     * Checks if the Order provided exists in this manager
     * @param order The order to search in this manager
     * @return true - if the Norder is in this manager, false - otherwise
     * @throws NullinputException if the input is null
     *
     */
    private boolean existsOrder(Order order){
        return false;
    }



    /**
     * brefore inserting  the order orders you have to check if
     * the customer passed is avaiable
     * the list of transports is avaiable
     * @throws InvalidManagerInputException If the Norder is already in
     * @throws NullinputException If the input is null
     * @throws  InputNotAvaiableException if the customer or the list of transport associated with the order are not avaiable
     */

    public void insert(Order order){

    }



    /**
     * Takes care of removing the order given
     * @param  order  order object that will be removed from this manager
     * @throws InvalidManagerInputException  If the Norder of the order passed doesn't exist
     * @throws NullinputException If the input is null
     */

    public void remove(Order order){


    }






}
