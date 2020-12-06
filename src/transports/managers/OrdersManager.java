package transports.managers;

import transports.domain_entities.Order;
import transports.exceptions.InvalidManagerInputException;
import transports.exceptions.NullInputException;
import transports.exceptions.InputNotAvaiableException;
import java.util.Collection;

/**
 *  This ADT is used to represent a manager for orders available
  * @see Order
 */

public class OrdersManager {

    private Collection<Order> container;
    private CustomersManager customersManager;
    private TransportsManager transportsManager;


    /**
     * creates a new instance of manager of orders
     * @param customersManager the manager of the customers
     * @param transportsManager the manager of the transports
     * @throws NullInputException at least one of the parameters is null
     */
    public OrdersManager(CustomersManager customersManager,TransportsManager transportsManager){

    }

    /**
     * Checks if the Order provided exists in this manager
     * @param order The order to search in this manager
     * @return true - if the Norder is in this manager, false - otherwise
     * @throws NullInputException if the input is null
     *
     */
    public boolean existsOrder(Order order){
        return false;
    }



    /**
     * Takes care of adding an order in this manager, if not present
     * @throws InvalidManagerInputException If the Norder is already in
     * @throws NullInputException If the input is null
     * @throws  InputNotAvaiableException if the customer  associated with the order is not avaiable
     *                                    if at least one of  the transports associated  is not avaiable
     *
     */

    public void insert(Order order){

    }



    /**
     * Takes care of removing the order given
     * @param  order  order object that will be removed from this manager
     * @throws InvalidManagerInputException  If the Number  of the order passed doesn't exist
     * @throws NullInputException If the input is null
     */

    public void remove(Order order){


    }






}
