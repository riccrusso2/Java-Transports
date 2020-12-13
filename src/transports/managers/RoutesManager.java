package transports.managers;

import transports.domain_entities.City;
import transports.domain_entities.Customer;
import transports.domain_entities.Route;
import transports.exceptions.InvalidManagerInputException;
import transports.exceptions.NullInputException;
import transports.exceptions.InputNotAvaiableException;
import java.math.*;

import java.time.Duration;
import java.util.*;

/**
 * This ADT represents a manager of the routes available for the trucks
 */
public class RoutesManager {
    private Collection<Route> container;
    private CitiesManager citiesManager;

    /**
     * Creates an instance of a routes manager
     * @param citiesManager The manager of cities
     * @throws NullInputException if the parameter is null
     */
    public RoutesManager(CitiesManager citiesManager) throws NullInputException {
        if(citiesManager == null)
            throw new NullInputException("The manager passed is null");
        this.container = new Vector<Route>();
        this.citiesManager = citiesManager;
    }

    private Collection<Route> getContainer() {
        return this.container;
    }


    /**
     * Takes care of adding a new route in this manager, if not present
     * @param route The route that will be added, if not present
     * @throws InvalidManagerInputException if is already in
     * @throws NullInputException if the input is null
     * @throws InputNotAvaiableException if at least one city in route is not present in the manager of cities
     */
    public void insert(Route route) throws InvalidManagerInputException, NullInputException, InputNotAvaiableException{
        if(route == null)
            throw new NullInputException("The route passed is null");
        if(existRoute(route))
            throw new InvalidManagerInputException(route);

        Iterator<City> itCities = route.getCities();
        List<City> cities = new ArrayList<City>();
        while (itCities.hasNext()) {
            City currCity = itCities.next();
            if(!this.citiesManager.existsCity(currCity)){
                throw new InputNotAvaiableException(currCity);
            }
            cities.add(currCity);
        }

        Duration duration = route.getDuration();
        Collections.reverse(cities);
        Route reverse = new Route(cities, (int)Math.floor(duration.toSeconds()/86400), (int)Math.floor(duration.toSeconds()/3600), (int)Math.floor(duration.toSeconds()/60));

        getContainer().add(route);
        getContainer().add(reverse);
    }


    /**
     * Takes care of removing a route already in this manager
     * @param route Route object that will be removed, if present
     * @throws InvalidManagerInputException if doesn't exist
     * @throws NullInputException if the input is null
     */
    public void remove(Route route) throws NullInputException, InputNotAvaiableException {
        if(route == null)
            throw new NullInputException("The route passed is null");
        if(!existRoute(route))
            throw new InputNotAvaiableException(route);

        getContainer().remove(route);
    }



    /**
     * check if  the route  passed is present in this manager
     *
     * @param route the route to search in this manager
     * @return True if the route  is in this manager, false otherwise
     * @throws NullInputException if the input is null
     */
    public  boolean existRoute(Route route)throws NullInputException {
        if(route == null)
            throw new NullInputException("The route passed is null");

        return getContainer().contains(route);
    }

}
