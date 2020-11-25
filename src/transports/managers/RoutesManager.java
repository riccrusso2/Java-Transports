package transports.managers;

import transports.domain_entities.Route;

import java.util.Collection;

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
     * Takes care of adding a new route in this manager
     * @param route The route that will be added
     */
    /*
        (EXCEPTIONAL CASES)
            -Route is null
            -or it's already present
     */
    public void insert(Route route){

    }

    /**
     * Takes care of removing a route already in this manager
     * @param route Route object that will be removed
     */
    public void remove(Route route){

    }
}
