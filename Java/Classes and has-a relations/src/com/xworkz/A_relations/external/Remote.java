package com.xworkz.A_relations.external;

import com.xworkz.A_relations.internal.Battery;
import com.xworkz.A_relations.internal.Voltage;

public class Remote {
    private String modeButton;
    private int batteryLevel;

    public void setModeButton(String modeButton) {
        this.modeButton = modeButton;
    }

    public void setBatteryLevel(int batteryLevel) {
        this.batteryLevel = batteryLevel;
    }

    public String getModeButton() {
        return modeButton;
    }

    public int getBatteryLevel() {
        return batteryLevel;
    }

    public  void getBattery(Battery battery, Voltage voltage){
        battery.setBatteryLevel(10);
        battery.setBatteryCapacity("mAh");
        System.out.println("Battery level :"+battery.getBatteryLevel());
        System.out.println("Battery Capacity :"+battery.getBatteryCapacity());
        battery.getVoltage(voltage);

    }



}
