package transports.managers;
import transports.domain_entities.Customer;
import transports.enumerators.PaymentType;

import java.util.Collection;
import java.util.List;
import java.util.Objects;

/**
 * this  class contain all the customers avaiable and managed them
 * @see Customer
 */
public class CustomersManager {
    private Collection<Customer> container;


    /**
     * @param customer the customer to search in cointainer
     * @return True if  is in container,False otherwise
     */
    private boolean existCustomer(Customer customer){

    }

    /**
     *  takes care of adding customer in the collection container
     * @param customer is a customer object already existing
     * @throws  NullPointerException when the customer passed is null
     */
    public void insert(Customer customer) throws NullPointerException{

    }

    /**
     * takes care of crating a new object customer and then add it in the collection container
     * @param name represent the customer's name
     * @param surname represent the customer's surname
     * @param address represent the customer's address
     * @param fiscalCode  represent the customer's fiscalCode
     * @param paymentType  represents the type of payment a customer has
     * @throws NullPointerException when at least one of the parameters passed is null
     */

    public void insert(String name, String surname, String address, String fiscalCode, PaymentType paymentType)throws NullPointerException{

    }

    /**
     * takes cares of modifying the name,surname and fiscalcode of the customer given
     * @param customer customer object that will be modified
     * @param newName the new name of the customer
     * @param newSurname the new surname of the customer
     * @param newFiscalcode the new fiscalcode of the customer
     * @throws  NullPointerException  when customer is null or one of the parameters is null
     */
    public void modify(Customer customer,String newName,String newSurname,String newFiscalcode) throws  NullPointerException{


    }

    /**
     * takes cares of modifying the type of payment of the customer given
     * @param customer customer object that will be modified
     * @param paymentType the new type of payment of the customer
     * @throws  NullPointerException  when customer is null or one of the parameters is null
     */
    public void modify(Customer customer,PaymentType paymentType) throws  NullPointerException{


    }

    /**
     * takes cares of modifying the address of the customer given
     * @param customer customer object that will be modified
     * @param newAddress the new address of the customer
     * @throws  NullPointerException  when customer is null or one of the parameters is null
     */
    public void modify(Customer customer,String newAddress)throws NullPointerException{


    }
    /**
    * takes cares of removing the customer given
    * @param customer customer object that will be removed
     * @throws  NullPointerException  when customer is null,or customer doesn't exist in this manager
     */
    public void remove(Customer customer)throws NullPointerException{

    }


}
