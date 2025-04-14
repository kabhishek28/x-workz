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
    @Override
    public int hashCode(){
        return 4;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj != null){
            if(obj instanceof Hotel){
                Hotel hotel = (Hotel) obj;
                if(this.costPerNight == hotel.costPerNight){
                    return true;
                }
            }
        }
        return false;
    }
}
