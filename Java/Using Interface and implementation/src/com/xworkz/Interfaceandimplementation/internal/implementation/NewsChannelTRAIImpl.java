package com.xworkz.Interfaceandimplementation.internal.implementation;

import com.xworkz.Interfaceandimplementation.internal.rules.TRAI;

public class NewsChannelTRAIImpl implements TRAI {
    public NewsChannelTRAIImpl() {
        System.out.println("NewsChannelTRAIImpl const");
    }

    @Override
    public void regulateContent() {
        System.out.println("regulateContent method in NewsChannelTRAIImpl class");
    }
}
