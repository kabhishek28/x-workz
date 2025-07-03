package com.xworkz.collectiondto.runner;

import com.xworkz.collectiondto.dto.HospitalDTO;
import com.xworkz.collectiondto.dto.LibraryDTO;
import com.xworkz.collectiondto.dto.RapidoDTO;
import java.util.ArrayList;
import java.util.Collection;

public class RunnerAll {
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



        Collection<HospitalDTO> hospitalDTOCollection = new ArrayList<>();
        hospitalDTOCollection.add(new HospitalDTO("Sneha", 29, "Female", "Gynecology", "Dr. Anita Rao", true, 12500.0));
        hospitalDTOCollection.add(new HospitalDTO("Arjun", 34, "Male", "Cardiology", "Dr. Mehra", false, 22000.0));
        hospitalDTOCollection.add(new HospitalDTO("Divya", 40, "Female", "Orthopedics", "Dr. Naresh", true, 15800.0));
        hospitalDTOCollection.add(new HospitalDTO("Kiran", 19, "Male", "Dermatology", "Dr. Ramesh", false, 3500.0));
        hospitalDTOCollection.add(new HospitalDTO("Priya", 30, "Female", "Pediatrics", "Dr. Seema", true, 9800.0));
        hospitalDTOCollection.add(new HospitalDTO("Rahul", 45, "Male", "Neurology", "Dr. Sandeep", true, 26000.0));
        hospitalDTOCollection.add(new HospitalDTO("Asha", 52, "Female", "General Surgery", "Dr. George", false, 18000.0));
        hospitalDTOCollection.add(new HospitalDTO("Nikhil", 27, "Male", "ENT", "Dr. Swathi", false, 4200.0));
        hospitalDTOCollection.add(new HospitalDTO("Meghana", 36, "Female", "Psychiatry", "Dr. Karthik", true, 8900.0));
        hospitalDTOCollection.add(new HospitalDTO("Vinith",22,"male","OPD","Ravi ganti",true,7000.0));


        Collection<LibraryDTO> libraryDataCollection = new ArrayList<>();
        libraryDataCollection.add(new LibraryDTO("The Alchemist", "Paulo Coelho", "Fiction", 1988, "HarperOne", true, 399.0));
        libraryDataCollection.add(new LibraryDTO("Clean Code", "Robert C. Martin", "Programming", 2008, "Prentice Hall", false, 699.0));
        libraryDataCollection.add(new LibraryDTO("Wings of Fire", "A.P.J. Abdul Kalam", "Autobiography", 1999, "Universities Press", true, 299.0));
        libraryDataCollection.add(new LibraryDTO("Atomic Habits", "James Clear", "Self-Help", 2018, "Penguin Random House", true, 499.0));
        libraryDataCollection.add(new LibraryDTO("1984", "George Orwell", "Dystopian", 1949, "Secker & Warburg", false, 250.0));
        libraryDataCollection.add(new LibraryDTO("The Silent Patient", "Alex Michaelides", "Thriller", 2019, "Celadon Books", true, 370.0));
        libraryDataCollection.add(new LibraryDTO("Sapiens", "Yuval Noah Harari", "History", 2011, "Harvill Secker", false, 550.0));
        libraryDataCollection.add(new LibraryDTO("Introduction to Algorithms", "Thomas H. Cormen", "Education", 2009, "MIT Press", true, 1250.0));
        libraryDataCollection.add(new LibraryDTO("Rich Dad Poor Dad", "Robert Kiyosaki", "Finance", 1997, "Plata Publishing", true, 430.0));
        libraryDataCollection.add(new LibraryDTO("The Great Gatsby", "F. Scott Fitzgerald", "Classic", 1925, "Scribner", false, 300.0));

        System.out.println("*********************************************************************************************************************************");
        for(LibraryDTO libraryDTO : libraryDataCollection){
            System.out.println(libraryDTO.toString());
            System.out.println("------------------------------------------------------------------------------------------------");
        }

        System.out.println("********************************************************************************************************************");
        for(HospitalDTO hospitalDTO : hospitalDTOCollection){
            System.out.println(hospitalDTO.toString());
            System.out.println("--------------------------------------------------------------------------------------");
        }
        System.out.println("*********************************************************************************************************");
        for(RapidoDTO rapidoDTO:rapidoDTOCollection){
            System.out.println( "name='" + rapidoDTO.getName() + '\'' + ", source='" + rapidoDTO.getSource() + '\'' + ", destination='" + rapidoDTO.getDestination() + '\'' + ", noOfPeople=" + rapidoDTO.getNoOfPeople() + ", price=" + rapidoDTO.getPrice() + ", helmetProvided=" + rapidoDTO.isHelmetProvided() + ", distanceInKm=" + rapidoDTO.getDistanceInKm() );
            System.out.println("---------------------------------------------------------------------------------------------------------");
        }
        System.out.println("***************************************************************************************************************");
    }
}
