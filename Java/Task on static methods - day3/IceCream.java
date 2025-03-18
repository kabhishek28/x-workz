class IceCream{
    public static void flavor() {
		System.out.println("invoking the methods of class Supra form 8.6 to 8.10");
		Supra.transmission();
		System.out.println("invoking the method of class IceCream from 9.1 to  9.5");
        System.out.println("9.1. Flavor: Chocolate");
		ingredients();
    }

    public static void ingredients() {
        System.out.println("9.2.Ingredients: Milk, Sugar, Cream, Cocoa");
		texture();
    }

    public static void texture() {
        System.out.println("9.3.Texture: Smooth and creamy");
		temperature();
    }

    public static void temperature() {
        System.out.println("9.4.Temperature: Served at -18°C");
		toppings();
    }

    public static void toppings() {
        System.out.println("9.5.Toppings: Nuts, Sprinkles, Chocolate Syrup");
    }

    public static void coneOrCup() {
        System.out.println("9.6.Served In: Cone or Cup");
		calories();
    }

    public static void calories() {
        System.out.println("9.7.Calories: Around 200 kcal per scoop");
		price();
    }

    public static void price() {
        System.out.println("9.8.Price: $3 per scoop");
		brand();
    }

    public static void brand() {
        System.out.println("9.9.Popular Brands: Baskin Robbins, Ben & Jerry's, Haagen-Dazs");
		origin();
		
    }

    public static void origin() {
        System.out.println("9.10.Origin: Ancient China and Persia");
		
        
    }

    public static void main(String[] args) {
        
		flavor();
		
    }
}