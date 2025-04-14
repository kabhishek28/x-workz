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

    @Override
    public boolean equals(Object object) {
        if (object != null) {
            if (object instanceof LaundryService) {
                LaundryService other = (LaundryService) object;
                if (this.customerName.equals(other.customerName) &&
                        this.clothesCount == other.clothesCount &&
                        this.express == other.express) {
                    return true;
                }
            }
        }
        return false;
    }
}

    // Runner
