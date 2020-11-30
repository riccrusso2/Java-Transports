package transports.exceptions;


import java.util.Date;

/**
 * This class represents an exception due to two incompatible dates
 */
public class InvalidDateException extends RuntimeException {
   private Date firstDate;
   private Date secondDate;

    /**
     * Instances this exception
     * @param firstDate,secondDate The two dates that called the exception
     *
     */
   public InvalidDateException(Date firstDate,Date secondDate ){
       super("second date: " + secondDate.toString() + " is less than the first one : " + firstDate.toString());
       this.firstDate=firstDate;
       this.secondDate=secondDate;
   }
}
