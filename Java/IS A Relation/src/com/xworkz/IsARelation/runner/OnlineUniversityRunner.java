package com.xworkz.IsARelation.runner;

import com.xworkz.IsARelation.external.OnlineUniversity;
import com.xworkz.IsARelation.internal.University;

public class OnlineUniversityRunner {
    public static void main(String[] args) {
        University university = new OnlineUniversity();
        university.enrollStudents();
        university.conductLectures();
        university.conductExams();
        university.issueDegrees();
        university.manageLibrary();
        System.out.println("--------------------");
        OnlineUniversity onlineUniversity = new OnlineUniversity();
        onlineUniversity.enrollStudents();
        onlineUniversity.conductLectures();
        onlineUniversity.conductExams();
        onlineUniversity.issueDegrees();
        onlineUniversity.manageLibrary();
    }
}
