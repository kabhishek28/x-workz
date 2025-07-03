package com.xworkz.collectiondto.runner;

import com.xworkz.collectiondto.dto.RapidoDTO;

import java.util.ArrayList;
import java.util.Collection;

public class Raid {
    public static void main(String[] args) {
        Collection<RapidoDTO> rapidoDTOCollection = new ArrayList<>();
        rapidoDTOCollection.add(new RapidoDTO("Abhi","Rajajinagar","Maruthi nagar",2,50.0,true,8.2f));
        rapidoDTOCollection.add(new RapidoDTO("Sneha", "BTM Layout", "Electronic City", 1, 120.0, false, 15.6f));
        rapidoDTOCollection.add(new RapidoDTO("Ravi", "Indiranagar", "MG Road", 1, 70.0, true, 5.5f));
        rapidoDTOCollection.add(new RapidoDTO("Pooja", "Yeshwanthpur", "Jayanagar", 3, 150.0, false, 18.4f));
        rapidoDTOCollection.add(new RapidoDTO("Manoj", "Hebbal", "Whitefield", 2, 200.0, true, 22.1f));
        rapidoDTOCollection.add(new RapidoDTO("Divya", "Koramangala", "HSR Layout", 1, 90.0, true, 6.9f));
        rapidoDTOCollection.add(new RapidoDTO("Kiran", "Banashankari", "Majestic", 2, 110.0, false, 12.3f));
        rapidoDTOCollection.add(new RapidoDTO("Asha", "Malleshwaram", "RT Nagar", 1, 60.0, true, 4.4f));
        rapidoDTOCollection.add(new RapidoDTO("Nikhil", "Jalahalli", "Kengeri", 2, 130.0, false, 17.7f));
        rapidoDTOCollection.add(new RapidoDTO("Tanvi", "Shivajinagar", "Bellandur", 1, 140.0, true, 19.3f));


        for(RapidoDTO rapidoDTO:rapidoDTOCollection){
            System.out.println( "name='" + rapidoDTO.getName() + '\'' + ", source='" + rapidoDTO.getSource() + '\'' + ", destination='" + rapidoDTO.getDestination() + '\'' + ", noOfPeople=" + rapidoDTO.getNoOfPeople() + ", price=" + rapidoDTO.getPrice() + ", helmetProvided=" + rapidoDTO.isHelmetProvided() + ", distanceInKm=" + rapidoDTO.getDistanceInKm() );
            System.out.println("---------------------------------------------------------------------------------------------------------");
        }
    }
}
