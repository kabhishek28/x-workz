package com.xworkz.IsARelation.runner;

import com.xworkz.IsARelation.external.School;
import com.xworkz.IsARelation.internal.Classs;

public class SchoolRunner {
    public static void main(String[] args) {
        Classs classs = new Classs();
        classs.subject();
        classs.sec();
        classs.noOfStudent();
        System.out.println("------------------");
        School school = new School();
        school.subject();
        school.sec();
        school.noOfStudent();
        System.out.println("------------------");
        Classs aClass = new School();
        aClass.noOfStudent();
        aClass.sec();
        aClass.subject();
    }
}
