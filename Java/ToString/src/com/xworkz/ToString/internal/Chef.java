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

    @Override
    public int hashCode(){
        return 4;
    }

    @Override
    public boolean equals(Object object) {
        if (object != null) {
            if (object instanceof Chef) {
                Chef other = (Chef) object;
                if (this.specialty.equals(other.specialty) ) {
                    return true;
                }
            }
        }
        return false;
    }
}
