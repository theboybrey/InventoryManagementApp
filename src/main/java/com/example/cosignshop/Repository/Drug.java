package com.example.cosignshop.Repository;

import java.time.LocalDate;

public class Drug {
    private int drugId;
    private String drugName;
    private int supplierId;
    private int quantity;
    private double price;
    private LocalDate expirationDate;

    // Update the constructor to include all relevant fields
    public Drug(int drugId, String drugName, int supplierId, int quantity, double price, LocalDate expirationDate) {
        this.drugId = drugId;
        this.drugName = drugName;
        this.supplierId = supplierId;
        this.quantity = quantity;
        this.price = price;
        this.expirationDate = expirationDate;
    }

}
