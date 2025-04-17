package com.xworkz.InterfaceandImplentation.internal;


import com.xworkz.InterfaceandImplentation.RulesClass.Telescope;

public class HubbleTelescope implements Telescope {
        @Override
        public void adjustLens() {
            System.out.println("Hubble telescope adjusting its lenses.");
        }

        @Override
        public void captureImage() {
            System.out.println("Hubble telescope capturing a high-resolution image.");
        }

        @Override
        public void trackCelestialBody() {
            System.out.println("Hubble telescope tracking a distant galaxy.");
        }


}
