package transports.managers;

import transports.domain_entities.Route;
import transports.domain_entities.Truck;
import transports.exceptions.InvalidManagerInput;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * This ADT is used to represent a manager for Truck available
 * @see Truck
 */


public class TrucksManager {
    Collection<Truck> container;

    /**
     *  creates a new instace of a manager of trucks
     *
     */
    public TrucksManager(){

    }

    /**
     * Checks if the truck provided exists in this manager
     * @param truck The truck to search in this manager
     * @return true - if is in this manager, false - otherwise
     */
    private boolean existsTruck(Truck truck){
        return false;
    }



    /**
     * Takes care of adding a truck,already instantiaded, in this manager
     * @param truck Represents a truck object, already instantiated, to be added
     *@throws InvalidManagerInput  truck passed is null or already in
     */

    public void insert(Truck truck){

    }



    /**
     * Takes care of removing the truck given
     * @param  truck  Truck object that will be removed from this manager
     * @throws InvalidManagerInput  truck passed is null or doesn't exist
     */

    public void remove(Truck truck){


    }


    /**
     *it is based on the private  iterator method
     * @param n is the number of trucks you want
     * @return arrayList that contain n trucks you want
     *
     */
    public ArrayList<Truck> getTrucksSupported(int n){

    }

    /**
     * @return a standard iterator over the good of this collection
     */
    private Iterator<Truck> iterator(){
        Iterator res= new Iterator(this.container);
        return res;

    }

}
