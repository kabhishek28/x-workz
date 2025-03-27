package com.xworkz.A_relations.external;

import com.xworkz.A_relations.internal.Capacitor;

public class Board {
    private int ipAddress;
    private int modelNumber;

    public void setIpAddress(int ipAddress) {
        this.ipAddress = ipAddress;
    }
    public void setModelNumber(int modelNumber) {
        this.modelNumber = modelNumber;
    }

    public int getIpAddress() {
        return ipAddress;
    }
    public int getModelNumber() {
        return modelNumber;
    }

    public void getCapacitor(Capacitor capacitor){
        capacitor.setPowerConsumption(250);
        capacitor.setCurrentRating(120);
        System.out.println("Power Consumption :"+capacitor.getPowerConsumption());
        System.out.println("Power Current Rating :"+capacitor.getCurrentRating());

    }
}
