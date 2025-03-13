class Beer {
    
    public static void selectBeer(String beerName) {
        System.out.println("Beer Name : " + beerName);
    }
	
	public static void selectByQuantity(int quantity) {
    System.out.println("Quantity :" + quantity );
	}
	
	public static void selectByAlcoholPercentage(double alcoholPercentage) {
    System.out.println("Beer with alcohol percentage: " + alcoholPercentage + "%");
	}

    
    

    
    public static void orderBeer(String beerName, int quantity) {
        System.out.println("beer name :"+ beerName + "quantity :" + quantity  );
    }

    
    public static void orderBeerWithPrice(String beerName, double pricePerBottle) {
        System.out.println("Beer name " + beerName + " with price per bottle: $" + pricePerBottle);
    }

    
    public static void orderBeerTotalPrice(String beerName, int quantity, double totalPrice) {
        System.out.println("beer name  :" + beerName +" quantity : " + quantity +  " with total price: $" + totalPrice);
    }

    
    public static void orderBeerByBrand(String brand, double alcoholPercentage, int quantity) {
        System.out.println("Brand name :" + brand + " alcoholPercentage : " + alcoholPercentage + " quantity : " + quantity );
    }

    
    
}