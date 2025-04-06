package com.xworkz.IsARelation.runner;

import com.xworkz.IsARelation.external.PC;
import com.xworkz.IsARelation.internal.DigitalSystem;

public class PCRunner {
    public static void main(String[] args) {
        DigitalSystem digitalSystem = new DigitalSystem();
        digitalSystem.generateOutput();
        digitalSystem.processBits();
        digitalSystem.receiveInput();
        digitalSystem.transmitSignal();
        digitalSystem.storeData();
        System.out.println("-----------------");
        DigitalSystem digitalSystem1 = new PC();
        digitalSystem1.generateOutput();
        digitalSystem1.processBits();
        digitalSystem1.receiveInput();
        digitalSystem1.transmitSignal();
        digitalSystem1.storeData();
        System.out.println("-----------------");
        PC pc = new PC();
        pc.generateOutput();
        pc.processBits();
        pc.receiveInput();
        pc.transmitSignal();
        pc.storeData();
        System.out.println("-----------------");




    }
}
