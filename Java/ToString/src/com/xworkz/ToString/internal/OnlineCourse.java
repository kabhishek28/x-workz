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

    @Override
    public int hashCode(){
        return 4;
    }

    @Override
    public boolean equals(Object object) {
        if (object != null) {
            if (object instanceof OnlineCourse) {
                OnlineCourse other = (OnlineCourse) object;
                if (this.instructor.equals(other.instructor) ) {
                    return true;
                }
            }
        }
        return false;
    }


}
