package com.xworkz.ToString.runner;

import com.xworkz.ToString.external.BankHolder;
import com.xworkz.ToString.internal.*;

public class MainRunner {



    public static void main(String[] args) {

        System.out.println("-------------------------- 1 ---------------------------------");
        BankHolder bankHolder  = new BankHolder(502551,"Saving","Nikhita");
        System.out.println(bankHolder);

        System.out.println("-------------------------- 2 ---------------------------------");
        Metro metro = new Metro("rajajinagar","M G road",80);
        System.out.println(metro);
        System.out.println("-------------------------- 3 ---------------------------------");
        Restaurant rest = new Restaurant("Spicy Treat", "Indiranagar", 4);
        System.out.println(rest);
        System.out.println("-------------------------- 4 ---------------------------------");
        Hotel hotel = new Hotel("Palm Residency", "Mysore", 2500);
        System.out.println(hotel);
        System.out.println("-------------------------- 5 ---------------------------------");
        Movie movie = new Movie("Interstellar", "Sci-Fi", 169);
        System.out.println(movie);
        System.out.println("-------------------------- 6 ---------------------------------");
        Library book = new Library("The Alchemist", "Paulo Coelho", 208);
        System.out.println(book);
        System.out.println("-------------------------- 7 ---------------------------------");
        Flight flight = new Flight("IndiGo", "Delhi", 4500);
        System.out.println(flight);
        System.out.println("-------------------------- 8 ---------------------------------");
        Gym gym = new Gym("FitZone", "Premium", 6);
        System.out.println(gym);
        System.out.println("-------------------------- 9 ---------------------------------");
        BusTicket ticket = new BusTicket("Majestic", "Electronic City", 35);
        System.out.println(ticket);
        System.out.println("-------------------------- 10 ---------------------------------");
        Cafe cafe = new Cafe("BeanHive", "Cold Coffee", 120.50);
        System.out.println(cafe);
        System.out.println("-------------------------- 11 ---------------------------------");
        Train train = new Train("Shatabdi Express", "10:00 AM", "2:30 PM");
        System.out.println(train);
        System.out.println("-------------------------- 12 ---------------------------------");
        Event event = new Event("Tech Talk", "Jayanagar", "12-Apr-2025");
        System.out.println(event);
        System.out.println("-------------------------- 13 ---------------------------------");
        OnlineCourse course = new OnlineCourse("Java Programming", "Mr. Ravi", 6);
        System.out.println(course);
        System.out.println("-------------------------- 14 ---------------------------------");
        Hospital hospital = new Hospital("City Care", "Cardiology", 12);
        System.out.println(hospital);
        System.out.println("-------------------------- 15 ---------------------------------");
        BankAccount account = new BankAccount("Abhishek Kumar", "SBI", 8750.25);
        System.out.println(account);
        System.out.println("-------------------------- 16 ---------------------------------");
        MusicPlayer player = new MusicPlayer("Perfect", "Ed Sheeran", 263);
        System.out.println(player);
        System.out.println("-------------------------- 17 ---------------------------------");
        WeatherReport report = new WeatherReport("Bangalore", 28.5, "Sunny");
        System.out.println(report);
        System.out.println("-------------------------- 18 ---------------------------------");
        Pet pet = new Pet("Tommy", "Dog", 4);
        System.out.println(pet);
        System.out.println("-------------------------- 19 ---------------------------------");
        ShoppingCart cart = new ShoppingCart("Wireless Mouse", 2, 699.99);
        System.out.println(cart);
        System.out.println("-------------------------- 20 ---------------------------------");
        Festival festival = new Festival("Diwali", "November", "Festival of Lights");
        System.out.println(festival);
        System.out.println("-------------------------- 21 ---------------------------------");
        Engineer engineer = new Engineer("Abhishek", "Backend Development", 2);
        System.out.println(engineer);
        System.out.println("-------------------------- 22 ---------------------------------");
        Game game = new Game("God of War", "Action", 4.8);
        System.out.println(game);
        System.out.println("-------------------------- 23 ---------------------------------");
        YouTubeVideo video = new YouTubeVideo("Java OOP Explained", "Tech with Tim", 150000);
        System.out.println(video);
        System.out.println("-------------------------- 24  ---------------------------------");
        Car car = new Car("Toyota", "Innova Crysta", 2150000);
        System.out.println(car);
        System.out.println("-------------------------- 25 ---------------------------------");
        School school = new School("Green Valley High", "Whitefield", 850);
        System.out.println(school);
        System.out.println("-------------------------- 26 ---------------------------------");
        MobileApp app = new MobileApp("NoteX", "Productivity", 3.5);
        System.out.println(app);
        System.out.println("-------------------------- 27 ---------------------------------");

        ArtGallery gallery = new ArtGallery("ColorCanvas", "Ravi Verma", 35);
        System.out.println(gallery);
        System.out.println("-------------------------- 28 ---------------------------------");
        SpaceMission mission = new SpaceMission("Chandrayaan-3", "14-July-2023", "Moon");
        System.out.println(mission);
        System.out.println("-------------------------- 29 ---------------------------------");
        Chef chef = new Chef("Sanjeev Kapoor", "Indian Cuisine", 25);
        System.out.println(chef);
        System.out.println("-------------------------- 30 ---------------------------------");
        Doctor doctor = new Doctor("Neha Rao", "Dermatology", "Apollo Hospitals");
        System.out.println(doctor);
        System.out.println("-------------------------- 31 ---------------------------------");
        Airport airport = new Airport("Kempegowda International Airport", "Bangalore", 2);
        System.out.println(airport);
        System.out.println("-------------------------- 32 ---------------------------------");


        TravelPackage trip = new TravelPackage("Himalayan Adventure", "Manali", 6);
        System.out.println(trip);
        System.out.println("-------------------------- 33 ---------------------------------");
        Singer singer = new Singer("Arijit Singh", "Bollywood", 10);
        System.out.println(singer);
        System.out.println("-------------------------- 34 ---------------------------------");
        RealEstate estate = new RealEstate("Villa", "Electronic City", 9500000);
        System.out.println(estate);
        System.out.println("-------------------------- 35 ---------------------------------");
        LabTest test = new LabTest("Blood Sugar", "Ananya", 450);
        System.out.println(test);
        System.out.println("--------------------------  36 ---------------------------------");
        Startup startup = new Startup("CodeSpark", "Ravi Sharma", 2022);
        System.out.println(startup);
        System.out.println("-------------------------- 37 ---------------------------------");
        Tourist tourist = new Tourist("Liam", "Canada", 12);
        System.out.println(tourist);
        System.out.println("-------------------------- 38 ---------------------------------");
        Customer customer = new Customer("Sneha", "sneha@email.com", true);
        System.out.println(customer);
        System.out.println("-------------------------- 39 ---------------------------------");
        DNASequence dna = new DNASequence("D1234", "ATCGTAGGCTA", 11);
        System.out.println(dna);
        System.out.println("-------------------------- 40 ---------------------------------");
        Backpack bp = new Backpack("Wildcraft", 30, true);
        System.out.println(bp);
        System.out.println("-------------------------- 41 ---------------------------------");
        CampingSite site = new CampingSite("Evergreen Pines", "Coorg", true);
        System.out.println(site);
        System.out.println("-------------------------- 42 ---------------------------------");

        Product product = new Product("Bluetooth Speaker", "Electronics", 150);
        System.out.println(product);
        System.out.println("-------------------------- 43 ---------------------------------");
        BookStore store = new BookStore("Crossword", 2000, "Indiranagar");
        System.out.println(store);
        System.out.println("-------------------------- 44 ---------------------------------");
        AIModel model = new AIModel("GPT-4", "4.0", "Text Generation");
        System.out.println(model);
        System.out.println("-------------------------- 45 ---------------------------------");
        University uni = new University("IIT Bombay", "India", 172);
        System.out.println(uni);
        System.out.println("-------------------------- 46 ---------------------------------");
        TheatreShow show = new TheatreShow("Hamlet", "English", "7:30 PM");
        System.out.println(show);
        System.out.println("-------------------------- 47 ---------------------------------");
        Tool tool = new Tool("Drill Machine", "Power Tool", true);
        System.out.println(tool);
        System.out.println("-------------------------- 48 ---------------------------------");
        Nurse nurse = new Nurse("Anita", 6, "ICU");
        System.out.println(nurse);
        System.out.println("-------------------------- 49 ---------------------------------");
        PowerPlant plant = new PowerPlant("Thermax", "Thermal", 1500);
        System.out.println(plant);
        System.out.println("-------------------------- 50 ---------------------------------");
        Delivery delivery = new Delivery("PKG2025", "In Transit", "Hyderabad");
        System.out.println(delivery);
        System.out.println("-------------------------- 51 ---------------------------------");
        AlarmClock alarm = new AlarmClock("06:30", true, true);
        System.out.println(alarm);
        System.out.println("-------------------------- 52 ---------------------------------");
        MusicInstrument instrument = new MusicInstrument("Keyboard", "Percussion", true);
        System.out.println(instrument);

        System.out.println("-------------------------- 53 ---------------------------------");
        TrafficSignal signal = new TrafficSignal("BTM Layout", "Red", 45);
        System.out.println(signal);

        System.out.println("-------------------------- 54 ---------------------------------");
        Camera cam = new Camera("Canon", 24, true);
        System.out.println(cam);
        System.out.println("-------------------------- 55 ---------------------------------");
        InventoryItem item = new InventoryItem("USB Cable", 50, 199.99);
        System.out.println(item);
        System.out.println("-------------------------- 56 ---------------------------------");
        GymTrainer trainer = new GymTrainer("Rahul", 15, true);
        System.out.println(trainer);
        System.out.println("-------------------------- 57 ---------------------------------");
        Actor actor = new Actor("Allu Arjun", 41, "Pushpa");
        System.out.println(actor);
        System.out.println("-------------------------- 58 ---------------------------------");

        AdventureTrip trip1 = new AdventureTrip("Manali", 5, true);
        System.out.println(trip1);
        System.out.println("-------------------------- 59 ---------------------------------");
        Cycle cycle = new Cycle("Hero", 18, false);
        System.out.println(cycle);
        System.out.println("-------------------------- 60 ---------------------------------");

        Painting painting = new Painting("Starry Night", "Vincent van Gogh", 1889);
        System.out.println(painting);
        System.out.println("-------------------------- 61 ---------------------------------");
        MovieTicket movieTicket = new MovieTicket("KGF","A21",250);
        System.out.println(movieTicket);
        System.out.println("-------------------------- 62 ---------------------------------");
        DeliveryPerson dp = new DeliveryPerson("Kiran", "South Zone", true);
        System.out.println(dp);
        System.out.println("-------------------------- 63 ---------------------------------");
        Temple temple = new Temple("ISKCON", "Rajajinagar", true);
        System.out.println(temple);
        System.out.println("-------------------------- 64 ---------------------------------");
        TVShow show1 = new TVShow("Stranger Things", "Sci-Fi", 4);
        System.out.println(show1);
        System.out.println("-------------------------- 65 ---------------------------------");
        Furniture chair = new Furniture("Chair", "Wood", 1500.00);
        System.out.println(chair);

        System.out.println("-------------------------- 66 ---------------------------------");
        ElectricVehicle ev = new ElectricVehicle("Tata Nexon EV", 320, true);
        System.out.println(ev);
        System.out.println("-------------------------- 67 ---------------------------------");

        Drone drone = new Drone("DJI Mini 3", 31.5, true);
        System.out.println(drone);
        System.out.println("-------------------------- 68 ---------------------------------");

        OnlineOrder order = new OnlineOrder("ORD1023", "Bluetooth Speaker", 2299.99);
        System.out.println(order);
        System.out.println("-------------------------- 69 ---------------------------------");
        AppUpdate update = new AppUpdate("WhatsApp", "2.24.8.1", true);
        System.out.println(update);
        System.out.println("-------------------------- 70 ---------------------------------");
        ParkingSlot slot = new ParkingSlot("A12", true, "Car");
        System.out.println(slot);
        System.out.println("-------------------------- 71 ---------------------------------");

        YouTuber youtuber = new YouTuber("TechGuru", "Tech Reviews", 520);
        System.out.println(youtuber);
        System.out.println("-------------------------- 72 ---------------------------------");

        BusStop stop = new BusStop("Majestic", "Route 222", true);
        System.out.println(stop);
        System.out.println("-------------------------- 73 ---------------------------------");
        PodcastEpisode ep = new PodcastEpisode("Tech Trends", "Ravi", 35);
        System.out.println(ep);
        System.out.println("-------------------------- 74 ---------------------------------");
        FitnessTracker ft = new FitnessTracker("Abhi", 9876, 320.5);
        System.out.println(ft);

        System.out.println("-------------------------- 75 ---------------------------------");
        LaundryService ls = new LaundryService("Sneha", 15, true);
        System.out.println(ls);
        System.out.println("-------------------------- 76 ---------------------------------");
        ElectionCandidate candidate = new ElectionCandidate("Ravi Kumar", "Green Party", 45);
        System.out.println(candidate);
        System.out.println("-------------------------- 77 ---------------------------------");
        ATMTransaction txn = new ATMTransaction("TXN1009", "Withdrawal", 5000);
        System.out.println(txn);
        System.out.println("-------------------------- 78 ---------------------------------");

        ThemePark park = new ThemePark("Wonderla", 50, true);
        System.out.println(park);
        System.out.println("-------------------------- 79 ---------------------------------");
        BloodDonor donor = new BloodDonor("Arjun", "O+", 7);
        System.out.println(donor);

        System.out.println("-------------------------- 80 ---------------------------------");
        ElectricBill bill = new ElectricBill("Geetha", 350, 2100.50);
        System.out.println(bill);
        System.out.println("-------------------------- 81 ---------------------------------");
        TattooArtist artist = new TattooArtist("Riya", "Minimalist", 380);
        System.out.println(artist);
        System.out.println("-------------------------- 82 ---------------------------------");
        RecyclingCenter rc = new RecyclingCenter("Pune", 560, true);
        System.out.println(rc);
        System.out.println("-------------------------- 83 ---------------------------------");
        ZooAnimal animal = new ZooAnimal("Lion", "Simba", 5);
        System.out.println(animal);
        System.out.println("-------------------------- 84 ---------------------------------");
        GamingConsole console = new GamingConsole("Sony", "PS5", 825);
        System.out.println(console);
        System.out.println("-------------------------- 85 ---------------------------------");
        ElectricScooter scooter = new ElectricScooter("Ather", 108, true);
        System.out.println(scooter);
        System.out.println("-------------------------- 86 ---------------------------------");
        BakeryItem item1 = new BakeryItem("Cupcake", "Red Velvet", 80.0);
        System.out.println(item1);
        System.out.println("-------------------------- 87 ---------------------------------");

        NewsArticle article = new NewsArticle("AI Reshaping the World", "K. Abhishek", "Technology");
        System.out.println(article);
        System.out.println("-------------------------- 88 ---------------------------------");
        Sneaker shoe = new Sneaker("Nike", "White", 9);
        System.out.println(shoe);
        System.out.println("-------------------------- 89 ---------------------------------");
        EBook ebook = new EBook("Digital Fortress", "Dan Brown", 2.5);
        System.out.println(ebook);
        System.out.println("-------------------------- 90 ---------------------------------");

        MusicPlaylist playlist = new MusicPlaylist("Morning Chill", "Lo-Fi", 25);
        System.out.println(playlist);

        System.out.println("-------------------------- 91 ---------------------------------");
        HikingTrail trail = new HikingTrail("Nandi Hills", 8, true);
        System.out.println(trail);
        System.out.println("-------------------------- 92 ---------------------------------");
        CodingContest contest = new CodingContest("Code Rush", "HackerRank", 3);
        System.out.println(contest);
        System.out.println("-------------------------- 93 ---------------------------------");

        HomeAppliance appliance = new HomeAppliance("Microwave", "Samsung", 1200);
        System.out.println(appliance);

        System.out.println("-------------------------- 94 ---------------------------------");
        CityMetroCard card = new CityMetroCard("Divya", 300, true);
        System.out.println(card);

        System.out.println("-------------------------- 95 ---------------------------------");
        MuseumExhibit exhibit = new MuseumExhibit("Ancient Sword", "Medieval", true);
        System.out.println(exhibit);
        System.out.println("-------------------------- 96 ---------------------------------");
        DroneDelivery delivery2 = new DroneDelivery("PK123", "Koramangala", false);
        System.out.println(delivery2);
        System.out.println("-------------------------- 97 ---------------------------------");
        EventTicket ticket1 = new EventTicket("Comic Con", "B12", 599.0);
        System.out.println(ticket1);
        System.out.println("-------------------------- 98 ---------------------------------");
        MountainTrail mt = new MountainTrail("Kudremukh", 850, true);
        System.out.println(mt);
        System.out.println("-------------------------- 99 ---------------------------------");

        ForestTrail ft1 = new ForestTrail("Dandeli", 5, true);
        System.out.println(ft1);
        System.out.println("-------------------------- 100 ---------------------------------");

        TrailMap map = new TrailMap("Western Ghats", 22, 4);
        System.out.println(map);
//        System.out.println("-------------------------- 1 ---------------------------------");
//        TrailWeather tw = new TrailWeather("Savandurga", "Winter", "Sunny");
//        System.out.println(tw);
//        System.out.println("-------------------------- 1 ---------------------------------");
//
//        TrailGuide guide = new TrailGuide("Arjun", 7, true);
//        System.out.println(guide);
//        System.out.println("-------------------------- 1 ---------------------------------");
//
//        NightTrail nt = new NightTrail("Nandi Betta", true, 12);
//        System.out.println(nt);
//        System.out.println("-------------------------- 1 ---------------------------------");
//        EcoTrail eco = new EcoTrail("Bannerghatta", false, "A+");
//        System.out.println(eco);
//
//        System.out.println("-------------------------- 1 ---------------------------------");
//
//



























































    }


}
