package transports.managers;

import transports.domain_entities.Order;
import transports.domain_entities.Transport;
import transports.exceptions.InputNotAvaiableException;
import transports.exceptions.InvalidManagerInputException;
import transports.exceptions.NullInputException;

import java.util.Collection;
import java.util.Iterator;
import java.util.Vector;

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
    public OrdersManager(CustomersManager customersManager,TransportsManager transportsManager)throws NullInputException{
        if(customersManager==null||transportsManager==null){
            throw new NullInputException("one of the parameters passed is null");
        }
        this.container= new Vector<Order>();
        this.customersManager=customersManager;
        this.transportsManager=transportsManager;
    }

    private Collection<Order> getContainer() {
        return container;
    }

    public CustomersManager getCustomersManager() {
        return customersManager;
    }

    public TransportsManager getTransportsManager() {
        return transportsManager;
    }

    /**
     * Checks if the Order provided exists in this manager
     * @param order The order to search in this manager
     * @return true - if the Norder is in this manager, false - otherwise
     * @throws NullInputException if the input is null
     *
     */
    public boolean existsOrder(Order order) throws NullInputException{
        if(order==null){
            throw new NullInputException("the parameter passed is null");
        }
        if(getContainer().contains(order)){
            return true;
        }
        else{
            return false;
        }
    }



    /**
     * Takes care of adding an order in this manager, if not present
     * @throws InvalidManagerInputException If there is an order with the same Norder already in
     * @throws NullInputException If the input is null
     * @throws  InputNotAvaiableException if the customer  associated with the order is not avaiable
     *                                    if at least one of  the transports associated  is not avaiable
     *
     */

    public void insert(Order order)throws InvalidManagerInputException,NullInputException,InputNotAvaiableException{
        if(order==null){
            throw new NullInputException("the parameter passed is null");}

        if(!getCustomersManager().existsCustomer(order.getCustomer())){
            throw new InputNotAvaiableException(order.getCustomer());}

        Iterator<Transport> itTransport= order.getTransportList();
        while(itTransport.hasNext()){
            Transport checkTrasport= itTransport.next();
            if(!getTransportsManager().existsTransport(checkTrasport)){
                throw new InputNotAvaiableException(checkTrasport);
            }
        }

        if(existsOrder(order)){
            throw new InvalidManagerInputException(order);
        }

        getContainer().add(order);
    }



    /**
     * Takes care of removing the order given
     * @param  order  order object that will be removed from this manager
     * @throws InvalidManagerInputException  If the Number of the order passed doesn't exist
     * @throws NullInputException If the input is null
     */

    public void remove(Order order)throws NullInputException,InvalidManagerInputException{
        if(order==null){
            throw new NullInputException("the parameter passed is null"); }
        if(!existsOrder(order)){
            throw new InvalidManagerInputException(order);}
        getContainer().remove(order);
    }
}

