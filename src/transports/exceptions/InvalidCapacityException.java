package transports.exceptions;

/**
 * this class represent an exception due to a invalid capacity of a truck (less equal than 0)
 *
 */

public class InvalidCapacityException extends RuntimeException {
    private double capacity;


    /**
     * instances a new exception of this type
     * @param capacity represent the capacity that called the exception
     */
    public InvalidCapacityException(double capacity){
        super("the capacity: " + capacity + "needs to be a number strictly greater than 0");
        this.capacity= capacity;
    }
}
