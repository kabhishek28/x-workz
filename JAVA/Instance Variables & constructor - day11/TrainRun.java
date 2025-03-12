class TrainRun{
	public static void main(String[] args){
		System.out.println("-------------------------invoking Train1-------------------------");
		Train train1 = new Train();
		train1.name = "SMVT";
		train1.numberOfCoaches = 18;
		train1.maxSpeed = 110.0;
		train1.fuelType = "diesel";
		System.out.println("Train Name: " + train1.name + "\n Number of Coaches: " + train1.numberOfCoaches + "\n Max Speed: " + train1.maxSpeed + " km/h\nFuel Type: " + train1.fuelType);

        System.out.println("--------------------Invoking Train2----------------");
        Train train2 = new Train();
        train2.name = "Bullet Train";
        train2.numberOfCoaches = 10;
        train2.maxSpeed = 350.0;
        train2.fuelType = "Electric";
        System.out.println("Train Name: " + train2.name + "\nNumber of Coaches: " + train2.numberOfCoaches + "\nMax Speed: " + train2.maxSpeed + " km/h\nFuel Type: " + train2.fuelType);

        System.out.println("--------------------Invoking Train3----------------");
        Train train3 = new Train();
        train3.name = "Rajdhani Express";
        train3.numberOfCoaches = 20;
        train3.maxSpeed = 130.0;
        train3.fuelType = "Diesel-Electric";
        System.out.println("Train Name: " + train3.name + "\nNumber of Coaches: " + train3.numberOfCoaches + "\nMax Speed: " + train3.maxSpeed + " km/h\nFuel Type: " + train3.fuelType);

        System.out.println("--------------------Invoking Train4----------------");
        Train train4 = new Train();
        train4.name = "Duronto Express";
        train4.numberOfCoaches = 18;
        train4.maxSpeed = 140.0;
        train4.fuelType = "Diesel";
        System.out.println("Train Name: " + train4.name + "\nNumber of Coaches: " + train4.numberOfCoaches + "\nMax Speed: " + train4.maxSpeed + " km/h\nFuel Type: " + train4.fuelType);

        System.out.println("--------------------Invoking Train5----------------");
        Train train5 = new Train();
        train5.name = "Eurostar";
        train5.numberOfCoaches = 14;
        train5.maxSpeed = 300.0;
        train5.fuelType = "Electric";
        System.out.println("Train Name: " + train5.name + "\nNumber of Coaches: " + train5.numberOfCoaches + "\nMax Speed: " + train5.maxSpeed + " km/h\nFuel Type: " + train5.fuelType);

        System.out.println("--------------------Invoking Train6----------------");
        Train train6 = new Train();
        train6.name = "Maglev";
        train6.numberOfCoaches = 8;
        train6.maxSpeed = 600.0;
        train6.fuelType = "Magnetic Levitation";
        System.out.println("Train Name: " + train6.name + "\nNumber of Coaches: " + train6.numberOfCoaches + "\nMax Speed: " + train6.maxSpeed + " km/h\nFuel Type: " + train6.fuelType);

        System.out.println("--------------------Invoking Train7----------------");
        Train train7 = new Train();
        train7.name = "Vande Bharat Express";
        train7.numberOfCoaches = 16;
        train7.maxSpeed = 180.0;
        train7.fuelType = "Electric";
        System.out.println("Train Name: " + train7.name + "\nNumber of Coaches: " + train7.numberOfCoaches + "\nMax Speed: " + train7.maxSpeed + " km/h\nFuel Type: " + train7.fuelType);

        System.out.println("--------------------Invoking Train8----------------");
        Train train8 = new Train();
        train8.name = "Indian Mountain Railway";
        train8.numberOfCoaches = 5;
        train8.maxSpeed = 40.0;
        train8.fuelType = "Steam";
        System.out.println("Train Name: " + train8.name + "\nNumber of Coaches: " + train8.numberOfCoaches + "\nMax Speed: " + train8.maxSpeed + " km/h\nFuel Type: " + train8.fuelType);

        System.out.println("--------------------Invoking Train9----------------");
        Train train9 = new Train();
        train9.name = "TGV";
        train9.numberOfCoaches = 12;
        train9.maxSpeed = 320.0;
        train9.fuelType = "Electric";
        System.out.println("Train Name: " + train9.name + "\nNumber of Coaches: " + train9.numberOfCoaches + "\nMax Speed: " + train9.maxSpeed + " km/h\nFuel Type: " + train9.fuelType);

        System.out.println("--------------------Invoking Train10----------------");
        Train train10 = new Train();
        train10.name = "Amtrak Acela";
        train10.numberOfCoaches = 9;
        train10.maxSpeed = 240.0;
        train10.fuelType = "Electric";
        System.out.println("Train Name: " + train10.name + "\nNumber of Coaches: " + train10.numberOfCoaches + "\nMax Speed: " + train10.maxSpeed + " km/h\nFuel Type: " + train10.fuelType);
    }
}