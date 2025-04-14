package com.xworkz.ToString.internal;

public class School {

        private String name;
        private String location;
        private int studentCount;

        public School(String name, String location, int studentCount) {
            this.name = name;
            this.location = location;
            this.studentCount = studentCount;
        }

        @Override
        public String toString() {
            return "School: " + name + ", Location: " + location + ", Students: " + studentCount;
        }

    @Override
    public int hashCode(){
        return 4;
    }

    @Override
    public boolean equals(Object object) {
        if (object != null) {
            if (object instanceof School) {
                School other = (School) object;
                if (this.name.equals(other.name) ) {
                    return true;
                }
            }
        }
        return false;
    }


}
