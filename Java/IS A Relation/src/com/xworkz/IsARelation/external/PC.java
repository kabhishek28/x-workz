package com.xworkz.IsARelation.external;

import com.xworkz.IsARelation.internal.Computer;
import com.xworkz.IsARelation.internal.DigitalSystem;

public class PC extends DigitalSystem {
    public PC(){
        System.out.println("zero argument of the PC");
    }
@Override
    public void processBits() {
        System.out.println("@Override :Processing binary data...");
    }
    @Override
    public void storeData() {
        System.out.println("@Override :Storing digital data...");
    }
    @Override
    public void transmitSignal() {
        System.out.println("@Override :Transmitting digital signal...");
    }
    @Override
    public void receiveInput() {
        System.out.println("@Override :Receiving input from devices...");
    }
    @Override
    public void generateOutput() {
        System.out.println("@Override :Generating output for user...");
    }
}
