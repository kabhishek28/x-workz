package com.xworkz.ToString.internal;

public class Chef {

        private String name;
        private String specialty;
        private int experienceYears;

        public Chef(String name, String specialty, int experienceYears) {
            this.name = name;
            this.specialty = specialty;
            this.experienceYears = experienceYears;
        }

        @Override
        public String toString() {
            return "Chef: " + name + ", Specialty: " + specialty + ", Experience: " + experienceYears + " years";
        }


}
