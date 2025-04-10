package com.xworkz.ToString.internal;

public class Customer {
    private String name;
    private String email;
    private boolean isPremium;

    public Customer(String name, String email, boolean isPremium) {
        this.name = name;
        this.email = email;
        this.isPremium = isPremium;
    }

    @Override
    public String toString() {
        return "Customer: " + name + ", Email: " + email + ", Premium: " + isPremium;
    }
}
