package com.xworkz.InterfaceandImplentation.internal;

import com.xworkz.InterfaceandImplentation.RulesClass.Satellite;


public class WeatherSatellite implements Satellite {
        @Override
        public void launch() {
            System.out.println("Weather satellite launched.");
        }

        @Override
        public void orbit() {
            System.out.println("Satellite in orbit.");
        }

        @Override
        public void transmitData() {
            System.out.println("Transmitting weather data.");
        }
}
