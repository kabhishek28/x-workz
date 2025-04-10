package com.xworkz.ToString.internal;

public class OnlineCourse {

        private String courseName;
        private String instructor;
        private int durationWeeks;

        public OnlineCourse(String courseName, String instructor, int durationWeeks) {
            this.courseName = courseName;
            this.instructor = instructor;
            this.durationWeeks = durationWeeks;
        }

        @Override
        public String toString() {
            return "Course: " + courseName + ", Instructor: " + instructor + ", Duration: " + durationWeeks + " weeks";
        }


}
