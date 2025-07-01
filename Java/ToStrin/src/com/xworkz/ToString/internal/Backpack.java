package com.xworkz.ToString.internal;



    public class Backpack {
        private String brand;
        private int capacity;
        private boolean hasLaptopCompartment;

        public Backpack(String brand, int capacity, boolean hasLaptopCompartment) {
            this.brand = brand;
            this.capacity = capacity;
            this.hasLaptopCompartment = hasLaptopCompartment;
        }

        @Override
        public String toString() {
            return "Backpack: " + brand + ", Capacity: " + capacity + "L, Laptop Compartment: " + hasLaptopCompartment;
        }


}
