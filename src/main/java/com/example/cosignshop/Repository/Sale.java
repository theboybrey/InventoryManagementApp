package com.example.cosignshop.Repository;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Sale {
    private int saleId;
    private int drugId;
    private LocalDateTime saleDate;
    private int saleQuantity;


    public Sale(int saleId, int drugId, LocalDateTime saleDate, int saleQuantity) {
        this.saleId = saleId;
        this.drugId = drugId;
        this.saleDate = saleDate;
        this.saleQuantity = saleQuantity;
    }
}
