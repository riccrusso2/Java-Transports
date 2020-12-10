package transports.domain_entities;
import transports.exceptions.InvalidDateException;
import transports.exceptions.NullInputException;

import java.util.Arrays;
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
     * @throws NullInputException if at least one of the parameters is null
     */
    public PeriodOccupied(Truck truck, Date firstDate, Date secondDate ) throws NullInputException, InvalidDateException {
        if(truck == null || firstDate == null || secondDate == null){
            throw new NullInputException("One of the inputs passed is null");
        }
        areDatesCompatible(firstDate, secondDate);
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
    private boolean areDatesCompatible(Date date1, Date date2) throws InvalidDateException {
        if(date2.before(date1)){
            throw new InvalidDateException(date1, date2);
        }
        return true;
    }

    /**
     * creates an array containing the two start and end dates of the occupied period
     * @return an array that contain the two dates
     */
    public Date[] getDates() {
        Date[] date = new Date[2];
        date[0]= this.firstDate;
        date[1]= this.secondDate;
        return date;
    }

    public Truck getTruck() {
        return truck;
    }

    public boolean containsPeriod(PeriodOccupied otherPeriod) {
        Date otherDateFirst = otherPeriod.getDates()[0];
        Date otherDateSecond = otherPeriod.getDates()[1];
        Date dateFirst = getDates()[0];
        Date dateSecond = getDates()[1];

        if(dateFirst.before(otherDateFirst) && dateSecond.after(otherDateSecond)){
            return true;
        }
        if(otherDateFirst.after(dateFirst) && otherDateFirst.before(dateSecond)) {
            return true;
        }
        if(otherDateSecond.after(dateFirst) && otherDateSecond.before(dateSecond)) {
            return true;
        }
        return false;
    }

    @Override
    public boolean equals(Object other){
        if(other instanceof PeriodOccupied){
            if(this == other)
                return true;
            PeriodOccupied otherPeriod = (PeriodOccupied) other;
            return Arrays.equals(this.getDates(), otherPeriod.getDates()) && this.getTruck().equals(otherPeriod.getTruck());
        }
        return false;
    }
}
