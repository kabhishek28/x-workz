    package com.xworkz.ToString.internal;

    public class Actor {
        private String name;
        private int age;
        private String bestMovie;


        public Actor(String name, int age, String bestMovie) {
            this.name = name;
            this.age = age;
            this.bestMovie = bestMovie;
        }

        @Override
        public String toString() {
            return "Actor: " + name + ", Age: " + age + ", Best Movie: " + bestMovie;
        }


        @Override
        public int hashCode() {
            return 4;
        }


        @Override
        public boolean equals(Object object) {
            if (object != null) {

                if (object instanceof Actor) {
                    //Actor actor = this;
                    Actor actor1 = (Actor) object;
                    System.out.println(this.name);
                    System.out.println(actor1.name);
                    if (actor1.age == this.age) {
                        return true;
                    }


                }

            }
            return false;

        }
    }

