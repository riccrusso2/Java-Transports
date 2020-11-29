package transports.managers;


import transports.domain_entities.City;
import transports.exceptions.InvalidManagerInputException;
import transports.exceptions.NullinputException;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * This ADT is used to represent a manager for cities available
 * @see transports.domain_entities.City
 */


public class CitiesManager {
    private Collection<City> container;


    /**
     * Creates a new instance of a manager of cities
     */
    public CitiesManager(){

    }

    /**
     * Checks if a city is present in this manager
     * @param city The city to search in this manager
     * @return true - if is in this manager, false otherwise
     *
     * @throws NullPointerException if the input is null
     */
    private boolean existsCity(City city){
        return false;
    }

    /**
     * Takes care of adding cities in this manager
     * @param city Represents a city object, not present in this manager, to be added
     *
     * @throws InvalidManagerInputException if is already in this manager
     * @throws NullinputException if the input is null
     */
    public void insert(City city){

    }


    /**
     * Takes care of removing the city given
     * @param city City object that will be removed from this manager
     *
     * @throws InvalidManagerInputException if doesn't exist
     * @throws NullinputException if the input is null
     */
    public void remove(City city){

    }
}