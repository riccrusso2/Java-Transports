package transports.domain_entities;

import transports.exceptions.InvalidCapacityException;
import transports.exceptions.NullInputException;

import java.util.Collection;
import java.util.Iterator;
import java.util.Objects;
import java.util.Vector;

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
     * @throws NullInputException if at least one of the parameters is null
     * @throws InvalidCapacityException if capacity is less equal than 0
     */
    public Truck(String plate, double capacity, Collection<Good> goodsSupported) throws NullInputException {
        if(plate == null || capacity <= 0 || goodsSupported == null)
            throw new NullInputException("One of the inputs passed is null");
        this.plate = plate;
        this.capacity = capacity;
        this.goodsSupported = new Vector<Good>(goodsSupported);
    }

    public Iterator<Good> getGoodsSupported(){ return goodsSupported.iterator(); }

    public String getPlate() {
        return plate;
    }

    public double getCapacity() {
        return capacity;
    }

    @Override
    public boolean equals(Object other) {
        if (other instanceof Truck){
            if(this == other)
                return true;
            Truck otherTruck = (Truck) other;
            return  this.getPlate().equals(otherTruck.getPlate()) &&
                    this.getCapacity() == otherTruck.getCapacity() &&
                    isSameGoods(otherTruck.getGoodsSupported());
        }
        return false;
    }

    private boolean isSameGoods(Iterator<Good> goods) {
        Iterator<Good> itThisGoods = this.getGoodsSupported();
        while(itThisGoods.hasNext() && goods.hasNext()) {
            if(!itThisGoods.next().equals(itThisGoods.next()))
                return false;
        }
        if(itThisGoods.hasNext() || goods.hasNext())
            return false;
        return true;
    }
}
