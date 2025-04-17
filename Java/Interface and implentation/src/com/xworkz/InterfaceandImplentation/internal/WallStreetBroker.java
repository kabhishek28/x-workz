package com.xworkz.InterfaceandImplentation.internal;

import com.xworkz.InterfaceandImplentation.RulesClass.StockBroker;

public class WallStreetBroker implements StockBroker {
    @Override
    public void buyStocks() {
        System.out.println("Wall Street Broker buying stocks.");
    }

    @Override
    public void sellStocks() {
        System.out.println("Wall Street Broker selling stocks.");
    }

    @Override
    public void checkPortfolio() {
        System.out.println("Wall Street Broker checking portfolio.");
    }
}