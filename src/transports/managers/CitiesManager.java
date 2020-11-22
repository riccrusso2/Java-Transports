package transports.managers;


import transports.domain_entities.City;
import transports.domain_entities.Customer;
import transports.enumerators.PaymentType;

import java.util.Collection;

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
     * @param city The city to search in this manager
     * @return True if is in this manager, false otherwise
     */
    private boolean existsCities(City city){
    }




    /**
     * Takes care of adding cities in this manager
     * @param city Represents a city object, already existing, to be added
     *
     */
    /*
        (EXCEPTIONAL CASES)
            -city passed is null
            -or is already in
    */
    public void insert(City city){

    }




    /**
     * Takes care of creating a new customer object and then add it in this manager
     * @param name  the city's name
     * @param province  the city's province
     * @param cap  the city's cap
     *
     */
    /*
        (EXCEPTIONAL CASES)
            -At least 1 param passed is null
            -or the new city is already in
    */
    public void insert(String name,String province,long cap ){

    }





/*
    /**
     * Takes care of modifying the name, province,cap of a city passed
     * @param city the city that will be modified
     * @param name the new name of the city
     * @param province  the new province of the new city
     * @param cap  the  new cap of the city
     *
     */

        (EXCEPTIONAL CASES)
            -City is null or not in this manager
            -At least 1 param passed is null (except of city)
    */

    /*public void modify(City city,String name,String province,long cap){


    }
    */
     */



    /**
     * Takes care of modifying the name, province,cap of a city passed
     * @param city the city that will be modified
     * @param name the new name of the city
     * @param cap  the  new cap of the city
     *
     */
    /*
      (EXCEPTIONAL CASES)
            -city is null or not in this manager
            -At least 1 param passed is null (except of city)
    */

    public void modify(City city,String name,long cap){


    }




    /**
     * Takes care of removing the city given
     * @param city Customer object that will be removed
     */
    /*
        (EXCEPTIONAL CASES)
            -City is null
            -City doesn't exist
    */

    public void remove(City city){

    }


}


}
