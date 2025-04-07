package com.xworkz.IsARelation.casting;
import com.xworkz.IsARelation.internal.Planet;
import com.xworkz.IsARelation.external.Earth;
public class PlanetUtil {

        public PlanetUtil() {
            System.out.println("PlanetUtil Constructor");
        }

        public void explorePlanet(Planet planet) {
            if (planet != null) {
                planet.revolveAroundSun();
                planet.rotateOnAxis();
                planet.haveAtmosphere();
                planet.supportLife();
                planet.haveMoons();

                if (planet instanceof Earth) {
                    Earth earth = (Earth) planet;
                    earth.showContinents();
                } else {
                    System.out.println("Planet is not an instance of Earth");
                }

                System.out.println("----- Planet Exploration Completed -----");
            } else {
                System.out.println("Planet object is null");
            }
        }



}
