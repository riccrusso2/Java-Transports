package transports.domain_entities;
import transports.exceptions.InvalidDateException;
import transports.exceptions.NullinputException;

import java.util.Date;

/**
 * This ADT represents the occupied period by a truck used in a route
 */
public class PeriodOccupied {
    private Truck truck;
    private Date firstDate;
    private Date secondDate;

    /**
     * Instances a occupied period by the truck between the two dates passed.
     * @param truck Represents the truck occupied
     * @param firstDate Represents the date since it is occupied
     * @param secondDate Represents the date until it is occupied
     *
     * @throws InvalidDateException if 2nd date is less than the 1st one
     * @throws NullinputException if at least one of the parameters is null
     */
    public PeriodOccupied(Truck truck, Date firstDate, Date secondDate ) throws NullinputException {
        this.truck = truck;
        this.firstDate = firstDate;
        this.secondDate = secondDate;
    }


    /**
     * Checks if the 2 dates are compatible. In particular
     * if the 1st is less equal than the 2nd one
     * @param date1
     * @param date2
     * @return true - if the 1st date is less equal to the 2nd one
     *
     * @throws InvalidDateException if 2nd date is less than the 1st one
     */
    public boolean areDatesCompatible(Date date1, Date date2) throws InvalidDateException {
        return false;
    }



    /**
     * creates an array containing the two start and end dates of the occupied period
     * @return an array that contain the two dates
     */
    public Date[] getDate() {
        /**Date[] date = new Date[2];
         date[0]= this.firstDate;
         date[1]= this.secondDate;
         return date;*/
        return null;
    }



    public Truck getTruck() {
        return truck;
    }
}
