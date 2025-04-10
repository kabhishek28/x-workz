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


}
