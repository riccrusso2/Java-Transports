package transports.exceptions;

/**
 * this class represent an exception due to a null input
 */
public class NullInputException extends Exception{
    private String msg;



    public NullInputException(String msg){
        super(msg);
        this.msg=msg;
    }

}
