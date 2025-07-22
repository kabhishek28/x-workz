package com.xworkz.object.external;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Watch {

    LocalTime localTime = LocalTime.now();

    DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("HH : mm : ss");
    public void checkTime(){
        System.out.println("Local Time : " + localTime.format(dateTimeFormatter));
    }
}
