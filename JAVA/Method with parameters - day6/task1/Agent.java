class Agent{
	public static void purchase(String vegetable,int quantity){
		System.out.println("Agent class is running");		
		Broker.brokerage(vegetable,quantity);
	}
}