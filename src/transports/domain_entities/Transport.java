package transports.domain_entities;

import transports.exceptions.InvalidDateException;
import transports.exceptions.NullInputException;

import java.util.Iterator;
import java.util.List;
import java.util.Vector;

/**
 * This ADT represents a transport journey planned
 * with a list of routes, an interval of dates and a truck assigned
 * @see Truck
 * @see Route
 */
public class Transport {
    private List<Route> transportRoutes;
    private PeriodOccupied periodOccupied;
    private Good good;
    private double quantity;


    /**
     * @param transportRoutes the list of transport routes
     * @param periodOccupied the period occupied by the transport
     * @param good the good of the transport
     * @param quantity the quantity of the good for the transport
     * @throws NullInputException if at least one of the parameters is null
     *
     */

    public Transport(List<Route> transportRoutes, PeriodOccupied periodOccupied,Good good,Double quantity) throws NullInputException, InvalidDateException {
        if(transportRoutes==null||transportRoutes.contains(null)||periodOccupied==null||good==null||quantity<=0){
            throw new NullInputException("one of the parameters passed is null");
        }

        this.transportRoutes=new Vector<Route>(transportRoutes);
        this.periodOccupied=periodOccupied;
        this.good=good;
        this.quantity=quantity;
    }




    public Iterator<Route> getTransportRoutes() {
        return transportRoutes.iterator();
    }


    public PeriodOccupied getPeriodOccupied() {
        return periodOccupied;
    }



    public Good getGood() {
        return good;
    }


    public double getQuantity() {
        return quantity;
    }



    @Override
    public boolean equals(Object transport) {
        if(transport instanceof Transport){
            Transport transport1 = (Transport) transport;
            if(getPeriodOccupied().equals(transport1.getPeriodOccupied()) && (this.getGood().equals(transport1.getGood())) && (this.getQuantity()==transport1.getQuantity()) && (isSameRoutes(transport1.getTransportRoutes()))){
                return true;
            }
        }
        return false;
    }

    private boolean isSameRoutes(Iterator<Route> routes){
        Iterator<Route> itInputRoutes = routes;
        Iterator<Route> itThisRoutes= getTransportRoutes();
        while(itThisRoutes.hasNext() && itInputRoutes.hasNext()){
            if(!itThisRoutes.next().equals(itInputRoutes.next())){
                return false;
            }
        }
        if(itThisRoutes.hasNext() || itInputRoutes.hasNext()){
            return false;}
        return true;
    }


}
