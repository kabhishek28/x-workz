package com.xworkz.A_relations.internal;

public class Battery {
    private String batteryCapacity;
    private int batteryLevel;

    public void setBatteryLevel(int batteryLevel) {
        this.batteryLevel = batteryLevel;
    }

    public void setBatteryCapacity(String batteryCapacity) {
        this.batteryCapacity = batteryCapacity;
    }

    public int getBatteryLevel() {
        return batteryLevel;
    }

    public String getBatteryCapacity() {
        return batteryCapacity;
    }

    public void getVoltage( Voltage voltage){
        voltage.setChargingVoltage(250);
        voltage.setCurrentVoltage(220);
        System.out.println("Voltage Charging:"+voltage.getChargingVoltage());
        System.out.println("Voltage Current Voltage:"+voltage.getCurrentVoltage());

    }
}
