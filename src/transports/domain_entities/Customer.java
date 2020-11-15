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

