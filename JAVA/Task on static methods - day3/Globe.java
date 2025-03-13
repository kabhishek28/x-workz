class Globe{
    public static void shape() {
		System.out.println("invoking the methods iplCup class from 6.6 to 6.10");
		IPLCup.currentChampion();
		System.out.println("invoking the methods Globe class from 7.1 to 7.5");
        System.out.println("7.1.Shape: Spherical representation of Earth");
		material();
    }

    public static void material() {
        System.out.println("7.2.Material: Usually made of plastic, metal, or paper");
		continents();
    }

    public static void continents() {
        System.out.println("7.3.Continents: Asia, Africa, North America, South America, Antarctica, Europe, Australia");
		oceans();
    }

    public static void oceans() {
        System.out.println("7.4.Oceans: Pacific, Atlantic, Indian, Southern, Arctic");
		countries();
    }

    public static void countries() {
        System.out.println("7.5.Countries: Over 195 countries marked on the globe");
    }

    public static void latitudeLongitude() {
        System.out.println("7.6.Latitude & Longitude: Displays Earth's coordinate system");
		axisTilt();
    }

    public static void axisTilt() {
        System.out.println("7.7.Axis Tilt: Tilted at 23.5 degrees to represent Earth's rotation");
		equator();
    }

    public static void equator() {
        System.out.println("7.8.Equator: The imaginary line dividing the Earth into Northern and Southern Hemispheres");
		timeZones();
    }

    public static void timeZones() {
        System.out.println("7.9.Time Zones: Shows different time zones across the world");
		purpose();
    }

    public static void purpose() {
        System.out.println("7.10.Purpose: Used for geography studies and understanding world maps");
    }

    public static void main(String[] args) {
		
		
		

        shape();
		
		

        
        
        
    }
}
