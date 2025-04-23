package com.xworkz.Interfaceandimplementation.external.user;

import com.xworkz.Interfaceandimplementation.internal.rules.CoursePolicy;

public class CourseraCourseImpl {
    private CoursePolicy coursePolicy;

    public CourseraCourseImpl(CoursePolicy coursePolicy) {
        this.coursePolicy = coursePolicy;
    }

    public void startCourse() {
        if (coursePolicy != null) {
            coursePolicy.assignCourse();
        } else {
            System.out.println("CoursePolicy is null");
        }
    }
}
