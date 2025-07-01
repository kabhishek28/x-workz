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
}

    // Runner
