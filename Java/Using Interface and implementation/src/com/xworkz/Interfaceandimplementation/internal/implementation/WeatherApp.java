package com.xworkz.Interfaceandimplementation.internal.implementation;

import com.xworkz.Interfaceandimplementation.internal.rules.ClimateStandard;

public class WeatherApp implements ClimateStandard {
    @Override
    public void reportWeather() {
        System.out.println("Weather App provides real-time weather reports.");
    }
}