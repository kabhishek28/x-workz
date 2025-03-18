class TrafficSignal{
	
	
	public static void greenSignal(){
		Lipstick.offerLipstick();
		
	}
	
	public static void yellwoSignal(){
		System.out.println("2.2 Start the bike");
		redSignal();
	}
	
	public static void redSignal(){
		System.out.println("2.3 Stop the bike");
		noSignal();
	}
	
	public static void noSignal(){
		System.out.println("2.4 NO signal go by your choice");
		Brand.puma();
	}
}