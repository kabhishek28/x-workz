package com.xworkz.IsARelation.external;

import com.xworkz.IsARelation.internal.University;

public class OnlineUniversity extends University {
    public OnlineUniversity() {
        System.out.println("OnlineUniversity Constructor");
    }

@Override
    public void enrollStudents() {
        System.out.println("@Override :University is enrolling students");
    }
    @Override
    public void conductLectures() {
        System.out.println("@Override :University is conducting lectures");
    }
    @Override
    public void conductExams() {
        System.out.println("@Override :University is conducting exams");
    }
    @Override
    public void issueDegrees() {
        System.out.println("@Override :University is issuing degrees");
    }
    @Override
    public void manageLibrary() {
        System.out.println("@Override :University is managing its library");
    }
}