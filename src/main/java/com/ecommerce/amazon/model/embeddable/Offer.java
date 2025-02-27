package com.ecommerce.amazon.model.embeddable;

import lombok.Data;

import java.util.Date;

public class Offer {
    private String name;
    private double discountPercentage;
    private boolean active;
    private Date expiryDate;

    public Offer() {
    }

    public Offer(String name, double discountPercentage, boolean active, Date expiryDate) {
        this.name = name;
        this.discountPercentage = discountPercentage;
        this.active = active;
        this.expiryDate = expiryDate;
    }

    public Date getExpiryDate() {
        return expiryDate;
    }

    public void setExpiryDate(Date expiryDate) {
        this.expiryDate = expiryDate;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getDiscountPercentage() {
        return discountPercentage;
    }

    public void setDiscountPercentage(double discountPercentage) {
        this.discountPercentage = discountPercentage;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }
}
