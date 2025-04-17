package com.xworkz.InterfaceandImplentation.internal;

import com.xworkz.InterfaceandImplentation.RulesClass.University;

public class TechUniversity implements University {
    @Override
    public void enrollStudent() {
        System.out.println("Student enrolled at Tech University.");
    }
@Override
    public void conductExam() {
        System.out.println("Exam conducted at Tech University.");
    }
@Override
    public void publishResult() {
        System.out.println("Results published by Tech University.");
    }
}
