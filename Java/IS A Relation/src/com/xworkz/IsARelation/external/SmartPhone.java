package com.xworkz.IsARelation.external;

import com.xworkz.IsARelation.internal.Gadget;
import com.xworkz.IsARelation.internal.Phone;

public class SmartPhone extends Gadget {
    public SmartPhone(){
        System.out.println("no argument const of SmartPhone");
    }


@Override
    public void powerOn() {
        System.out.println("@Override :Powering on the gadget...");
    }
    @Override
    public void powerOff() {
        System.out.println("@Override :Powering off the gadget...");
    }
    @Override
    public void performFunction() {
        System.out.println("@Override :Gadget is performing its function...");
    }
    @Override
    public void connectToOtherDevice() {
        System.out.println("@Override :Connecting gadget to another device...");
    }
    @Override
    public void displayInfo() {
        System.out.println("@Override :Displaying gadget information...");
    }
}
