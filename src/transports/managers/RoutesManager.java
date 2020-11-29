package transports.managers;

import transports.domain_entities.Route;
import transports.exceptions.InvalidManagerInputException;
import transports.exceptions.NullinputException;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * This ADT represents a manager of the routes available for the trucks
 */
public class RoutesManager {
    private Collection<Route> container;

    /**
     * Creates an instance of a routes manager
     */
    public RoutesManager() {

    }


    /**
     * Takes care of adding a new route in this manager, if not present
     * @param route The route that will be added, if not present
     * @throws InvalidManagerInputException if is already in
     * @throws NullPointerException if the input is null
     */
    public void insert(Route route){

    }


    /**
     * Takes care of removing a route already in this manager
     * @param route Route object that will be removed, if present
     * @throws InvalidManagerInputException if doesn't exist
     * @throws NullinputException if the input is null
     */
    public void remove(Route route){

    }

}
