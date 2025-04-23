package com.xworkz.Interfaceandimplementation.internal.implementation;

import com.xworkz.Interfaceandimplementation.internal.rules.CoursePolicy;

public class ELearningPlatform implements CoursePolicy {
    @Override
    public void assignCourse() {
        System.out.println("E-learning platform assigns courses to users.");
    }
}
