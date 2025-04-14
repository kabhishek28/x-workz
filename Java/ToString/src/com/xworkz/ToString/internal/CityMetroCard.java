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

    @Override
    public boolean equals(Object object) {
        if (object != null) {
            if (object instanceof CityMetroCard) {
                CityMetroCard other = (CityMetroCard) object;
                if (this.cardHolder.equals(other.cardHolder) &&
                        this.balance == other.balance &&
                        this.isActive == other.isActive) {
                    return true;
                }
            }
        }
        return false;
    }
}

    // Runner
