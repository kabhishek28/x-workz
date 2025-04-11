package com.xworkz.ToString.internal;


    public class Delivery {
        private String packageId;
        private String status;
        private String destination;

        public Delivery(String packageId, String status, String destination) {
            this.packageId = packageId;
            this.status = status;
            this.destination = destination;
        }

        @Override
        public String toString() {
            return "Package ID: " + packageId + ", Status: " + status + ", Destination: " + destination;
        }
        @Override
        public int hashCode(){
            return 4;
        }

}
