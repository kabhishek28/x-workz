package com.xworkz.ToString.internal;

public class SpaceMission {

        private String missionName;
        private String launchDate;
        private String destination;

        public SpaceMission(String missionName, String launchDate, String destination) {
            this.missionName = missionName;
            this.launchDate = launchDate;
            this.destination = destination;
        }

        @Override
        public String toString() {
            return "Mission: " + missionName + ", Launch: " + launchDate + ", Destination: " + destination;
        }

    @Override
    public int hashCode(){
        return 4;
    }

}
