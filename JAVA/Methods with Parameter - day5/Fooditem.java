class Fooditem{
	public static void veg(String vegFood){
		System.out.println("veg menu will open ");
	}
	
	public static void nonVeg(String nonVegFood){
		System.out.println("nonVeg menu will open");
	}
	
	public static void drink(String drinkMenu){
		System.out.println("Drink Menu will open");
	}
	
	public static void veg_quntity(String veg , int quntity ){
		System.out.println("ordering  veg and quntity"+" "+"veg:" +veg +" " +"quntity:"+quntity);
	}
	public static void nonVeg_quntity(String nonVeg,int quntity){
		System.out.println("ordering nonveg with quntity \n" +"nonVeg:"+nonVeg+" " +"quntity:"+quntity);
	}
	
	public static void vegAndNonveg(String veg,String nonVeg,int quntity){
		System.out.println("\n veg:"+veg+"\n nonVeg:"+nonVeg+"\n quntity:"+quntity);
	}
	public static void nonVegAndDrink(String nonVeg,String drink,int quntity){
		System.out.println("nonVeg:"+nonVeg+"\n drink:"+drink+"\n quntity:"+quntity);
	}
}