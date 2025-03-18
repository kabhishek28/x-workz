class Dmart{
    
    public static void selectProduct(String productName) {
        System.out.println("productName :" +productName);
    }

    
    public static void showPrice(double price) {
        System.out.println("price :"+price);
    }

   
        public static void isAvailable(boolean available) {
        System.out.println("available :"+ available);
    }

   
    public static void buyProduct(String productName, double price) {
        System.out.println("productName :"+ productName + " " + "price :" +price);
    }

    
    public static void purchaseProduct(String productName, int quantity) {
        System.out.println("productName :"+productName + " " +"quantity :"+ quantity);
    }

    
    public static void checkout(String productName, int quantity, double totalPrice) {
        System.out.println("productName :" + productName + " " + "quantity :"+quantity + " " + "totalPrice :" +totalPrice);
    }

    
    public static void applyDiscount(String category, String productName, double discount) {
        System.out.println("category :" +category + " " + "productName :"+productName + " " + "discount :" + discount);
    }
}