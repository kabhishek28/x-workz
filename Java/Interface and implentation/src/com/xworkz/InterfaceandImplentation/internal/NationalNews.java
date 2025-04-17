package com.xworkz.InterfaceandImplentation.internal;


import com.xworkz.InterfaceandImplentation.RulesClass.NewsChannel;

public class NationalNews implements NewsChannel {
        @Override
        public void broadcastNews() {
            System.out.println("Broadcasting national news.");
        }

        @Override
        public void schedulePrograms() {
            System.out.println("Scheduling news programs.");
        }

        @Override
        public void airAdvertisement() {
            System.out.println("Airing advertisements.");
        }

}
