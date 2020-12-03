package transports.exceptions;

import transports.domain_entities.*;

import java.util.List;

/**
 * this class represent an exception called when you try to insert a transport and there are no conditions to do it
 * such us the luck of truck for those good and quantities or for that period.
 * or you try to associate a customer with a list of transports not avaiable
 */

public class InputNotAvaiableException extends Exception {
     private List<Route> routes;
     private Good good;
     private double quantities;
     private PeriodOccupied period;


    /**
     *Instances an exception that represent the lack of  the route for the transport
     * @param routes Represent the missing route
     */
    public InputNotAvaiableException(List<Route> routes){

     }


    /**
     *Instances an exception that represent the lack of  truck for those good or quantity
     * @param good Represent the goods you wanted to transport
     * @param quantities Represent the quantity of good you wanted to transport
     */
    public InputNotAvaiableException(Good good, double quantities){

    }


    /**
     *Instances an exception that represent the lack of  truck for that period
     * @param periodOccupied Represent the period in which you wanted to do the transport

     */
    public InputNotAvaiableException(PeriodOccupied periodOccupied){

    }


    /**
     *Instances an exception that represent the lack of that Customer for the order
     * @param customer Represent the customer not found

     */

    public InputNotAvaiableException(Customer customer){

    }



    /**
     *Instances an exception that represent the lack of Transports for the order
     * @param ListOfTransport Represent the list of transports not avaiable

     */

    public InputNotAvaiableException(List<Transport> ListOfTransport){

    }



}
