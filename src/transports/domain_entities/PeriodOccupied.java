package transports.domain_entities;

import java.util.Date;

/**
 * this class represent the period occupied by trucks in a route
 */
public class PeriodOccupied {
    private Truck truck;
    private Date firstDate;
    private Date secondDate;

    /**
     * this constructor instance a period occupied by the truck between the two dates passed and linke
     * @param truck represent the truck occupied
     * @param firstDate represent the date since it is occupied
     * @param secondDate represent the date until it is occupied
     */
    public PeriodOccupied(Truck truck, Date firstDate,Date secondDate ) {
        this.truck = truck;
        this.firstDate= firstDate;
        this.secondDate= secondDate;
    }

    public Truck getTruck() {
        return truck;
    }


    /**
     * creates an array containing the two start and end dates of the occupied period
     * @return an array that contain the two dates
     */
    public int[] getDate() {
       /**Date[] date = new Date[2];
       date[0]= this.firstDate;
       date[1]= this.secondDate;
       return date;*/

    }

}
