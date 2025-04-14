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

    @Override
    public int hashCode(){
        return 4;
    }

    @Override
    public boolean equals(Object object) {
        if (object != null) {
            if (object instanceof Gym) {
                Gym other = (Gym) object;
                if (this.durationMonths == other.durationMonths)  {
                    return true;
                }
            }
        }
        return false;
    }
}
