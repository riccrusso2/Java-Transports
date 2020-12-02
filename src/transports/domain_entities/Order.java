package transports.domain_entities;

import java.util.List;

/**
 * This ADT summarizes all the components of an order
 */

public class Order {

    private int nOrder;
    private Customer customer;
    private List<Transport> transportList;

}
