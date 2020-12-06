package transports.domain_entities;

import transports.exceptions.NullInputException;

import java.util.Date;
import java.util.List;

/**
 * This ADT represents a transport journey planned
 * with a list of routes, an interval of dates and a truck assigned
 * @see Truck
 * @see Route
 */
public class Transport {
    private List<Route> transportRoutes;
    private Date dateStart;
    private Date dateEnd;
    private Truck truck;
    private Good good;
    private double quantity;


    /**
     * @param transportRoutes the list of transport routes
     * @param dateStart the date of start of the transport
     * @param dateEnd the date of end of the transport
     * @param truck the truck for the transport
     * @param good the good of the transport
     * @param quantity the quantity of the good for the transport
     * @throws NullInputException if at least one of the parameters is null
     *
     */
    public Transport(List<Route> transportRoutes, Date dateStart, Date dateEnd, Truck truck,Good good,Double quantity){

    }



    public Route[] getTransportRoutes() {
        return null;
    }



    public Date[] getDateStart() {
        return null;
    }



    public Truck getTruck() {
        return truck;
    }


    public Good getGood() {
        return good;
    }


    public double getQuantity() {
        return quantity;
    }
}
