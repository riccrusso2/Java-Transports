package transports.domain_entities;

import transports.enumerators.PaymentType;
import transports.exceptions.NullInputException;

/**
 *  This ADT represents a customer of the firm
 *
 *  @see PaymentType
 */
public class Customer {
    private String name;
    private String surname;
    private String address;
    private String fiscalCode;
    private PaymentType paymentType;

    /**
     * Instances a new customer by providing its data
     * @param name Represents the customer's name
     * @param surname Represents the customer's surname
     * @param address Represents the customer's address
     * @param fiscalCode Represents the customer's fiscal code
     * @param paymentType Represents the type of payment selected by customer
     * @throws NullInputException if at least one of the parameters is null
     */
    public Customer(String name, String surname, String address, String fiscalCode, PaymentType paymentType) throws NullInputException {
        if (name == null || surname == null || address == null || fiscalCode == null || paymentType == null){
            throw new NullPointerException("One of the parameters passed is null");
        }
        this.name = name;
        this.surname = surname;
        this.address = address;
        this.fiscalCode = fiscalCode;
        this.paymentType = paymentType;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getAddress() {
        return address;
    }

    public String getFiscalCode() {
        return fiscalCode;
    }

    public PaymentType getPaymentType() {
        return paymentType;
    }

    @Override
    public boolean equals(Object other){
        if(other instanceof Customer) {
            Customer otherCustomer = (Customer) other;
            return this.getFiscalCode().equals(otherCustomer.getFiscalCode());
        }
        return false;
    }
}

