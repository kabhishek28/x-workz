package com.xworkz.ToString.internal;

public class Restaurant {

        private String name;
        private String location;
        private int rating;

        public Restaurant(String name, String location, int rating) {
            this.name = name;
            this.location = location;
            this.rating = rating;
        }

        @Override
        public String toString() {
            return "Restaurant Name: " + name + ", Location: " + location + ", Rating: " + rating + "/5";
        }

    @Override
    public int hashCode(){
        return 4;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Restaurant that = (Restaurant) o;
        return location.equals(that.location);
    }
}
