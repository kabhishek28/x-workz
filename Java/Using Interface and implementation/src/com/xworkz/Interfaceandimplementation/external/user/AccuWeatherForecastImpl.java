package com.xworkz.Interfaceandimplementation.external.user;

import com.xworkz.Interfaceandimplementation.internal.rules.ForecastRules;

public class AccuWeatherForecastImpl {
    private ForecastRules forecastRules;

    public AccuWeatherForecastImpl(ForecastRules forecastRules) {
        this.forecastRules = forecastRules;
    }

    public void displayForecast() {
        if (forecastRules != null) {
            forecastRules.updateForecast();
        } else {
            System.out.println("ForecastRules is null");
        }
    }
}

