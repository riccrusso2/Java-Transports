package transports.domain_entities;

import transports.enumerators.PaymentType;

/**
 *  This ADT represents a customer of the firm
 *  linked to customerManager that will take care of manage a group of  them
 *  @see PaymentType
 */
public class Customer {
    private String name;
    private String surname;
    private String address;
    private String fiscalCode;
    private PaymentType paymentType;

    /**
     * Instaces a new customer by providing its data
     * @param name Represents the customer's name
     * @param surname Represents the customer's surname
     * @param address Represents the customer's address
     * @param fiscalCode Represents the customer's fiscal code
     * @param paymentType Represents the type of payment selected by customer
     */
    public Customer(String name, String surname, String address, String fiscalCode, PaymentType paymentType) {
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

}

