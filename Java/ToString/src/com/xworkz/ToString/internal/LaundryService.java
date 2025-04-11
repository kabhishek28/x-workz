package com.xworkz.ToString.internal;

public class LaundryService {
    private String customerName;
    private int clothesCount;
    private boolean express;

    public LaundryService(String customerName, int clothesCount, boolean express) {
        this.customerName = customerName;
        this.clothesCount = clothesCount;
        this.express = express;
    }

    @Override
    public String toString() {
        return "Customer: " + customerName + ", Clothes: " + clothesCount + ", Express: " + express;
    }

    @Override
    public int hashCode(){
        return 4;
    }
}

    // Runner
