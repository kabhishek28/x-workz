package com.xworkz.ToString.internal;

public class GymTrainer {
    private String name;
    private int clients;
    private boolean isCertified;

    public GymTrainer(String name, int clients, boolean isCertified) {
        this.name = name;
        this.clients = clients;
        this.isCertified = isCertified;
    }

    @Override
    public String toString() {
        return "Trainer: " + name + ", Clients: " + clients + ", Certified: " + isCertified;
    }
}
