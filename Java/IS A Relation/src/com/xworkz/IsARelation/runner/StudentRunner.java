package com.xworkz.IsARelation.runner;

import com.xworkz.IsARelation.external.Student;
import com.xworkz.IsARelation.internal.College;

public class StudentRunner {
    public static void main(String[] args) {
        Student student = new Student();
        student.address();
        student.name();
        student.isVTU();

        System.out.println("-----------------");


        College college = new Student();
        college.address();
        college.name();
        college.isVTU();
    }
}
