package com.xworkz.InterfaceandImplentation.internal;

import com.xworkz.InterfaceandImplentation.RulesClass.StreamingService;

public class NetStream implements StreamingService {
    @Override
    public void streamMovie() {
        System.out.println("NetStream is now streaming a movie.");
    }

    @Override
    public void pauseStream() {
        System.out.println("NetStream has paused the movie.");
    }

    @Override
    public void stopStream() {
        System.out.println("NetStream has stopped streaming.");
    }
}