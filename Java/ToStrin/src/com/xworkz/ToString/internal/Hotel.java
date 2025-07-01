package com.xworkz.ToString.internal;

public class Hotel {

        private String name;
        private String city;
        private int costPerNight;

        public Hotel(String name, String city, int costPerNight) {
            this.name = name;
            this.city = city;
            this.costPerNight = costPerNight;
        }

        @Override
        public String toString() {
            return "Hotel Name: " + name + ", City: " + city + ", Cost/Night: ₹" + costPerNight;
        }


}
