package com.xworkz.ToString.internal;

public class Cafe {

        private String cafeName;
        private String item;
        private double price;

        public Cafe(String cafeName, String item, double price) {
            this.cafeName = cafeName;
            this.item = item;
            this.price = price;
        }

        @Override
        public String toString() {
            return "Cafe: " + cafeName + ", Item: " + item + ", Price: ₹" + price;
        }


}
