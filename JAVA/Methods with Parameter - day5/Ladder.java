class Ladder{
    
    public static void setHeight(int height) {
        System.out.println("height: " + height);
    }

    public static void setMaterial(String material) {
        System.out.println("material: " + material);
    }

    public static void setSteps(int steps) {
        System.out.println("steps: " + steps);
    }

    
    public static void setDimensions(int height, int width) {
        System.out.println("height: " + height + " width: " + width);
    }

    public static void setWeightCapacity(double weightCapacity, String material) {
        System.out.println("weightCapacity: " + weightCapacity + " material: " + material);
    }

    
    public static void setLadderDetails(String brand, int height, int steps) {
        System.out.println("brand: " + brand + " height: " + height + " steps: " + steps);
    }

    public static void setLadderInfo(String material, double weightCapacity, double price) {
        System.out.println("material: " + material + " weightCapacity: " + weightCapacity + " price: " + price);
    }

   
}