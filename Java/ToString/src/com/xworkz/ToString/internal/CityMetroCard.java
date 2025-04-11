package com.xworkz.ToString.internal;

public class CityMetroCard {
    private String cardHolder;
    private int balance;
    private boolean isActive;

    public CityMetroCard(String cardHolder, int balance, boolean isActive) {
        this.cardHolder = cardHolder;
        this.balance = balance;
        this.isActive = isActive;
    }

    @Override
    public String toString() {
        return "Card Holder: " + cardHolder + ", Balance: ₹" + balance + ", Active: " + isActive;
    }

    @Override
    public int hashCode(){
        return 4;
    }
}

    // Runner
