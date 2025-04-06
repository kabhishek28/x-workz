package com.xworkz.IsARelation.external;

import com.xworkz.IsARelation.internal.Phone;

public class IPhone extends Phone {
    public IPhone(){
        System.out.println("zero argument of the const Iphone");
    }

@Override
    public void call() { System.out.println("@Override :Calling someone"); }
    @Override
    public void message() { System.out.println("@Override :Sending a message"); }
    @Override
    public void charge() { System.out.println("@Override :Charging the phone"); }
    @Override
    public void turnOn() { System.out.println("@Override :Turning on the phone"); }
    @Override
    public void turnOff() { System.out.println("@Override :Turning off the phone"); }
}
