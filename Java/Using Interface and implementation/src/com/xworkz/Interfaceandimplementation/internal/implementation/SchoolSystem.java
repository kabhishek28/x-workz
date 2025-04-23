package com.xworkz.Interfaceandimplementation.internal.implementation;

import com.xworkz.Interfaceandimplementation.internal.rules.ExamPolicy;

public class SchoolSystem implements ExamPolicy {
    @Override
    public void conductExam() {
        System.out.println("School system is conducting exams following board guidelines.");
    }
}