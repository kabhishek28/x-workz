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

    @Override
    public int hashCode(){
        return 4;
    }

    @Override
    public boolean equals(Object object) {
        if (object != null) {
            if (object instanceof Customer) {
                Customer other = (Customer) object;
                if (this.name.equals(other.name) &&
                        this.email.equals(other.email) ) {
                    return true;
                }
            }
        }
        return false;
    }
}
