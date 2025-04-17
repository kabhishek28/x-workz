package com.xworkz.InterfaceandImplentation.internal;

import com.xworkz.InterfaceandImplentation.RulesClass.CryptocurrencyExchange;

public class CryptoXchange implements CryptocurrencyExchange {
    @Override
    public void listCoin() {
        System.out.println("Listing new cryptocurrency on the exchange.");
    }

    @Override
    public void executeTrade() {
        System.out.println("Executing trade on the cryptocurrency exchange.");
    }

    @Override
    public void updateMarketData() {
        System.out.println("Market data updated with the latest crypto prices.");
    }
}
