package com.xworkz.IsARelation.runner;

import com.xworkz.IsARelation.external.Teacher;
import com.xworkz.IsARelation.internal.Person;

public class TeacherRunner {
    public static void main(String[] args) {
        Person person = new Teacher();
        person.edu();
        person.name();
        person.percentage();
        person.UG();
        person.PG();

        System.out.println("---------------");

        Teacher teacher = new Teacher();
        teacher.edu();
        teacher.name();
        teacher.percentage();
        teacher.PG();
        teacher.UG();
    }
}
