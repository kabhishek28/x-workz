package com.xworkz.ToString.internal;

public class Train {

        private String trainName;
        private String departure;
        private String arrival;

        public Train(String trainName, String departure, String arrival) {
            this.trainName = trainName;
            this.departure = departure;
            this.arrival = arrival;
        }

        @Override
        public String toString() {
            return "Train: " + trainName + ", Departs: " + departure + ", Arrives: " + arrival;
        }


}
