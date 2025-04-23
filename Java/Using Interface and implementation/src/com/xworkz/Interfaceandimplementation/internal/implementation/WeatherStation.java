package com.xworkz.Interfaceandimplementation.internal.implementation;

import com.xworkz.Interfaceandimplementation.internal.rules.ForecastRules;

public class WeatherStation implements ForecastRules {
    @Override
    public void updateForecast() {
        System.out.println("Weather station updates the forecast with real-time data.");
    }
}