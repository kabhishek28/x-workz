class Paper{
    
    public static void setSize(String size) {
        System.out.println("size: " + size);
    }

    public static void setType(String type) {
        System.out.println("type: " + type);
    }

    public static void setWeight(double weight) {
        System.out.println("weight: " + weight);
    }

    
    public static void setDimensions(double width, double height) {
        System.out.println("width: " + width + " height: " + height);
    }

    public static void setThickness(double thickness, String quality) {
        System.out.println("thickness: " + thickness + " quality: " + quality);
    }

    
    public static void setPaperDetails(String size, String type, double weight) {
        System.out.println("size: " + size + " type: " + type + " weight: " + weight);
    }

    public static void setPaperInfo(String brand, int sheets, double price) {
        System.out.println("brand: " + brand + " sheets: " + sheets + " price: " + price);
    }

    
}