package com.xworkz.InterfaceandImplentation.external.twoInterface;

import com.xworkz.InterfaceandImplentation.RulesClass.NewsChannel;
import com.xworkz.InterfaceandImplentation.RulesClass.StreamingService;

public class NewsBroadcaster implements NewsChannel, StreamingService {
    @Override public void broadcastNews() { System.out.println("NewsBroadcaster broadcasting live news."); }
    @Override public void schedulePrograms() { System.out.println("NewsBroadcaster scheduling news programs."); }
    @Override public void airAdvertisement() { System.out.println("NewsBroadcaster airing advertisement."); }
    @Override public void streamMovie() { System.out.println("NewsBroadcaster streaming news clip."); }
    @Override public void pauseStream() { System.out.println("NewsBroadcaster paused stream."); }
    @Override public void stopStream() { System.out.println("NewsBroadcaster stopped streaming."); }
}