package com.xworkz.InterfaceandImplentation.internal;

import com.xworkz.InterfaceandImplentation.RulesClass.ELearningPlatform;

public class OnlineAcademy implements ELearningPlatform {
    @Override
    public void enrollCourse() {
        System.out.println("Online Academy enrolling a new student in a course.");
    }

    @Override
    public void deliverLecture() {
        System.out.println("Online Academy delivering a live lecture.");
    }

    @Override
    public void gradeAssignment() {
        System.out.println("Online Academy grading submitted assignments.");
    }
}