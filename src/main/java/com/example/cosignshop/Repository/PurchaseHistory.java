package com.example.cosignshop.Repository;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class PurchaseHistory {
    private int purchaseId;
    private int drugId;
    private int customerId;
    private LocalDateTime purchaseDate;
    private int purchaseQuantity;
    private double totalAmount;

    // Update the constructor to include all relevant fields
    public PurchaseHistory(int purchaseId, int drugId, int customerId, LocalDateTime purchaseDate, int purchaseQuantity, double totalAmount) {
        this.purchaseId = purchaseId;
        this.drugId = drugId;
        this.customerId = customerId;
        this.purchaseDate = purchaseDate;
        this.purchaseQuantity = purchaseQuantity;
        this.totalAmount = totalAmount;
    }
}
