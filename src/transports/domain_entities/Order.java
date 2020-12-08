package transports.domain_entities;

import transports.exceptions.NullInputException;

import java.util.Iterator;
import java.util.List;

/**
 * This ADT summarizes all the components of an order
 */

public class Order {

    private int nOrder;
    private Customer customer;
    private List<Transport> transportList;


    /**
     *
     * @param nOrder Represents the unique order number
     * @param customer Represents the customer associated with the order
     * @param transports Represent the list of transport associated with the order
     * @throws NullInputException if at least one of the parameters is null
     */

    public Order(int nOrder,Customer customer,List<Transport> transports) throws NullInputException{
        if(transports==null||transports.contains(null)||customer==null||nOrder<=0){
            throw new NullInputException("one of the parameters passed is null");
        }
        this.nOrder=nOrder;
        this.customer=customer;
        this.transportList=transports;


    }

    public int getnOrder() {
        return nOrder;
    }

    public Customer getCustomer() {
        return customer;
    }

    public Iterator<Transport> getTransportList() {
        return transportList.iterator();
    }

    @Override
    public boolean equals(Object order) {
        if(order instanceof Order){
            Order ord = (Order) order;
            return this.getnOrder() == ord.getnOrder();
        }
        return false;
    }
}
