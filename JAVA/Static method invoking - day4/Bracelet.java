class Bracelet{
	public static void Size(){
		System.out.println("7.1 give me the size of the Bracelet");
		color();
	}
	
	public static void color(){
		System.out.println("7.2 enter the color of the bracelet u need");
		meterial();
	}
	
	public static void meterial(){
		System.out.println("7.3 enter the meterial u need in bracelet");
		Perfume.showScent();
	}
	
	public static void pattern(){
		System.out.println("7.4 enter the pattern of the bracelet u need");
		System.out.println("8.1 The perfume has a refreshing fragrance.");
		Perfume.applyPerfume();
	}
}