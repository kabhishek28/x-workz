package com.xworkz.ToString.internal;

public class Car {

        private String brand;
        private String model;
        private double price;

        public Car(String brand, String model, double price) {
            this.brand = brand;
            this.model = model;
            this.price = price;
        }

        @Override
        public String toString() {
            return "Car Brand: " + brand + ", Model: " + model + ", Price: ₹" + price;
        }


}
