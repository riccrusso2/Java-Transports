package transports.domain_entities;

import transports.enumerators.PaymentType;

/**
this class represents the customers who will make an order
 @see PaymentType

 */
public class Customer {
    private String name;
    private String surname;
    private String address;
    private String fiscalCode;
    private PaymentType paymentType;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getFiscalCode() {
        return fiscalCode;
    }

    public void setFiscalCode(String fiscalCode) {
        this.fiscalCode = fiscalCode;
    }

    public PaymentType getPaymentType() {
        return paymentType;
    }

    public void setPaymentType(PaymentType paymentType) {
        this.paymentType = paymentType;
    }

    /**
     * @param name represent the customer's name
     * @param surname represent the customer's surname
     * @param address represent the customer's address
     * @param fiscalCode  represent the customer's fiscalCode
     * @param paymentType  represents the type of payment a customer has
     */
    public Customer(String name, String surname, String address, String fiscalCode, PaymentType paymentType) {
        this.name = name;
        this.surname = surname;
        this.address = address;
        this.fiscalCode = fiscalCode;
        this.paymentType = paymentType;
    }
}

