class Supra{
    public static void modelName(){
		System.out.println("invoking the method of Globe form 7.6 to 7.10");
		Globe.latitudeLongitude();
		System.out.println("invoking methods of class Supra from 8.1 - 8.5");
        System.out.println("8.1.Model: Toyota GR Supra");
		engine();
    }

    public static void engine() {
        System.out.println("8.2.Engine: 3.0L Twin-Scroll Turbo Inline-6");
		horsepower();
    }

    public static void horsepower() {
        System.out.println("8.3.Horsepower: 382 HP");
		topSpeed();
    }

    public static void topSpeed() {
        System.out.println("8.4.Top Speed: 250 km/h (155 mph)");
		acceleration();
    }

    public static void acceleration() {
        System.out.println("8.5.---0-100 km/h: 4.1 seconds");
    }



    public static void transmission() {
        System.out.println("8.6.  Transmission: 8-Speed Automatic / 6-Speed Manual");
		fuelEfficiency();
    }

    public static void fuelEfficiency() {
        System.out.println("8.7. Fuel Efficiency: 10 km/l (approx.)");
		design();
		
    }

    public static void design() {
        System.out.println(" 8.8. Design: Aerodynamic coupe with aggressive styling");
		price();
    }

    public static void price() {
        System.out.println("8.9. Price: Around $55,000 USD");
		origin();
    }

    public static void origin() {
        System.out.println("8.10.Origin: Manufactured in Austria by Toyota & BMW");
    }

    public static void main(String[] args) {
		
		modelName();
		
		
		
		
		
		
        
      
        
    }
}
