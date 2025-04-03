package com.xworkz.IsARelation.runner;

import com.xworkz.IsARelation.external.IPhone;

public class IphoneRunner {
    public static void main(String[] args) {
        IPhone iPhone = new IPhone();
        iPhone.call();
        iPhone.message();
        iPhone.charge();
        iPhone.turnOff();
        iPhone.turnOn();
    }
}
