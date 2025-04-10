package com.xworkz.ToString.internal;

public class Gym {

        private String name;
        private String membershipType;
        private int durationMonths;

        public Gym(String name, String membershipType, int durationMonths) {
            this.name = name;
            this.membershipType = membershipType;
            this.durationMonths = durationMonths;
        }

        @Override
        public String toString() {
            return "Gym: " + name + ", Membership: " + membershipType + ", Duration: " + durationMonths + " months";
        }


}
