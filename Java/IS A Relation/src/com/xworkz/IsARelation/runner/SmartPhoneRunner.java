package com.xworkz.IsARelation.runner;

import com.xworkz.IsARelation.external.SmartPhone;
import com.xworkz.IsARelation.internal.Gadget;
import com.xworkz.IsARelation.internal.Phone;

public class SmartPhoneRunner {
    public static void main(String[] args) {

        Gadget gadget = new Gadget();
        gadget.connectToOtherDevice();
        gadget.displayInfo();
        gadget.performFunction();
        gadget.powerOff();
        gadget.powerOn();
        System.out.println("--------------");

        Gadget gadget1 = new SmartPhone();
        gadget1.connectToOtherDevice();
        gadget1.displayInfo();
        gadget1.performFunction();
        gadget1.powerOff();
        gadget1.powerOn();
        System.out.println("--------------");


        SmartPhone smartPhone = new SmartPhone();
        smartPhone.connectToOtherDevice();
        smartPhone.displayInfo();
        smartPhone.performFunction();
        smartPhone.powerOff();
        smartPhone.powerOn();
        System.out.println("--------------");

    }
}
