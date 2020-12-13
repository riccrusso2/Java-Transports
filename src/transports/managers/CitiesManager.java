package transports.managers;


import transports.domain_entities.City;
import transports.exceptions.InvalidManagerInputException;
import transports.exceptions.NullInputException;

import java.util.Collection;
import java.util.Vector;

/**
 * This ADT is used to represent a manager for cities available
 * @see transports.domain_entities.City
 */


public class CitiesManager  {
    private Collection<City> container;


    /**
     * Creates a new instance of a manager of cities
     */
    public CitiesManager(){
        this.container= new Vector<City>();

    }

    /**
     * Checks if a city is present in this manager
     * @param city The city to search in this manager
     * @return true - if is in this manager, false otherwise
     *
     * @throws NullInputException if the input is null
     */
    public boolean existsCity(City city)throws NullInputException {
        if (city == null) {
            throw new NullInputException("the parameter passed is null");

        }
        if (this.container.contains(city)) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * Takes care of adding cities in this manager
     * @param city Represents a city object, not present in this manager, to be added
     *
     * @throws InvalidManagerInputException if is already in this manager
     * @throws NullInputException If the input is null
     */
    public void insert(City city)throws NullInputException, InvalidManagerInputException {
        if(existsCity(city)){
            throw new InvalidManagerInputException(city);
        }
        else if(city==null){
            throw new NullInputException("the parameter passed is null");
        }
        else{
            this.container.add(city);
        }

    }


    /**
     * Takes care of removing the city given
     * @param city City object that will be removed from this manager
     *
     * @throws InvalidManagerInputException if doesn't exist
     * @throws NullInputException if the input is null
     */
    public void remove(City city)throws InvalidManagerInputException,NullInputException{
        if(!existsCity(city)){
            throw new InvalidManagerInputException(city);
        }else if(city==null){
            throw new NullInputException("the parameter passed is null");
        }
        else{
            this.container.remove(city);
        }


    }
}