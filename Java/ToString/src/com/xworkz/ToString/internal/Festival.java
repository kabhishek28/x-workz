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

    @Override
    public int hashCode(){
        return 4;
    }

    @Override
    public boolean equals(Object object) {
        if (object != null) {
            if (object instanceof Festival) {
                Festival other = (Festival) object;
                if (this.significance.equals(other.significance) ) {
                    return true;
                }
            }
        }
        return false;
    }

}
