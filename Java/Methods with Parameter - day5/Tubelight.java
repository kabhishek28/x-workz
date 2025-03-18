class Tubelight{
	
    public static void setWattage(int wattage) {
        System.out.println("wattage: " + wattage);
    }

    public static void setBrand(String brand) {
        System.out.println("brand: " + brand);
    }

    public static void setLength(double length) {
        System.out.println("length: " + length);
    }
    
    public static void setPowerConsumption(int wattage, double voltage) {
        System.out.println("wattage: " + wattage + " voltage: " + voltage);
    }

    public static void setLightColor(String color, String type) {
        System.out.println("color: " + color + " type: " + type);
    }

    
    public static void setTubelightDetails(String brand, int wattage, double length) {
        System.out.println("brand: " + brand + " wattage: " + wattage + " length: " + length);
    }

    public static void setTubelightInfo(String type, String color, double price) {
        System.out.println("type: " + type + " color: " + color + " price: " + price);
    }
}