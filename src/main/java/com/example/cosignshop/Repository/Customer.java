package com.example.cosignshop.Repository;

public class Customer {
    private int customerId;
    private String customerName;
    private String address;
    private String contactDetails;

    // Update the constructor to include all relevant fields
    public Customer(int customerId, String customerName, String address, String contactDetails) {
        this.customerId = customerId;
        this.customerName = customerName;
        this.address = address;
        this.contactDetails = contactDetails;
    }
}
