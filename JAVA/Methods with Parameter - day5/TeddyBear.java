class TeddyBear {
    
    public static void selectTeddy(String teddyName) {
        System.out.println("Teddy Bear Name: " + teddyName);
    }

    
    public static void selectBySize(int size) {
        System.out.println("bear of size: " + size + "cm.");
    }

   
    public static void selectByPrice(double price) {
        System.out.println("Teddy Bear price: "+ price);
    }
	
    
    public static void orderTeddy(String teddyName, int size) {
        System.out.println(" Teddy Bear Name: " + teddyName + " size; " + size + "cm.");
    }

    
    public static void buyTeddy(String teddyName, double price) {
        System.out.println("Teddy Bear Name; " + teddyName + " Price; " + price);
    }

    
    public static void giftTeddy(String teddyName, int size, double price) {
        System.out.println("Teddy Bear Name; " + teddyName + " size; " + size + "cm." +"prince; "+ price);
    }

    
    public static void customTeddy(String teddyName, String color, int quantity) {
        System.out.println("Teddy Bear Name: " + teddyName + "color; " + color + " quantity; " + quantity);
    }
}