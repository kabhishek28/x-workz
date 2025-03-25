package com.java.xworkz.Alien;

public class InformationRun {
    public static void main(String[] args) {
        Alien alien = new Alien();
        alien.setSeenBy("Suraj");
        alien.setSeenDate("Mar-22-1998");
        alien.setDescribe("An alien is an extraterrestrial being from another world");



        Alien alien1 = new Alien();
        alien1.setSeenBy("Manju");
        alien1.setSeenDate("oct-28-1998");
        alien1.setDescribe("Extraterrestrial");



        Alien alien2 = new Alien();
        alien2.setSeenBy("Deva");
        alien2.setSeenDate("Jun-22-1999");
        alien2.setDescribe("The Biden administration, in a public departure from previous immigration policy");

        Alien[] aliens = {alien,alien1,alien2};

        Information information = new Information();
        information.getAlien(aliens);
    }
}
