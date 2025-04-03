package com.xworkz.IsARelation.internal;

public class Phone {
    public Phone(){
        System.out.println("no argument const of Phone");
    }

    public void call() { System.out.println("Calling someone"); }
    public void message() { System.out.println("Sending a message"); }
    public void charge() { System.out.println("Charging the phone"); }
    public void turnOn() { System.out.println("Turning on the phone"); }
    public void turnOff() { System.out.println("Turning off the phone"); }
}
