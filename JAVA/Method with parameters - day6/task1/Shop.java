class Shop{
	public static void sell(String vegetable,int quantity){
		System.out.println("Shop class is running");		
		Agent.purchase(vegetable,quantity);
	}
}