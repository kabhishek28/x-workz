class Customer{
	public static void buy(String vegetable,int quantity){
		System.out.println("Customer class is running ");
		Shop.sell( vegetable, quantity);
	}
}
	
