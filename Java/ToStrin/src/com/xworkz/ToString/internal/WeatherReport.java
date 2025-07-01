package com.xworkz.ToString.internal;

public class WeatherReport {

        private String city;
        private double temperature;
        private String condition;

        public WeatherReport(String city, double temperature, String condition) {
            this.city = city;
            this.temperature = temperature;
            this.condition = condition;
        }

        @Override
        public String toString() {
            return "Weather in " + city + ": " + temperature + "°C, " + condition;
        }


}
