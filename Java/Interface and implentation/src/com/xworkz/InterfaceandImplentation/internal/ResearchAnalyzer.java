package com.xworkz.InterfaceandImplentation.internal;

import com.xworkz.InterfaceandImplentation.RulesClass.DataAnalyzer;

public class ResearchAnalyzer implements DataAnalyzer {
    @Override
    public void loadData() {
        System.out.println("ResearchAnalyzer loading the dataset.");
    }

    @Override
    public void analyzeData() {
        System.out.println("ResearchAnalyzer analyzing the data.");
    }

    @Override
    public void reportFindings() {
        System.out.println("ResearchAnalyzer reporting the findings.");
    }
}