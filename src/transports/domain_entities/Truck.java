package transports.domain_entities;

import transports.exceptions.InvalidCapacityException;
import transports.exceptions.NullinputException;

import java.util.Collection;

/**
 * This ADT represents a truck supported for transports
 */
public class Truck {

    private String plate;
    private double capacity;
    private Collection<Good> goodsSupported;

    /**
     * Instances a new truck available for transports with a plate,
     * a capacity and a collection of goods supported by it
     *
     * @param plate The plate of the truck
     * @param capacity The max capacity of the truck
     * @param goodsSupported The collection of goods supported by the truck
     *
     * @throws NullinputException if at least one of the parameters is null
     * @throws InvalidCapacityException if capacity is less equal than 0
     */
    public Truck(String plate, double capacity, Collection<Good> goodsSupported) throws NullinputException{

    }

    public Collection<Good> getGoodsSupported(){ return goodsSupported; }

    public String getPlate() {
        return plate;
    }

    public double getCapacity() {
        return capacity;
    }

}
