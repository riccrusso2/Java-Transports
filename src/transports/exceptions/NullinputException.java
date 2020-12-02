package transports.exceptions;

/**
 * this class represent an exception due to a null input
 */
public class NullinputException extends Exception{
    private String msg;



    public NullinputException(String msg){
        super(msg);
        this.msg=msg;
    }

}
