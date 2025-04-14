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
        @Override
        public int hashCode(){
            return 4;
        }

        @Override
        public boolean equals(Object object) {
            if (object != null) {
                if (object instanceof Backpack) {
                    Backpack other = (Backpack) object;
                    if (this.brand.equals(other.brand) &&
                            this.capacity == other.capacity) {
                        return true;
                    }
                }
            }
            return false;
        }

}
