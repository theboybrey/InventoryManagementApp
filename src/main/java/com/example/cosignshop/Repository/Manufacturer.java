package com.example.cosignshop.Repository;

public class Manufacturer {
    String producerName;
    String location;
    String telephone;


    public void setProducerName(String producerName) {
        this.producerName = producerName;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getProducerName() {
        return producerName;
    }


    public String getLocation() {
        return location;
    }


    public String getTelephone() {
        return telephone;
    }
}
