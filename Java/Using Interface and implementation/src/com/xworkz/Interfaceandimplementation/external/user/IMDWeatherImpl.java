package com.xworkz.Interfaceandimplementation.external.user;

import com.xworkz.Interfaceandimplementation.internal.rules.ClimateStandard;

public class IMDWeatherImpl {
    private ClimateStandard climateStandard;

    public IMDWeatherImpl(ClimateStandard climateStandard) {
        this.climateStandard = climateStandard;
    }

    public void displayForecast() {
        if (climateStandard != null) {
            climateStandard.reportWeather();
        } else {
            System.out.println("ClimateStandard is null");
        }
    }
}
