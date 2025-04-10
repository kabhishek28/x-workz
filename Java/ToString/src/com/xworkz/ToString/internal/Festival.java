package com.xworkz.ToString.internal;

public class Festival {

        private String festivalName;
        private String month;
        private String significance;

        public Festival(String festivalName, String month, String significance) {
            this.festivalName = festivalName;
            this.month = month;
            this.significance = significance;
        }

        @Override
        public String toString() {
            return "Festival: " + festivalName + ", Month: " + month + ", About: " + significance;
        }



}
