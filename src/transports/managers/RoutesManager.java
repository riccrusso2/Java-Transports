package transports.managers;

import transports.domain_entities.Route;
import transports.exceptions.InvalidManagerInputException;
import transports.exceptions.NullInputException;
import  transports.exceptions.InputNotAvaiableException;
import java.util.Collection;

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
    public RoutesManager(CitiesManager citiesManager) {

    }


    /**
     * Takes care of adding a new route in this manager, if not present
     * @param route The route that will be added, if not present
     * @throws InvalidManagerInputException if is already in
     * @throws NullInputException if the input is null
     * @throws InputNotAvaiableException if at least one city in route is not present in the manager of cities
     */
    public void insert(Route route){
        //TODO: Se inserisco da s -> t automaticamente inserisco anche il contrario
    }


    /**
     * Takes care of removing a route already in this manager
     * @param route Route object that will be removed, if present
     * @throws InvalidManagerInputException if doesn't exist
     * @throws NullInputException if the input is null
     */
    public void remove(Route route){

    }



    /**
     * check if  the route  passed is present in this manager
     *
     * @param route the route to search in this manager
     * @return True if the route  is in this manager, false otherwise
     * @throws NullInputException if the input is null
     */
    public  boolean existRoute(Route route)throws NullInputException {
        return false;
    }

}
