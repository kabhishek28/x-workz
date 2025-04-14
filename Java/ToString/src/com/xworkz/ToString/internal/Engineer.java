package com.xworkz.ToString.internal;

public class Engineer {


        private String name;
        private String domain;
        private int experience;

        public Engineer(String name, String domain, int experience) {
            this.name = name;
            this.domain = domain;
            this.experience = experience;
        }

        @Override
        public String toString() {
            return "Engineer: " + name + ", Domain: " + domain + ", Experience: " + experience + " years";
        }

    @Override
    public int hashCode(){
        return 4;
    }

    @Override
    public boolean equals(Object object) {
        if (object != null) {
            if (object instanceof Engineer) {
                Engineer other = (Engineer) object;
                if (this.domain.equals(other.domain) ) {
                    return true;
                }
            }
        }
        return false;
    }
}
