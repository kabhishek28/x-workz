package com.xworkz.IsARelation.runner;

import com.xworkz.IsARelation.external.IPhone;
import com.xworkz.IsARelation.internal.Phone;

public class IphoneRunner {
    public static void main(String[] args) {
        Phone phone = new Phone();
        phone.call();
        phone.message();
        phone.charge();
        phone.turnOff();
        phone.turnOn();
        System.out.println("-----------------");
        Phone phone1 = new IPhone();
        phone1.call();
        phone1.message();
        phone1.charge();
        phone1.turnOff();
        phone1.turnOn();
        System.out.println("----------------------");
        IPhone iPhone = new IPhone();
        iPhone.call();
        iPhone.message();
        iPhone.charge();
        iPhone.turnOff();
        iPhone.turnOn();
    }
}
