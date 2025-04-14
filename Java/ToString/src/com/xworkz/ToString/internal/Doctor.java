package com.xworkz.ToString.internal;

public class Doctor {

        private String name;
        private String specialization;
        private String hospital;

        public Doctor(String name, String specialization, String hospital) {
            this.name = name;
            this.specialization = specialization;
            this.hospital = hospital;
        }

        @Override
        public String toString() {
            return "Dr. " + name + ", Specialization: " + specialization + ", Hospital: " + hospital;
        }

    @Override
    public int hashCode(){
        return 4;
    }

    @Override
    public boolean equals(Object object) {
        if (object != null) {
            if (object instanceof Doctor) {
                Doctor other = (Doctor) object;
                if (this.specialization.equals(other.specialization) ) {
                    return true;
                }
            }
        }
        return false;
    }
}
