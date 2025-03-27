package com.xworkz.A_relations.internal;

public class Voltage {
    private int chargingVoltage;
    private int currentVoltage;
    public void setCurrentVoltage(int currentVoltage) {
        this.currentVoltage = currentVoltage;
    }
    public void setChargingVoltage(int chargingVoltage) {
        this.chargingVoltage = chargingVoltage;
    }
    public int getCurrentVoltage() {
        return currentVoltage;
    }
    public int getChargingVoltage() {
        return chargingVoltage;
    }
}
