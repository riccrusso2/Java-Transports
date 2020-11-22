package transports.domain_entities;

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
     * @param plate The plate of the truck
     * @param capacity The max capacity of the truck
     * @param goodsSupported The collection of goods supported by the truck
     */
    public Truck(String plate, double capacity, Collection<Good> goodsSupported){

    }


}
