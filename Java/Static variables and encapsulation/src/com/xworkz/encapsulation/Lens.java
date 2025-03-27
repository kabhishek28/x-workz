package com.xworkz.encapsulation;

public class Lens {

        private String type;
        private int cost;

        public Lens() {
            System.out.println("No-arg constructor is running");
        }

        public String getType() {
            return this.type;
        }

        public int getCost() {
            return this.cost;
        }

        void setType(String type) {
            this.type = type;
        }

        void setCost(int cost) {
            this.cost = cost;
        }
    }

