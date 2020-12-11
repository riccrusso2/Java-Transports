package transports.exceptions;

import transports.domain_entities.*;

/**
 * this class represent an exception called when you try to insert a transport and there are no conditions to do it
 * such us the luck of truck for those good and quantities or for that period.
 * or you try to associate a customer with a list of transports not avaiable
 */

public class InputNotAvaiableException extends Exception {
     private Route route;
     private Good good;
     private Transport transport;
     private PeriodOccupied period;
     private Customer customer;


    /**
     *Instances an exception that represent the lack of  the route for the transport
     * @param route Represent the missing route
     */
    public InputNotAvaiableException(Route route){

        super("this "+ route.toString() + " is not avaiable for the transport" );
        this.route= route;

     }


    /**
     *Instances an exception that represent the lack of  truck for those good or quantity
     * @param good Represent the goods you wanted to transport
     */
    public InputNotAvaiableException(Good good){
        super("this "+ good.toString() + " is not avaiable for the transport" );
        this.good= good;
    }


    /**
     *Instances an exception that represent the lack of  truck for that period
     * @param periodOccupied Represent the period in which you wanted to do the transport

     */
    public InputNotAvaiableException(PeriodOccupied periodOccupied){
        super("this "+ periodOccupied.toString() + " is not avaiable for the transport" );
        this.period=periodOccupied;
    }


    /**
     *Instances an exception that represent the lack of that Customer for the order
     * @param customer Represent the customer not found

     */

    public InputNotAvaiableException(Customer customer){
        super("this "+ customer.toString() + " is not avaiable for the transport" );
        this.customer=customer;
    }



    /**
     *Instances an exception that represent the lack of Transports for the order
     * @param transport Represent the transports not avaiable

     */

    public InputNotAvaiableException(Transport transport){
        super("this "+ transport.toString() + " is not avaiable for the transport" );
        this.transport=transport;

    }



}
