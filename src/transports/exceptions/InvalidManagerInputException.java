package transports.exceptions;

import transports.domain_entities.*;

/**
 * this class represent an exception due to an invalid input in a manager method like
 * input is null
 * input already existing
 * input not found
 */


public class InvalidManagerInputException extends RuntimeException {
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
    public InvalidManagerInputException(City city){
        super("city selected(" + city.toString()+")  is Null , already existing or not found ");
        this.city = city;
    }

    /**
     *
     * @param customer the city that called the exception
     */
    public InvalidManagerInputException(Customer customer){
        super("customer selected(" + customer.toString()+") already existing or not found ");
        this.customer = customer;
    }

    /**
     *
     * @param good the city that called the exception
     */
    public InvalidManagerInputException(Good good){
        super("good selected(" + good.toString()+")  already existing or not found ");
        this.good = good;
    }

    /**
     *
     * @param route the city that called the exception
     */
    public InvalidManagerInputException(Route route){
        super("route selected(" + route.toString()+")   already existing or not found ");
        this.route = route;
    }

    /**
     *
     * @param truck the city that called the exception
     */
    public InvalidManagerInputException(Truck truck){
        super("truck selected(" + truck.toString()+")   already existing or not found ");
        this.truck = truck;
    }


}
