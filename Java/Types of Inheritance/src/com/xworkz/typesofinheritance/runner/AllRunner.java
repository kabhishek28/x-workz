package com.xworkz.typesofinheritance.runner;

import com.xworkz.typesofinheritance.Hierarchical.external.*;
import com.xworkz.typesofinheritance.MultiLevel.external.*;
import com.xworkz.typesofinheritance.SingleLevel.external.*;

public class AllRunner {
    public static <Notebook> void main(String[] args) {
        System.out.println("----------Single level Inheritance-----------------");
        System.out.println("******|1|********");
        Car car = new Car();
        car.start();
        car.drive();
        System.out.println("******|2|********");
        Guitar guitar = new Guitar();
        guitar.play();
        guitar.strum();
        System.out.println("******|3|********");
        Chef chef = new Chef();
        chef.boil();
        chef.cook();
        System.out.println("******|4|********");
        Chemist chemist = new Chemist();
        chemist.experiment();
        chemist.analyze();
        System.out.println("******|5|********");
        Country country = new Country();
        country.describe();
        country.showCapital();
        System.out.println("******|6|********");
        Airplane airplane = new Airplane();
        airplane.schedule();
        airplane.fly();
        System.out.println("******|7|********");
        Doctor doctor = new Doctor();
        doctor.admit();
        doctor.treat();
        System.out.println("******|8|********");
        Football football = new Football();
        football.start();
        football.scoreGoal();
        System.out.println("******|9|********");
        Painter painter = new Painter();
        painter.draw();
        painter.paint();
        System.out.println("******|10|********");
        Submarine submarine = new Submarine();
        submarine.sail();
        submarine.dive();
        System.out.println("******|11|********");
        Laptop laptop = new Laptop();
        laptop.boot();
        laptop.fold();



        System.out.println("----------Hierarchical Inheritance-----------------");

        System.out.println("******|1|********");
        Brush brush = new Brush();
        brush.stroke();
        brush.smoothStroke();

        System.out.println("******|2|********");
        Marker marker = new Marker();
        marker.stroke();
        marker.boldLine();

        System.out.println("******|3|********");
        SavingsAccount savings = new SavingsAccount();
        savings.deposit();
        savings.interest();

        System.out.println("******|4|********");
        CheckingAccount checking = new CheckingAccount();
        checking.deposit();
        checking.withdraw();

        System.out.println("******|5|********");
        Dog dog = new Dog();
        dog.sound();
        dog.bark();

        System.out.println("******|6|********");
        Cat cat = new Cat();
        cat.sound();
        cat.meow();

        System.out.println("******|7|********");
        Manager manager = new Manager();
        manager.work();
        manager.plan();

        System.out.println("******|8|********");
        Engineer engineer = new Engineer();
        engineer.work();
        engineer.code();



        System.out.println("******|9|********");
        WashingMachine wm = new WashingMachine();
        wm.powerOn();
        wm.wash();

        System.out.println("******|10|********");
        Microwave mw = new Microwave();
        mw.powerOn();
        mw.heat();

        System.out.println("******|11|********");
        Flute flute = new Flute();
        flute.play();
        flute.playMelody();

        System.out.println("******|12|********");
        Drum drum = new Drum();
        drum.play();
        drum.beatRhythm();

        System.out.println("******|13|********");
        SmartPhone phone = new SmartPhone();
        phone.powerOn();
        phone.call();

        System.out.println("******|14|********");
        SmartWatch watch = new SmartWatch();
        watch.powerOn();
        watch.trackFitness();

        System.out.println("******|15|********");
        House house = new House();
        house.openDoor();
        house.welcome();

        System.out.println("******|16|********");
        School school = new School();
        school.openDoor();
        school.ringBell();

        System.out.println("******|17|********");
        TextBook textbook = new TextBook ();
        textbook.read();
        textbook.study();

        System.out.println("******|18|********");
        NoteBook notebook = new NoteBook();
        notebook.read();
        notebook.write();

        System.out.println("******|19|********");
        Apple apple = new Apple();
        apple.taste();
        apple.crunch();

        System.out.println("******|20|********");
        Banana banana = new Banana();
        banana.taste();
        banana.peel();




        System.out.println("----------Multi-Level Inheritance -----------------");

        System.out.println("******|1|********");
        MilkyWay milkyWay = new MilkyWay();
        milkyWay.expand();
        milkyWay.shine();
        milkyWay.rotate();

        System.out.println("******|2|********");
        Jazz jazz = new Jazz();
        jazz.createSound();
        jazz.identifyStyle();
        jazz.playImprovisation();

        System.out.println("******|3|********");
        Ganga ganga = new Ganga();
        ganga.containWater();
        ganga.flow();
        ganga.purify();

        System.out.println("******|4|********");
        CommunicationSatellite cs = new CommunicationSatellite();
        cs.launch();
        cs.orbit();
        cs.transmitSignal();

        System.out.println("******|5|********");
        SouthIndian dosa = new SouthIndian();
        dosa.serve();
        dosa.spice();
        dosa.makeDosa();

        System.out.println("******|6|********");
        Thunderstorm storm = new Thunderstorm();
        storm.measureTemperature();
        storm.causeRainfall();
        storm.strikeLightning();

        System.out.println("******|7|********");
        Saree saree = new Saree();
        saree.wear();
        saree.fold();
        saree.drape();

        System.out.println("******|8|********");
        BulletTrain bt = new BulletTrain();
        bt.fuelUp();
        bt.chug();
        bt.goFast();

        System.out.println("******|9|********");
        Skyscraper sky = new Skyscraper();
        sky.support();
        sky.provideShelter();
        sky.reachSky();

        System.out.println("******|10|********");
        Infantry inf = new Infantry();
        inf.protect();
        inf.march();
        inf.fightOnGround();

        System.out.println("******|11|********");
        Goldfish goldfish = new Goldfish();
        goldfish.swim();
        goldfish.breatheUnderwater();
        goldfish.glow();
    }
    }



