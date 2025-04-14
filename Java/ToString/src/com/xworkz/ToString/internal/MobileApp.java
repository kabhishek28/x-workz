package com.xworkz.ToString.internal;

public class MobileApp {

        private String appName;
        private String category;
        private double version;

        public MobileApp(String appName, String category, double version) {
            this.appName = appName;
            this.category = category;
            this.version = version;
        }

        @Override
        public String toString() {
            return "App: " + appName + ", Category: " + category + ", Version: " + version;
        }

    @Override
    public int hashCode(){
        return 4;
    }

    @Override
    public boolean equals(Object object) {
        if (object != null) {
            if (object instanceof MobileApp) {
                MobileApp other = (MobileApp) object;
                if (this.category.equals(other.category) ) {
                    return true;
                }
            }
        }
        return false;
    }
}
