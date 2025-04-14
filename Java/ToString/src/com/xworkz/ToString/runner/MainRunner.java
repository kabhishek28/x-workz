package com.xworkz.ToString.runner;

import com.xworkz.ToString.external.BankHolder;
import com.xworkz.ToString.internal.*;

public class MainRunner {



public static void main(String[] args) {


   System.out.println("-------------------------- 1 ---------------------------------");
   BankHolder bankHolder  = new BankHolder(502551,"Saving","Nikhita");
   System.out.println("To String Details :"+ bankHolder);
   System.out.println("Hash Code value :"+bankHolder.hashCode());
   System.out.println("Original HashCode value :"+System.identityHashCode(bankHolder));

   BankHolder bankHolder1 = new BankHolder(502551,"Saving","Vaishnavi");


   boolean result =  bankHolder.equals(bankHolder1);
   System.out.println(result);




   System.out.println("-------------------------- 2 ---------------------------------");
   Metro metro = new Metro("rajajinagar","M G road",80);
   System.out.println("To String Details :"+ metro);
   System.out.println("Hash Code value :"+metro.hashCode());
   System.out.println("Original HashCode value :"+System.identityHashCode(metro));
   Metro metro1 = new Metro("R R nagar","M G road",90);

   boolean result3 = metro.equals(metro1);
   System.out.println(result3);




   System.out.println("-------------------------- 3 ---------------------------------");
   Restaurant rest = new Restaurant("Spicy Treat", "Indiranagar", 4);
   System.out.println("To String Details :"+ rest);
   System.out.println("Hash Code value :"+rest.hashCode());
   System.out.println("Original HashCode value :"+System.identityHashCode(rest));

   Restaurant restaurant = new Restaurant("Swathi Restaurant ","Indiranagar",4);
   boolean result4 = rest.equals(restaurant);

   System.out.println(result4);



   System.out.println("-------------------------- 4 ---------------------------------");
   Hotel hotel = new Hotel("Palm Residency", "Mysore", 2500);
   System.out.println("To String Details :"+ hotel);
   System.out.println("Hash Code value :"+hotel.hashCode());
   System.out.println("Original HashCode value :"+System.identityHashCode(hotel));

   Hotel hotel1 = new Hotel("punjab hotel","Bengaluru",2500);

   boolean reuslt5 = hotel.equals(hotel1);
   System.out.println(reuslt5);


   System.out.println("-------------------------- 5 ---------------------------------");
   Movie movie = new Movie("Interstellar", "Sci-Fi", 169);
   System.out.println("To String Details :"+ movie);
   System.out.println("Hash Code value :"+movie.hashCode());
   System.out.println("Original HashCode value :"+System.identityHashCode(movie));

   Movie movie1 = new Movie("Pushpha","AC",169);
   boolean result6 = movie.equals(movie1);
   System.out.println(result6);
   System.out.println("-------------------------- 6 ---------------------------------");
   Library book = new Library("The Alchemist", "Paulo Coelho", 208);
   Library library = new Library("vijavya nagar","Anil",208);

   System.out.println("To String Details :"+ book);
   System.out.println("Hash Code value :"+book.hashCode());
   System.out.println("Original HashCode value :"+System.identityHashCode(book));

   boolean res = book.equals(library);
   System.out.println(res);
   System.out.println("-------------------------- 7 ---------------------------------");
   Flight flight = new Flight("IndiGo", "Delhi", 4500);
   System.out.println("To String Details :"+ flight);
   System.out.println("Hash Code value :"+flight.hashCode());
   System.out.println("Original HashCode value :"+System.identityHashCode(flight));

   Flight flight1 = new Flight("IndiGo","bengalore",6500);
   boolean res1 = flight.equals(flight1);
   System.out.println(res1);


   System.out.println("-------------------------- 8 ---------------------------------");
   Gym gym = new Gym("FitZone", "Premium", 6);
   System.out.println("To String Details :"+ gym);
   System.out.println("Hash Code value :"+gym.hashCode());
   System.out.println("Original HashCode value :"+System.identityHashCode(gym));
   Gym gym1 = new Gym("Get fit","Gold",6);
   boolean res3 = gym.equals(gym1);

   System.out.println(res3);
   System.out.println("-------------------------- 9 ---------------------------------");
   BusTicket ticket = new BusTicket("Majestic", "Electronic City", 35);
   System.out.println("To String Details :"+ ticket);
   System.out.println("Hash Code value :"+ticket.hashCode());
   System.out.println("Original HashCode value :"+System.identityHashCode(ticket));

   BusTicket ticket1 = new BusTicket("Rajaji Nagar","M G road",35);
   boolean res4 = ticket.equals(ticket1);

   System.out.println(res4);
   System.out.println("-------------------------- 10 ---------------------------------");
   Cafe cafe = new Cafe("BeanHive", "Cold Coffee", 120.50);
   System.out.println("To String Details :"+ cafe);
   System.out.println("Hash Code value :"+cafe.hashCode());
   System.out.println("Original HashCode value :"+System.identityHashCode(cafe));

   Cafe cafe2 = new Cafe("BrewPoint", "Cold Coffee", 95.00);
   boolean result7 = cafe.equals(cafe2);
   System.out.println("Is the drink same? " + result7);



   System.out.println("-------------------------- 11 ---------------------------------");
   Train train = new Train("Shatabdi Express", "10:00 AM", "2:30 PM");
   System.out.println("To String Details :"+ train);
   System.out.println("Hash Code value :"+train.hashCode());
   System.out.println("Original HashCode value :"+System.identityHashCode(train));

   Train train2 = new Train("Duronto Express", "10:00 AM", "3:00 PM"); // Common departure

   boolean result8 = train.equals(train2);
   System.out.println("Do both trains depart at the same time? " + result8);
   System.out.println("-------------------------- 12 ---------------------------------");
   Event event = new Event("Tech Talk", "Jayanagar", "12-Apr-2025");
   System.out.println("To String Details :"+ event);
   System.out.println("Hash Code value :"+event.hashCode());
   System.out.println("Original HashCode value :"+System.identityHashCode(event));


   Event event2 = new Event("Startup Pitch", "Indiranagar", "12-Apr-2025"); // Same date

   boolean result9 = event.equals(event2);
   System.out.println("Do both events happen on the same date? " + result9);
   System.out.println("-------------------------- 13 ---------------------------------");


   OnlineCourse course = new OnlineCourse("Java Programming", "Mr. Ravi", 6);
   System.out.println("To String Details :"+ course);
   System.out.println("Hash Code value :"+course.hashCode());
   System.out.println("Original HashCode value :"+System.identityHashCode(course));

   OnlineCourse course2 = new OnlineCourse("Spring Boot Mastery", "Mr. Ravi", 8); // Same instructor

   boolean result10 = course.equals(course2);
   System.out.println("Are both courses taught by the same instructor? " + result10);


   System.out.println("-------------------------- 14 ---------------------------------");
   Hospital hospital = new Hospital("City Care", "Cardiology", 12);
   System.out.println("To String Details :"+ hospital);
   System.out.println("Hash Code value :"+hospital.hashCode());
   System.out.println("Original HashCode value :"+System.identityHashCode(hospital));
   Hospital hospital2 = new Hospital("Metro Health", "Cardiology", 20); // Same department

   boolean result11 = hospital.equals(hospital2);
   System.out.println("Do both hospitals have the same department? " + result11);


   System.out.println("-------------------------- 15 ---------------------------------");
   BankAccount account = new BankAccount("Abhishek Kumar", "SBI", 8750.25);
   System.out.println("To String Details :"+ account);
   System.out.println("Hash Code value :"+account.hashCode());
   System.out.println("Original HashCode value :"+System.identityHashCode(account));
   BankAccount account2 = new BankAccount("Priya Sharma", "SBI", 15200.00); // Same bank name

   boolean result15 = account.equals(account2);
   System.out.println("Do both accounts belong to the same bank? " + result15);


   System.out.println("-------------------------- 16 ---------------------------------");
   MusicPlayer player = new MusicPlayer("Perfect", "Ed Sheeran", 263);
   System.out.println("To String Details :"+ player);
   System.out.println("Hash Code value :"+player.hashCode());
   System.out.println("Original HashCode value :"+System.identityHashCode(player));
   MusicPlayer player2 = new MusicPlayer("Shape of You", "Ed Sheeran", 240); // Same artist

   boolean result16 = player.equals(player2);
   System.out.println("Are both songs by the same artist? " + result16);


   System.out.println("-------------------------- 17 ---------------------------------");
   WeatherReport report = new WeatherReport("Bangalore", 28.5, "Sunny");
   System.out.println("To String Details :"+ report);
   System.out.println("Hash Code value :"+report.hashCode());
   System.out.println("Original HashCode value :"+System.identityHashCode(report));
   WeatherReport report2 = new WeatherReport("Chennai", 32.0, "Sunny"); // Same condition

   boolean result17 = report.equals(report2);
   System.out.println("Is the weather condition same in both cities? " + result17);



   System.out.println("-------------------------- 18 ---------------------------------");
   Pet pet = new Pet("Tommy", "Dog", 4);
   System.out.println("To String Details :"+ pet);
   System.out.println("Hash Code value :"+pet.hashCode());
   System.out.println("Original HashCode value :"+System.identityHashCode(pet));
   Pet pet2 = new Pet("Bruno", "Dog", 2); // Same type, different name and age

   boolean result18 = pet.equals(pet2);
   System.out.println("Are both pets of the same type? " + result18);


   System.out.println("-------------------------- 19 ---------------------------------");
   ShoppingCart cart = new ShoppingCart("Wireless Mouse", 2, 699.99);
   System.out.println("To String Details :"+ cart);
   System.out.println("Hash Code value :"+cart.hashCode());
   System.out.println("Original HashCode value :"+System.identityHashCode(cart));
   ShoppingCart cart2 = new ShoppingCart("Wireless Mouse", 1, 650.00); // Same item name

   boolean result19 = cart.equals(cart2);
   System.out.println("Are both items the same? " + result19);


   System.out.println("-------------------------- 20 ---------------------------------");
   Festival festival = new Festival("Diwali", "November", "Festival of Lights");
   System.out.println("To String Details :"+ festival);
   System.out.println("Hash Code value :"+festival.hashCode());
   System.out.println("Original HashCode value :"+System.identityHashCode(festival));

   Festival festival2 = new Festival("Diwali", "October", "Festival of Lights"); // Same festival name

   boolean result20 = festival.equals(festival2);
   System.out.println("Are both festivals the same? " + result20);



   System.out.println("-------------------------- 21 ---------------------------------");
   Engineer engineer = new Engineer("Abhishek", "Backend Development", 2);
   System.out.println("To String Details :"+ engineer);
   System.out.println("Hash Code value :"+engineer.hashCode());
   System.out.println("Original HashCode value :"+System.identityHashCode(engineer));
   Engineer engineer2 = new Engineer("Priya", "Backend Development", 5); // Same specialization

   boolean result21 = engineer.equals(engineer2);
   System.out.println("Do both engineers have the same specialization? " + result21);



   System.out.println("-------------------------- 22 ---------------------------------");
   Game game = new Game("God of War", "Action", 4.8);
   System.out.println("To String Details :"+ game);
   System.out.println("Hash Code value :"+game.hashCode());
   System.out.println("Original HashCode value :"+System.identityHashCode(game));
   Game game2 = new Game("Uncharted", "Action", 4.7); // Same genre

   boolean result22 = game.equals(game2);
   System.out.println("Do both games belong to the same genre? " + result22);



   System.out.println("-------------------------- 23 ---------------------------------");
   YouTubeVideo video = new YouTubeVideo("Java OOP Explained", "Tech with Tim", 150000);
   System.out.println("To String Details :"+ video);
   System.out.println("Hash Code value :"+video.hashCode());
   System.out.println("Original HashCode value :"+System.identityHashCode(video));
   YouTubeVideo video2 = new YouTubeVideo("Python Basics", "Tech with Tim", 200000); // Same creator

   boolean result23 = video.equals(video2);
   System.out.println("Are both videos from the same creator? " + result23);


   System.out.println("-------------------------- 24  ---------------------------------");
   Car car = new Car("Toyota", "Innova Crysta", 2150000);
   System.out.println("To String Details :"+ car);
   System.out.println("Hash Code value :"+car.hashCode());
   System.out.println("Original HashCode value :"+System.identityHashCode(car));

   Car car2 = new Car("Toyota", "Fortuner", 3000000); // Same brand

   boolean result24 = car.equals(car2);
   System.out.println("Are both cars from the same brand? " + result24);



   System.out.println("-------------------------- 25 ---------------------------------");
   School school = new School("Green Valley High", "Whitefield", 850);
   System.out.println("To String Details :"+ school);
   System.out.println("Hash Code value :"+school.hashCode());
   System.out.println("Original HashCode value :"+System.identityHashCode(school));
   School school2 = new School("Green Valley High", "Koramangala", 900); // Same name

   boolean result25 = school.equals(school2);
   System.out.println("Are both schools the same? " + result25);



   System.out.println("-------------------------- 26 ---------------------------------");
   MobileApp app = new MobileApp("NoteX", "Productivity", 3.5);
   System.out.println("To String Details :"+ app);
   System.out.println("Hash Code value :"+app.hashCode());
   System.out.println("Original HashCode value :"+System.identityHashCode(app));
   MobileApp app2 = new MobileApp("TaskMaster", "Productivity", 4.2); // Same category

   boolean result26 = app.equals(app2);
   System.out.println("Are both apps in the same category? " + result26);


   System.out.println("-------------------------- 27 ---------------------------------");

   ArtGallery gallery = new ArtGallery("ColorCanvas", "Ravi Verma", 35);
   System.out.println("To String Details :"+ gallery);
   System.out.println("Hash Code value :"+gallery.hashCode());
   System.out.println("Original HashCode value :"+System.identityHashCode(gallery));

   ArtGallery gallery2 = new ArtGallery("ArtWorld", "Ravi Verma", 40); // Same artist

   boolean result27 = gallery.equals(gallery2);
   System.out.println("Do both galleries feature the same artist? " + result27);



   System.out.println("-------------------------- 28 ---------------------------------");
   SpaceMission mission = new SpaceMission("Chandrayaan-3", "14-July-2023", "Moon");
   System.out.println("To String Details :"+ mission);
   System.out.println("Hash Code value :"+mission.hashCode());
   System.out.println("Original HashCode value :"+System.identityHashCode(mission));
   SpaceMission mission2 = new SpaceMission("Artemis I", "16-November-2021", "Moon"); // Same destination

   boolean result28 = mission.equals(mission2);
   System.out.println("Do both missions have the same destination? " + result28);



   System.out.println("-------------------------- 29 ---------------------------------");
   Chef chef = new Chef("Sanjeev Kapoor", "Indian Cuisine", 25);
   System.out.println("To String Details :"+ chef);
   System.out.println("Hash Code value :"+chef.hashCode());
   System.out.println("Original HashCode value :"+System.identityHashCode(chef));
   Chef chef2 = new Chef("Vikas Khanna", "Indian Cuisine", 20); // Same specialty

   boolean result29 = chef.equals(chef2);
   System.out.println("Do both chefs specialize in the same cuisine? " + result29);

   System.out.println("-------------------------- 30 ---------------------------------");
   Doctor doctor = new Doctor("Neha Rao", "Dermatology", "Apollo Hospitals");
   System.out.println("To String Details :"+ doctor);
   System.out.println("Hash Code value :"+doctor.hashCode());
   System.out.println("Original HashCode value :"+System.identityHashCode(doctor));
   Doctor doctor2 = new Doctor("Amit Sharma", "Dermatology", "Max Hospitals"); // Same specialization

   boolean result30 = doctor.equals(doctor2);
   System.out.println("Do both doctors have the same specialization? " + result30);

   System.out.println("-------------------------- 31 ---------------------------------");
   Airport airport = new Airport("Kempegowda International Airport", "Bangalore", 2);
   System.out.println("To String Details :"+ airport);
   System.out.println("Hash Code value :"+airport.hashCode());
   System.out.println("Original HashCode value :"+System.identityHashCode(airport));

   Airport airport2 = new Airport("HAL Airport", "Bangalore", 1); // Same city

   boolean result31 = airport.equals(airport2);
   System.out.println("Do both airports serve the same city? " + result31);

   System.out.println("-------------------------- 32 ---------------------------------");


   TravelPackage trip = new TravelPackage("Himalayan Adventure", "Manali", 6);
   System.out.println("To String Details :"+ trip);
   System.out.println("Hash Code value :"+trip.hashCode());
   System.out.println("Original HashCode value :"+System.identityHashCode(trip));
   TravelPackage trip2 = new TravelPackage("Alpine Journey", "Manali", 8); // Same destination

   boolean result32 = trip.equals(trip2);
   System.out.println("Do both trips go to the same destination? " + result32);



   System.out.println("-------------------------- 33 ---------------------------------");
   Singer singer = new Singer("Arijit Singh", "Bollywood", 10);
   System.out.println("To String Details :"+ bankHolder);
   System.out.println("Hash Code value :"+bankHolder.hashCode());
   System.out.println("Original HashCode value :"+System.identityHashCode(bankHolder));
   Singer singer2 = new Singer("Shreya Ghoshal", "Bollywood", 15); // Same genre

   boolean result33 = singer.equals(singer2);
   System.out.println("Do both singers sing in the same genre? " + result33);



   System.out.println("-------------------------- 34 ---------------------------------");
   RealEstate estate = new RealEstate("Villa", "Electronic City", 9500000);
   System.out.println("To String Details :"+ singer);
   System.out.println("Hash Code value :"+singer.hashCode());
   System.out.println("Original HashCode value :"+System.identityHashCode(singer));
   RealEstate estate2 = new RealEstate("Apartment", "Electronic City", 8000000); // Same location

   boolean result34 = estate.equals(estate2);
   System.out.println("Are both properties located in the same area? " + result34);



   System.out.println("-------------------------- 35 ---------------------------------");
   LabTest test = new LabTest("Blood Sugar", "Ananya", 450);
   System.out.println("To String Details :"+ test);
   System.out.println("Hash Code value :"+test.hashCode());
   System.out.println("Original HashCode value :"+System.identityHashCode(test));
   LabTest test2 = new LabTest("Blood Sugar", "Ananya", 400); // Same test name and doctor

   boolean result35 = test.equals(test2);
   System.out.println("Are both lab tests the same? " + result35);


   System.out.println("--------------------------  36 ---------------------------------");
   Startup startup = new Startup("CodeSpark", "Ravi Sharma", 2022);
   System.out.println("To String Details :"+ startup);
   System.out.println("Hash Code value :"+startup.hashCode());
   System.out.println("Original HashCode value :"+System.identityHashCode(startup));
   Startup startup2 = new Startup("CodeSpark", "Ravi Sharma", 2021); // Same name and founder

   boolean result36 = startup.equals(startup2);
   System.out.println("Are both startups the same? " + result36);

   System.out.println("-------------------------- 37 ---------------------------------");
   Tourist tourist = new Tourist("Liam", "Canada", 12);
   System.out.println("To String Details :"+ tourist);
   System.out.println("Hash Code value :"+tourist.hashCode());
   System.out.println("Original HashCode value :"+System.identityHashCode(tourist));
   Tourist tourist2 = new Tourist("Liam", "Canada", 15); // Same name and country

   boolean result37 = tourist.equals(tourist2);
   System.out.println("Are both tourists the same? " + result37);



   System.out.println("-------------------------- 38 ---------------------------------");
   Customer customer = new Customer("Sneha", "sneha@email.com", true);
   System.out.println("To String Details :"+ customer);
   System.out.println("Hash Code value :"+customer.hashCode());
   System.out.println("Original HashCode value :"+System.identityHashCode(customer));
   Customer customer2 = new Customer("Sneha", "sneha@email.com", false); // Same name and email

   boolean result38 = customer.equals(customer2);
   System.out.println("Are both customers the same? " + result38);


   System.out.println("-------------------------- 39 ---------------------------------");
   DNASequence dna = new DNASequence("D1234", "ATCGTAGGCTA", 11);
   System.out.println("To String Details :"+ dna);
   System.out.println("Hash Code value :"+dna.hashCode());
   System.out.println("Original HashCode value :"+System.identityHashCode(dna));

   DNASequence dna2 = new DNASequence("D1234", "ATCGTAGGCTA", 10); // Same sequence ID and DNA sequence

   boolean result39 = dna.equals(dna2);
   System.out.println("Are both DNA sequences the same? " + result39);



   System.out.println("-------------------------- 40 ---------------------------------");
   Backpack bp = new Backpack("Wildcraft", 30, true);
   System.out.println("To String Details :"+ bp);
   System.out.println("Hash Code value :"+bp.hashCode());
   System.out.println("Original HashCode value :"+System.identityHashCode(bp));
   Backpack bp2 = new Backpack("Wildcraft", 30, false); // Same brand and capacity

   boolean result40 = bp.equals(bp2);
   System.out.println("Are both backpacks the same? " + result40);



   System.out.println("-------------------------- 41 ---------------------------------");
   CampingSite site = new CampingSite("Evergreen Pines", "Coorg", true);
   System.out.println("To String Details :"+ site);
   System.out.println("Hash Code value :"+site.hashCode());
   System.out.println("Original HashCode value :"+System.identityHashCode(site));
   CampingSite site2 = new CampingSite("Evergreen Pines", "Coorg", false); // Same site name and location

   boolean result41 = site.equals(site2);
   System.out.println("Are both camping sites the same? " + result41);



   System.out.println("-------------------------- 42 ---------------------------------");

   Product product = new Product("Bluetooth Speaker", "Electronics", 150);
   System.out.println("To String Details :"+ product);
   System.out.println("Hash Code value :"+product.hashCode());
   System.out.println("Original HashCode value :"+System.identityHashCode(product));
   Product product2 = new Product("Bluetooth Speaker", "Electronics", 120); // Same name and category

   boolean result42 = product.equals(product2);
   System.out.println("Are both products the same? " + result42);



   System.out.println("-------------------------- 43 ---------------------------------");
   BookStore store = new BookStore("Crossword", 2000, "Indiranagar");
   System.out.println("To String Details :"+ store);
   System.out.println("Hash Code value :"+store.hashCode());
   System.out.println("Original HashCode value :"+System.identityHashCode(store));
   BookStore store2 = new BookStore("Crossword", 2500, "Indiranagar"); // Same name and location

   boolean result43 = store.equals(store2);
   System.out.println("Are both bookstores the same? " + result43);


   System.out.println("-------------------------- 44 ---------------------------------");
   AIModel model = new AIModel("GPT-4", "4.0", "Text Generation");
   System.out.println("To String Details :"+ model);
   System.out.println("Hash Code value :"+model.hashCode());
   System.out.println("Original HashCode value :"+System.identityHashCode(model));
   AIModel model2 = new AIModel("GPT-4", "4.0", "Image Generation"); // Same model name and version

   boolean result44 = model.equals(model2);
   System.out.println("Are both AI models the same? " + result44);



   System.out.println("-------------------------- 45 ---------------------------------");
   University uni = new University("IIT Bombay", "India", 172);
   System.out.println("To String Details :"+ uni);
   System.out.println("Hash Code value :"+uni.hashCode());
   System.out.println("Original HashCode value :"+System.identityHashCode(uni));
   University uni2 = new University("IIT Bombay", "India", 200);
   boolean result45 = uni.equals(uni2);
   System.out.println("Are both universities the same? " + result45);

   System.out.println("-------------------------- 46 ---------------------------------");
   TheatreShow show = new TheatreShow("Hamlet", "English", "7:30 PM");
   System.out.println("To String Details :"+ show);
   System.out.println("Hash Code value :"+show.hashCode());
   System.out.println("Original HashCode value :"+System.identityHashCode(show));
   TheatreShow show2 = new TheatreShow("Hamlet", "English", "9:00 PM"); // Same name and language
   boolean result46 = show.equals(show2);
   System.out.println("Are both theatre shows the same? " + result46);



   System.out.println("-------------------------- 47 ---------------------------------");
   Tool tool = new Tool("Drill Machine", "Power Tool", true);
   System.out.println("To String Details :"+ tool);
   System.out.println("Hash Code value :"+tool.hashCode());
   System.out.println("Original HashCode value :"+System.identityHashCode(tool));
   Tool tool2 = new Tool("Drill Machine", "Power Tool", false); // Same name and type
   boolean result47 = tool.equals(tool2);
   System.out.println("Are both tools the same? " + result47);



   System.out.println("-------------------------- 48 ---------------------------------");
   Nurse nurse = new Nurse("Anita", 6, "ICU");
   System.out.println("To String Details :"+ nurse);
   System.out.println("Hash Code value :"+nurse.hashCode());
   System.out.println("Original HashCode value :"+System.identityHashCode(nurse));
   Nurse nurse2 = new Nurse("Anita", 6, "Emergency"); // Same name and experience
   boolean result48 = nurse.equals(nurse2);
   System.out.println("Are both nurses the same? " + result48);



   System.out.println("-------------------------- 49 ---------------------------------");
   PowerPlant plant = new PowerPlant("Thermax", "Thermal", 1500);
   System.out.println("To String Details :"+ plant);
   System.out.println("Hash Code value :"+plant.hashCode());
   System.out.println("Original HashCode value :"+System.identityHashCode(plant));
   PowerPlant plant2 = new PowerPlant("Thermax", "Thermal", 1800); // Same name and type
   boolean result49 = plant.equals(plant2);
   System.out.println("Are both power plants the same? " + result49);



   System.out.println("-------------------------- 50 ---------------------------------");
   Delivery delivery = new Delivery("PKG2025", "In Transit", "Hyderabad");
   System.out.println("To String Details :"+ delivery);
   System.out.println("Hash Code value :"+delivery.hashCode());
   System.out.println("Original HashCode value :"+System.identityHashCode(delivery));
   Delivery delivery2 = new Delivery("PKG2025", "In Transit", "Bangalore"); // Same ID and status
   boolean result50 = delivery.equals(delivery2);
   System.out.println("Are both deliveries the same? " + result50);



   System.out.println("-------------------------- 51 ---------------------------------");
   AlarmClock alarm = new AlarmClock("06:30", true, true);
   System.out.println("To String Details :"+ alarm);
   System.out.println("Hash Code value :"+alarm.hashCode());
   System.out.println("Original HashCode value :"+System.identityHashCode(alarm));
   AlarmClock alarm2 = new AlarmClock("06:30", true, false); // Same time and isSet
   boolean result51 = alarm.equals(alarm2);
   System.out.println("Are both alarms the same? " + result51);



   System.out.println("-------------------------- 52 ---------------------------------");
   MusicInstrument instrument = new MusicInstrument("Keyboard", "Percussion", true);
   System.out.println("To String Details :"+ instrument);
   System.out.println("Hash Code value :"+instrument.hashCode());
   System.out.println("Original HashCode value :"+System.identityHashCode(instrument));
   MusicInstrument instrument2 = new MusicInstrument("Keyboard", "Percussion", false); // Same name and type
   boolean result52 = instrument.equals(instrument2);
   System.out.println("Are both instruments the same? " + result52);


   System.out.println("-------------------------- 53 ---------------------------------");
   TrafficSignal signal = new TrafficSignal("BTM Layout", "Red", 45);
   System.out.println("To String Details :"+ signal);
   System.out.println("Hash Code value :"+signal.hashCode());
   System.out.println("Original HashCode value :"+System.identityHashCode(signal));
   TrafficSignal signal2 = new TrafficSignal("BTM Layout", "Red", 60); // Same location and color
   boolean result53 = signal.equals(signal2);
   System.out.println("Are both signals the same? " + result53);



   System.out.println("-------------------------- 54 ---------------------------------");
   Camera cam = new Camera("Canon", 24, true);
   System.out.println("To String Details :"+ cam);
   System.out.println("Hash Code value :"+cam.hashCode());
   System.out.println("Original HashCode value :"+System.identityHashCode(cam));

   Camera cam2 = new Camera("Canon", 24, false); // Same brand and megapixels
   boolean result54 = cam.equals(cam2);
   System.out.println("Are both cameras the same? " + result54);



   System.out.println("-------------------------- 55 ---------------------------------");
   InventoryItem item = new InventoryItem("USB Cable", 50, 199.99);
   System.out.println("To String Details :"+ item);
   System.out.println("Hash Code value :"+item.hashCode());
   System.out.println("Original HashCode value :"+System.identityHashCode(item));
   InventoryItem item2 = new InventoryItem("USB Cable", 30, 199.99); // Same item name and price
   boolean result55 = item.equals(item2);
   System.out.println("Are both inventory items the same? " + result55);




   System.out.println("-------------------------- 56 ---------------------------------");
   GymTrainer trainer = new GymTrainer("Rahul", 15, true);
   System.out.println("To String Details :"+ trainer);
   System.out.println("Hash Code value :"+trainer.hashCode());
   System.out.println("Original HashCode value :"+System.identityHashCode(trainer));
   GymTrainer trainer2 = new GymTrainer("Rahul", 15, false); // Same name and experience
   boolean result56 = trainer.equals(trainer2);
   System.out.println("Are both gym trainers the same? " + result56);




   System.out.println("-------------------------- 57 ---------------------------------");


   Actor actor = new Actor("Allu Arjun", 41, "Pushpa");
   Actor actor1 = new Actor("Puneeth raj kumar", 41, "Appu");
   System.out.println("To String Details :"+ actor);
   System.out.println("Hash Code value :"+actor.hashCode());
   System.out.println("Original HashCode value :"+System.identityHashCode(actor));

   boolean act = actor.equals(actor1);
   System.out.println("both actor ages are same :"+act);




   System.out.println("-------------------------- 58 ---------------------------------");

   AdventureTrip trip1 = new AdventureTrip("Manali", 5, true);
   System.out.println("To String Details :"+ trip1);
   System.out.println("Hash Code value :"+trip1.hashCode());
   System.out.println("Original HashCode value :"+System.identityHashCode(trip1));

   AdventureTrip adventureTrip = new AdventureTrip("Hampi",5,true);
   boolean result58 = trip1.equals(adventureTrip);
   System.out.println(result58);


   System.out.println("-------------------------- 59 ---------------------------------");
   Cycle cycle = new Cycle("Hero", 18, false);
   System.out.println("To String Details :"+ cycle);
   System.out.println("Hash Code value :"+cycle.hashCode());
   System.out.println("Original HashCode value :"+System.identityHashCode(cycle));
   Cycle cycle2 = new Cycle("Hero", 18, true); // Same brand and wheel size
   boolean result59 = cycle.equals(cycle2);
   System.out.println("Are both cycles the same? " + result59);



   System.out.println("-------------------------- 60 ---------------------------------");

   Painting painting = new Painting("Starry Night", "Vincent van Gogh", 1889);
   System.out.println("To String Details :"+ painting);
   System.out.println("Hash Code value :"+painting.hashCode());
   System.out.println("Original HashCode value :"+System.identityHashCode(painting));
   Painting painting2 = new Painting("Starry Night", "Vincent van Gogh", 1890); // Same name and artist
   boolean result60 = painting.equals(painting2);
   System.out.println("Are both paintings the same? " + result60);

   System.out.println("-------------------------- 61 ---------------------------------");
   MovieTicket movieTicket = new MovieTicket("KGF","A21",250);
   MovieTicket movieTicket2 = new MovieTicket("KGF", "A21", 250); // Same movie name, seat, and price

   System.out.println("To String Details :"+ movieTicket);
   System.out.println("Hash Code value :"+movieTicket.hashCode());
   System.out.println("Original HashCode value :"+System.identityHashCode(movieTicket));
   boolean result61 = movieTicket.equals(movieTicket2);
   System.out.println("Are both movie tickets the same? " + result61);



   System.out.println("-------------------------- 62 ---------------------------------");
   DeliveryPerson dp = new DeliveryPerson("Kiran", "South Zone", true);
   System.out.println("To String Details :"+ dp);
   System.out.println("Hash Code value :"+dp.hashCode());
   System.out.println("Original HashCode value :"+System.identityHashCode(dp));
   DeliveryPerson dp2 = new DeliveryPerson("Kiran", "South Zone", true); // Same name, zone, and availability
   boolean result62 = dp.equals(dp2);
   System.out.println("Are both delivery persons the same? " + result62);

   System.out.println("-------------------------- 63 ---------------------------------");
   Temple temple = new Temple("ISKCON", "Rajajinagar", true);
   System.out.println("To String Details :"+ temple);
   System.out.println("Hash Code value :"+temple.hashCode());
   System.out.println("Original HashCode value :"+System.identityHashCode(temple));
   Temple temple2 = new Temple("ISKCON", "Rajajinagar", true); // Same name, location, and open status
   boolean result63 = temple.equals(temple2);
   System.out.println("Are both temples the same? " + result63);



   System.out.println("-------------------------- 64 ---------------------------------");
   TVShow show1 = new TVShow("Stranger Things", "Sci-Fi", 4);
   System.out.println("To String Details :"+ show1);
   System.out.println("Hash Code value :"+show1.hashCode());
   System.out.println("Original HashCode value :"+System.identityHashCode(show1));
   TVShow show3 = new TVShow("Stranger Things", "Sci-Fi", 4); // Same name, genre, and seasons
   boolean result64 = show1.equals(show3);
   System.out.println("Are both TV shows the same? " + result64);



   System.out.println("-------------------------- 65 ---------------------------------");
   Furniture chair = new Furniture("Chair", "Wood", 1500.00);
   System.out.println("To String Details :"+ chair);
   System.out.println("Hash Code value :"+chair.hashCode());
   System.out.println("Original HashCode value :"+System.identityHashCode(chair));
   Furniture chair2 = new Furniture("Chair", "Wood", 1500.00); // Same item name, material, and price
   boolean result65 = chair.equals(chair2);
   System.out.println("Are both furniture items the same? " + result65);



   System.out.println("-------------------------- 66 ---------------------------------");
   ElectricVehicle ev = new ElectricVehicle("Tata Nexon EV", 320, true);
   System.out.println("To String Details :"+ ev);
   System.out.println("Hash Code value :"+ev.hashCode());
   System.out.println("Original HashCode value"+System.identityHashCode(ev));
   ElectricVehicle ev2 = new ElectricVehicle("Tata Nexon EV", 320, true); // Same model, range, and availability
   boolean result66 = ev.equals(ev2);
   System.out.println("Are both electric vehicles the same? " + result66);



   System.out.println("-------------------------- 67 ---------------------------------");

   Drone drone = new Drone("DJI Mini 3", 31.5, true);
   System.out.println("To String Details :"+ drone);
   System.out.println("Hash Code value :"+drone.hashCode());
   System.out.println("Original HashCode value :"+System.identityHashCode(drone));
   Drone drone2 = new Drone("DJI Mini 3", 31.5, true);
   boolean result67 = drone.equals(drone2);
   System.out.println("Are both drones the same? " + result67);



   System.out.println("-------------------------- 68 ---------------------------------");

   OnlineOrder order = new OnlineOrder("ORD1023", "Bluetooth Speaker", 2299.99);
   System.out.println("To String Details :"+ order);
   System.out.println("Hash Code value :"+order.hashCode());
   System.out.println("Original HashCode value :"+System.identityHashCode(order));
   OnlineOrder order2 = new OnlineOrder("ORD1023", "Bluetooth Speaker", 2299.99);
   boolean result68 = order.equals(order2);
   System.out.println("Are both orders the same? " + result68);



   System.out.println("-------------------------- 69 ---------------------------------");
   AppUpdate update = new AppUpdate("WhatsApp", "2.24.8.1", true);
   System.out.println("To String Details :"+ update);
   System.out.println("Hash Code value :"+update.hashCode());
   System.out.println("Original HashCode value :"+System.identityHashCode(update));
   AppUpdate update2 = new AppUpdate("WhatsApp", "2.24.8.1", true);
   boolean result69 = update.equals(update2);
   System.out.println("Are both app updates the same? " + result69);



   System.out.println("-------------------------- 70 ---------------------------------");
   ParkingSlot slot = new ParkingSlot("A12", true, "Car");
   System.out.println("To String Details :"+ slot);
   System.out.println("Hash Code value :"+slot.hashCode());
   System.out.println("Original HashCode value :"+System.identityHashCode(slot));
   ParkingSlot slot2 = new ParkingSlot("A12", true, "Car");
   boolean result70 = slot.equals(slot2);
   System.out.println("Are both parking slots the same? " + result70);


   System.out.println("-------------------------- 71 ---------------------------------");

   YouTuber youtuber = new YouTuber("TechGuru", "Tech Reviews", 520);
   System.out.println("To String Details :"+ youtuber);
   System.out.println("Hash Code value :"+youtuber.hashCode());
   System.out.println("Original HashCode value :"+System.identityHashCode(youtuber));
   YouTuber youtuber2 = new YouTuber("TechGuru", "Tech Reviews", 520);
   boolean result71 = youtuber.equals(youtuber2);
   System.out.println("Are both YouTubers the same? " + result71);

   System.out.println("-------------------------- 72 ---------------------------------");

   BusStop stop = new BusStop("Majestic", "Route 222", true);
   System.out.println("To String Details :"+ stop);
   System.out.println("Hash Code value :"+stop.hashCode());
   System.out.println("Original HashCode value :"+System.identityHashCode(stop));
   BusStop stop2 = new BusStop("Majestic", "Route 222", true); // Same bus stop name, route, and operational status
   boolean result72 = stop.equals(stop2);
   System.out.println("Are both bus stops the same? " + result72);



   System.out.println("-------------------------- 73 ---------------------------------");
   PodcastEpisode ep = new PodcastEpisode("Tech Trends", "Ravi", 35);
   System.out.println("To String Details :"+ ep);
   System.out.println("Hash Code value :"+ep.hashCode());
   System.out.println("Original HashCode value :"+System.identityHashCode(ep));
   PodcastEpisode ep2 = new PodcastEpisode("Tech Trends", "Ravi", 35); // Same episode title, host, and duration
   boolean result73 = ep.equals(ep2);
   System.out.println("Are both podcast episodes the same? " + result73);


   System.out.println("-------------------------- 74 ---------------------------------");
   FitnessTracker ft = new FitnessTracker("Abhi", 9876, 320.5);
   System.out.println("To String Details :"+ ft);
   System.out.println("Hash Code value :"+ft.hashCode());
   System.out.println("Original HashCode value :"+System.identityHashCode(ft));
   FitnessTracker ft2 = new FitnessTracker("Abhi", 9876, 320.5); // Same name, tracker ID, and total distance
   boolean result74 = ft.equals(ft2);
   System.out.println("Are both fitness trackers the same? " + result74);


   System.out.println("-------------------------- 75 ---------------------------------");
   LaundryService ls = new LaundryService("Sneha", 15, true);
   System.out.println("To String Details :"+ ls);
   System.out.println("Hash Code value :"+ls.hashCode());
   System.out.println("Original HashCode value :"+System.identityHashCode(ls));
   LaundryService ls2 = new LaundryService("Sneha", 15, true); // Same customer name, number of items, and service status
   boolean result75 = ls.equals(ls2);
   System.out.println("Are both laundry services the same? " + result75);



   System.out.println("-------------------------- 76 ---------------------------------");
   ElectionCandidate candidate = new ElectionCandidate("Ravi Kumar", "Green Party", 45);
   System.out.println("To String Details :"+ candidate);
   System.out.println("Hash Code value :"+candidate.hashCode());
   System.out.println("Original HashCode value :"+System.identityHashCode(candidate));
   ElectionCandidate candidate2 = new ElectionCandidate("Ravi Kumar", "Green Party", 45); // Same name, party, and age
   boolean result76 = candidate.equals(candidate2);
   System.out.println("Are both election candidates the same? " + result76);


   System.out.println("-------------------------- 77 ---------------------------------");
   ATMTransaction txn = new ATMTransaction("TXN1009", "Withdrawal", 5000);
   System.out.println("To String Details :"+ txn);
   System.out.println("Hash Code value :"+txn.hashCode());
   System.out.println("Original HashCode value :"+System.identityHashCode(txn));
   ATMTransaction txn2 = new ATMTransaction("TXN1009", "Withdrawal", 5000); // Same transaction ID, type, and amount
   boolean result77 = txn.equals(txn2);
   System.out.println("Are both ATM transactions the same? " + result77);



   System.out.println("-------------------------- 78 ---------------------------------");

   ThemePark park = new ThemePark("Wonderla", 50, true);
   System.out.println("To String Details :"+ park);
   System.out.println("Hash Code value :"+park.hashCode());
   System.out.println("Original HashCode value :"+System.identityHashCode(park));
   ThemePark park2 = new ThemePark("Wonderla", 50, true); // Same park name, number of rides, and operational status
   boolean result78 = park.equals(park2);
   System.out.println("Are both theme parks the same? " + result78);


   System.out.println("-------------------------- 79 ---------------------------------");
   BloodDonor donor = new BloodDonor("Arjun", "O+", 7);
   System.out.println("To String Details :"+ donor);
   System.out.println("Hash Code value :"+donor.hashCode());
   System.out.println("Original HashCode value :"+System.identityHashCode(donor));
   BloodDonor donor2 = new BloodDonor("Arjun", "O+", 7); // Same name, blood type, and number of donations
   boolean result79 = donor.equals(donor2);
   System.out.println("Are both blood donors the same? " + result79);


   System.out.println("-------------------------- 80 ---------------------------------");
   ElectricBill bill = new ElectricBill("Geetha", 350, 2100.50);
   System.out.println("To String Details :"+ bill);
   System.out.println("Hash Code value :"+bill.hashCode());
   System.out.println("Original HashCode value :"+System.identityHashCode(bill));
   ElectricBill bill2 = new ElectricBill("Geetha", 350, 2100.50); // Same name, units consumed, and bill amount
   boolean result80 = bill.equals(bill2);
   System.out.println("Are both electric bills the same? " + result80);



   System.out.println("-------------------------- 81 ---------------------------------");
   TattooArtist artist = new TattooArtist("Riya", "Minimalist", 380);
   System.out.println("To String Details :"+ artist);
   System.out.println("Hash Code value :"+artist.hashCode());
   System.out.println("Original HashCode value :"+System.identityHashCode(artist));
   TattooArtist artist2 = new TattooArtist("Riya", "Minimalist", 380); // Same artist name, style, and number of tattoos
   boolean result81 = artist.equals(artist2);
   System.out.println("Are both tattoo artists the same? " + result81);



   System.out.println("-------------------------- 82 ---------------------------------");
   RecyclingCenter rc = new RecyclingCenter("Pune", 560, true);
   System.out.println("To String Details :"+ rc);
   System.out.println("Hash Code value :"+rc.hashCode());
   System.out.println("Original HashCode value :"+System.identityHashCode(rc));
   RecyclingCenter rc2 = new RecyclingCenter("Pune", 560, true); // Same center name, number of materials recycled, and operational status
   boolean result82 = rc.equals(rc2);
   System.out.println("Are both recycling centers the same? " + result82);




   System.out.println("-------------------------- 83 ---------------------------------");
   ZooAnimal animal = new ZooAnimal("Lion", "Simba", 5);
   System.out.println("To String Details :"+ animal);
   System.out.println("Hash Code value :"+animal.hashCode());
   System.out.println("Original HashCode value :"+System.identityHashCode(animal));
   ZooAnimal animal2 = new ZooAnimal("Lion", "Simba", 5); // Same animal type, name, and age
   boolean result83 = animal.equals(animal2);
   System.out.println("Are both zoo animals the same? " + result83);



   System.out.println("-------------------------- 84 ---------------------------------");
   GamingConsole console = new GamingConsole("Sony", "PS5", 825);
   System.out.println("To String Details :"+ console);
   System.out.println("Hash Code value :"+console.hashCode());
   System.out.println("Original HashCode value :"+System.identityHashCode(console));
   GamingConsole console2 = new GamingConsole("Sony", "PS5", 825); // Same brand, model, and storage capacity
   boolean result84 = console.equals(console2);
   System.out.println("Are both gaming consoles the same? " + result84);



   System.out.println("-------------------------- 85 ---------------------------------");
   ElectricScooter scooter = new ElectricScooter("Ather", 108, true);
   System.out.println("To String Details :"+ scooter);
   System.out.println("Hash Code value :"+scooter.hashCode());
   System.out.println("Original HashCode value :"+System.identityHashCode(scooter));
   ElectricScooter scooter2 = new ElectricScooter("Ather", 108, true); // Same brand, speed, and operational status
   boolean result85 = scooter.equals(scooter2);
   System.out.println("Are both electric scooters the same? " + result85);




   System.out.println("-------------------------- 86 ---------------------------------");
   BakeryItem item1 = new BakeryItem("Cupcake", "Red Velvet", 80.0);
   System.out.println("To String Details :"+ item1);
   System.out.println("Hash Code value :"+item1.hashCode());
   System.out.println("Original HashCode value :"+System.identityHashCode(item1));
   BakeryItem item3 = new BakeryItem("Cupcake", "Red Velvet", 80.0); // Same item name, flavor, and price
   boolean result86 = item1.equals(item3);
   System.out.println("Are both bakery items the same? " + result86);



   System.out.println("-------------------------- 87 ---------------------------------");

   NewsArticle article = new NewsArticle("AI Reshaping the World", "K. Abhishek", "Technology");
   System.out.println("To String Details :"+ article);
   System.out.println("Hash Code value :"+article.hashCode());
   System.out.println("Original HashCode value :"+System.identityHashCode(article));
   NewsArticle article2 = new NewsArticle("AI Reshaping the World", "K. Abhishek", "Technology"); // Same title, author, and category
   boolean result87 = article.equals(article2);
   System.out.println("Are both news articles the same? " + result87);




   System.out.println("-------------------------- 88 ---------------------------------");
   Sneaker shoe = new Sneaker("Nike", "White", 9);
   System.out.println("To String Details :"+ shoe);
   System.out.println("Hash Code value :"+shoe.hashCode());
   System.out.println("Original HashCode value :"+System.identityHashCode(shoe));
   Sneaker shoe2 = new Sneaker("Nike", "White", 9); // Same brand, color, and size
   boolean result88 = shoe.equals(shoe2);
   System.out.println("Are both sneakers the same? " + result88);



   System.out.println("-------------------------- 89 ---------------------------------");
   EBook ebook = new EBook("Digital Fortress", "Dan Brown", 2.5);
   System.out.println("To String Details :"+ ebook);
   System.out.println("Hash Code value :"+ebook.hashCode());
   System.out.println("Original HashCode value :"+System.identityHashCode(ebook));
   EBook ebook2 = new EBook("Digital Fortress", "Dan Brown", 2.5); // Same title, author, and file size
   boolean result89 = ebook.equals(ebook2);
   System.out.println("Are both eBooks the same? " + result89);



   System.out.println("-------------------------- 90 ---------------------------------");

   MusicPlaylist playlist = new MusicPlaylist("Morning Chill", "Lo-Fi", 25);
   System.out.println("To String Details :"+ playlist);
   System.out.println("Hash Code value :"+playlist.hashCode());
   System.out.println("Original HashCode value :"+System.identityHashCode(playlist));
   MusicPlaylist playlist2 = new MusicPlaylist("Morning Chill", "Lo-Fi", 25); // Same playlist name, genre, and number of songs
   boolean result90 = playlist.equals(playlist2);
   System.out.println("Are both music playlists the same? " + result90);



   System.out.println("-------------------------- 91 ---------------------------------");
   HikingTrail trail = new HikingTrail("Nandi Hills", 8, true);
   System.out.println("To String Details :"+ trail);
   System.out.println("Hash Code value :"+trail.hashCode());
   System.out.println("Original HashCode value :"+System.identityHashCode(trail));
   HikingTrail trail2 = new HikingTrail("Nandi Hills", 8, true); // Same trail name, difficulty level, and open status
   boolean result91 = trail.equals(trail2);
   System.out.println("Are both hiking trails the same? " + result91);



   System.out.println("-------------------------- 92 ---------------------------------");
   CodingContest contest = new CodingContest("Code Rush", "HackerRank", 3);
   System.out.println("To String Details :"+ contest);
   System.out.println("Hash Code value :"+contest.hashCode());
   System.out.println("Original HashCode value :"+System.identityHashCode(contest));
   CodingContest contest2 = new CodingContest("Code Rush", "HackerRank", 3); // Same contest name, platform, and difficulty level
   boolean result92 = contest.equals(contest2);
   System.out.println("Are both coding contests the same? " + result92);



   System.out.println("-------------------------- 93 ---------------------------------");

   HomeAppliance appliance = new HomeAppliance("Microwave", "Samsung", 1200);
   System.out.println("To String Details :"+ appliance);
   System.out.println("Hash Code value :"+appliance.hashCode());
   System.out.println("Original HashCode value :"+System.identityHashCode(appliance));
   HomeAppliance appliance2 = new HomeAppliance("Microwave", "Samsung", 1200); // Same appliance type, brand, and power
   boolean result93 = appliance.equals(appliance2);
   System.out.println("Are both home appliances the same? " + result93);



   System.out.println("-------------------------- 94 ---------------------------------");
   CityMetroCard card = new CityMetroCard("Divya", 300, true);
   System.out.println("To String Details :"+ card);
   System.out.println("Hash Code value :"+card.hashCode());
   System.out.println("Original HashCode value :"+System.identityHashCode(card));
   CityMetroCard card2 = new CityMetroCard("Divya", 300, true); // Same cardholder name, balance, and active status
   boolean result94 = card.equals(card2);
   System.out.println("Are both metro cards the same? " + result94);




   System.out.println("-------------------------- 95 ---------------------------------");
   MuseumExhibit exhibit = new MuseumExhibit("Ancient Sword", "Medieval", true);
   System.out.println("To String Details :"+ exhibit);
   System.out.println("Hash Code value :"+exhibit.hashCode());
   System.out.println("Original HashCode value :"+System.identityHashCode(exhibit));
   MuseumExhibit exhibit2 = new MuseumExhibit("Ancient Sword", "Medieval", true); // Same exhibit name, category, and display status
   boolean result95 = exhibit.equals(exhibit2);
   System.out.println("Are both museum exhibits the same? " + result95);



   System.out.println("-------------------------- 96 ---------------------------------");
   DroneDelivery delivery4 = new DroneDelivery("PK123", "Koramangala", false);
   System.out.println("To String Details :"+ delivery4);
   System.out.println("Hash Code value :"+delivery4.hashCode());
   System.out.println("Original HashCode value :"+System.identityHashCode(delivery4));
   DroneDelivery delivery3 = new DroneDelivery("PK123", "Koramangala", false); // Same delivery ID, destination, and delivery status
   boolean result96 = delivery4.equals(delivery3);
   System.out.println("Are both drone deliveries the same? " + result96);




   System.out.println("-------------------------- 97 ---------------------------------");
   EventTicket ticket3 = new EventTicket("Comic Con", "B12", 599.0);
   System.out.println("To String Details :"+ ticket1);
   System.out.println("Hash Code value :"+ticket1.hashCode());
   System.out.println("Original HashCode value :"+System.identityHashCode(ticket1));
   EventTicket ticket2 = new EventTicket("Comic Con", "B12", 599.0); // Same event name, seat number, and price
   boolean result97 = ticket3.equals(ticket2);
   System.out.println("Are both event tickets the same? " + result97);



   System.out.println("-------------------------- 98 ---------------------------------");
   MountainTrail mt = new MountainTrail("Kudremukh", 850, true);
   System.out.println("To String Details :"+ mt);
   System.out.println("Hash Code value :"+mt.hashCode());
   System.out.println("Original HashCode value :"+System.identityHashCode(mt));
   MountainTrail mt2 = new MountainTrail("Kudremukh", 850, true); // Same trail name, difficulty level, and open status
   boolean result98 = mt.equals(mt2);
   System.out.println("Are both mountain trails the same? " + result98);



   System.out.println("-------------------------- 99 ---------------------------------");

   ForestTrail ft1 = new ForestTrail("Dandeli", 5, true);
   System.out.println("To String Details :"+ ft1);
   System.out.println("Hash Code value :"+ft1.hashCode());
   System.out.println("Original HashCode value :"+System.identityHashCode(ft1));
   ForestTrail ft3 = new ForestTrail("Dandeli", 5, true); // Same trail name, difficulty level, and open status
   boolean result99 = ft1.equals(ft3);
   System.out.println("Are both forest trails the same? " + result99);



   System.out.println("-------------------------- 100 ---------------------------------");

   TrailMap map = new TrailMap("Western Ghats", 22, 4);
   System.out.println("To String Details :"+ map);
   System.out.println("Hash Code value :"+map.hashCode());
   System.out.println("Original HashCode value :"+System.identityHashCode(map));
   TrailMap map2 = new TrailMap("Western Ghats", 22, 4); // Same trail name, number of routes, and difficulty level
   boolean result100 = map.equals(map2);
   System.out.println("Are both trail maps the same? " + result100);



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
