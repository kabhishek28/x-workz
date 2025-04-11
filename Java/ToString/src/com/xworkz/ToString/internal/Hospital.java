package com.xworkz.ToString.internal;

public class Hospital {


        private String hospitalName;
        private String department;
        private int numberOfDoctors;

        public Hospital(String hospitalName, String department, int numberOfDoctors) {
            this.hospitalName = hospitalName;
            this.department = department;
            this.numberOfDoctors = numberOfDoctors;
        }

        @Override
        public String toString() {
            return "Hospital: " + hospitalName + ", Department: " + department + ", Doctors: " + numberOfDoctors;
        }
    @Override
    public int hashCode(){
        return 4;
    }

}
