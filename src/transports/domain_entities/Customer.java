package transports.domain_entities;

import transports.enumerators.PaymentType;

/**
 *  This ADT represents a customer of the firm
 *  @see PaymentType
 */
public class Customer {
    private String name;
    private String surname;
    private String address;
    private String fiscalCode;
    private PaymentType paymentType;

    /**
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

    public void setNameSurnameFiscalcode(String name,String surname,String fiscalCode){
        this.fiscalCode= fiscalCode;
        this.surname= surname;
        this.name= name;
    }

    public String getSurname() {
        return surname;
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

    public PaymentType getPaymentType() {
        return paymentType;
    }

    public void setPaymentType(PaymentType paymentType) {
        this.paymentType = paymentType;
    }
}

