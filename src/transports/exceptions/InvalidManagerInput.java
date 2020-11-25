package transports.exceptions;

import transports.domain_entities.*;

/**
 * this class represent an exception due to an invalid input in a manager method like
 * input is null
 * input already existing
 * input not found
 */


public class InvalidManagerInput extends RuntimeException {
     private City city;
     private Customer customer;
     private Good good;
     private Route route;
     private Truck truck;


    /**
     *
     * @param city the city that called the exception
     *
     */
    public InvalidManagerInput(City city){
        super("city selected(" + city.toString()+")  is Null , already existing or not found ");
        this.city = city;
    }

    /**
     *
     * @param customer the city that called the exception
     */
    public InvalidManagerInput(Customer customer){
        super("customer selected(" + customer.toString()+")  is Null , already existing or not found ");
        this.customer = customer;
    }

    /**
     *
     * @param good the city that called the exception
     */
    public InvalidManagerInput(Good good){
        super("good selected(" + good.toString()+")  is Null , already existing or not found ");
        this.good = good;
    }

    /**
     *
     * @param route the city that called the exception
     */
    public InvalidManagerInput(Route route){
        super("route selected(" + route.toString()+")  is Null , already existing or not found ");
        this.route = route;
    }

    /**
     *
     * @param truck the city that called the exception
     */
    public InvalidManagerInput(Truck truck){
        super("truck selected(" + truck.toString()+")  is Null , already existing or not found ");
        this.truck = truck;
    }


}
