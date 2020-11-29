package transports.domain_entities;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * This ADT represents a truck supported for transports
 *  linked to a Manager of trucks that will take care of manage a group of them
 *  each of truck will be busy for a period and  could contain some goods
 */
public class Truck {

    private String plate;
    private double capacity;
    private Collection<Good> goodsSupported;

    /**
     * Instances a new truck available for transports with a plate,
     * a capacity and a collection of goods supported by it
     * @param plate The plate of the truck
     * @param capacity The max capacity of the truck
     * @param goodsSupported The collection of goods supported by the truck
     */
    public Truck(String plate, double capacity, Collection<Good> goodsSupported){

    }


    public String getPlate() {
        return plate;
    }

    public double getCapacity() {
        return capacity;
    }

    /**
     *it is based on the private  iterator method
     * @return arrayList that contain all the goods supported
     *
     */
    public ArrayList<Good> getGoodsSupported(){

    }

    /**
     * @return a standard iterator over the good of this collection
     */
    private Iterator<Good> iterator(){
        Iterator res= new Iterator(this.goodsSupported);
        return res;

    }

}
