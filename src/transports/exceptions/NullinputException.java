package transports.exceptions;

/**
 * this exception is called when the input of a manager method is null
 */

public class NullinputException extends RuntimeException{

    /**
     * this constructor recall the super to create a new instance of this object
     * and print the sentence when the input is null
     */
    public class NullinputException(){
        super("input given is Null");
    }



}
