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
     * Takes care of adding a new route in this manager
     * @param route The route that will be added
     * @throws InvalidManagerInputException already in
     * @throws NullinputException if the input is null
     */

    public void insert(Route route){

    }

    /**
     * Takes care of removing a route already in this manager
     * @param route Route object that will be removed
     * @throws InvalidManagerInputException doesn't exist
     * @throws NullinputException if the input is null
     */
    public void remove(Route route){

    }


    /**
     *it is based on the private  iterator method
     * @param n is the number of routes you want
     * @return arrayList that contain n routes you want
     *
     */
    public ArrayList<Route> getRoutesSupported(int n){

    }

    /**
     * @return a standard iterator over the good of this collection
     */
    private Iterator<Route> iterator(){
        Iterator res= new Iterator(this.container);
        return res;

    }

}
