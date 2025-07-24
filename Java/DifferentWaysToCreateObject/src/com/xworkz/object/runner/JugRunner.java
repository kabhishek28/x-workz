package com.xworkz.object.runner;

import com.xworkz.object.external.Jug;

public class JugRunner {
    public static void main(String[] args) {

//        using clone
//        To use clone():
//
// 1. Your class must implement the Cloneable interface.
//
// 2. You must override the clone() method.
//
// 3. You call clone() on an existing object to create a copy.
//        **********************************************
//        We use new for mug1 because we need an existing object to clone from.
//
//clone() doesn't create objects from nothing — it creates a copy of an already existing object.
try{
    Jug jug = new Jug("Red" , 500);
    Jug jug1 = (Jug) jug.clone();

    jug.display();
    jug1.display();

    System.out.println(jug == jug1);
    System.out.println(jug.equals(jug1));
//    by use of geter and seter we can edit
jug1.setColor("pink");
jug1.display();


    System.out.println("Jug 1 : " + jug.hashCode());
    System.out.println("Jug 2 : " + jug1.hashCode());

    System.out.println(jug == jug1);
    System.out.println(jug.equals(jug1));

}catch (Exception e){
    System.out.println(e);
}

    }
}
