package com.xworkz.IsARelation.runner;

import com.xworkz.IsARelation.external.SmartPhone;
import com.xworkz.IsARelation.internal.Phone;

public class SmartPhoneRunner {
    public static void main(String[] args) {
        SmartPhone smartPhone = new SmartPhone();
        smartPhone.call();
        smartPhone.charge();
        smartPhone.message();
        smartPhone.turnOff();
        smartPhone.turnOn();
        System.out.println("-----------------");
        Phone phone = new SmartPhone();
        phone.call();
        phone.charge();
        phone.message();
        phone.turnOff();
        phone.turnOn();
    }
}
