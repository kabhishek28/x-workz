package com.xworkz.ToString.internal;


    public class University {
        private String name;
        private String country;
        private int ranking;

        public University(String name, String country, int ranking) {
            this.name = name;
            this.country = country;
            this.ranking = ranking;
        }

        @Override
        public String toString() {
            return "University: " + name + ", Country: " + country + ", World Ranking: " + ranking;
        }


}
