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

    @Override
    public int hashCode(){
        return 4;
    }

    @Override
    public boolean equals(Object object) {
        if (object != null) {
            if (object instanceof Pet) {
                Pet other = (Pet) object;
                if (this.type.equals(other.type) ) {
                    return true;
                }
            }
        }
        return false;
    }
}
