package com.xworkz.ToString.internal;

public class Pet {

        private String name;
        private String type;
        private int age;

        public Pet(String name, String type, int age) {
            this.name = name;
            this.type = type;
            this.age = age;
        }

        @Override
        public String toString() {
            return "Pet Name: " + name + ", Type: " + type + ", Age: " + age + " years";
        }


}
