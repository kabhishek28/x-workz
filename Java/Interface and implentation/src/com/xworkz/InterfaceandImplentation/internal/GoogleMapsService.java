package com.xworkz.InterfaceandImplentation.internal;

import com.xworkz.InterfaceandImplentation.RulesClass.MapService;

public class GoogleMapsService implements MapService {
    @Override
    public void loadMap() {
        System.out.println("Google Maps is loading the map.");
    }

    @Override
    public void getRoute() {
        System.out.println("Google Maps is calculating the optimal route.");
    }

    @Override
    public void zoomIn() {
        System.out.println("Google Maps is zooming in.");
    }
}