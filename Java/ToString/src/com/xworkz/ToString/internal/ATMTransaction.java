package com.xworkz.ToString.internal;

public class ATMTransaction {
    private String transactionId;
    private String type;
    private double amount;


    public ATMTransaction(String transactionId, String type, double amount) {
        this.transactionId = transactionId;
        this.type = type;
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "Transaction: " + transactionId + ", Type: " + type + ", Amount: ₹" + amount;
    }

    @Override
    public int hashCode(){
        return 4;
    }

    @Override
    public boolean equals(Object object) {
        if (object != null) {
            if (object instanceof ATMTransaction) {
                ATMTransaction other = (ATMTransaction) object;
                if (this.transactionId.equals(other.transactionId) &&
                        this.type.equals(other.type) &&
                        this.amount == other.amount) {
                    return true;
                }
            }
        }
        return false;
    }
}

    // Runner
