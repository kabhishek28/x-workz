class PichkariRun{
	public static void main(String... args){
		
		
		System.out.println("=================================================================");
		System.out.println("1st constructor with 0 parameter");
		Pichkari pich1 = new Pichkari();
		pich1.display();
		System.out.println("=================================================================");
		
		System.out.println("2nd constructor with 1 parameter");
		Pichkari pich2 = new Pichkari('M');
		pich2.display();
		System.out.println("=================================================================");
		
		System.out.println("3rd constructor with 2 parameter");
		Pichkari pich3 = new Pichkari('L',"pichkariiiiii");
		pich3.display();
		System.out.println("=================================================================");
		
		
		System.out.println("4th constructor with 3 parameter");
		Pichkari pich4 = new Pichkari('S',"GUN","Straight");
		pich4.display();
		System.out.println("=================================================================");
		
		System.out.println("5th constructor with 4 parameter");
		Pichkari pich5 = new Pichkari('M',"Round","Boloon",25);
		pich5.display();
		System.out.println("=================================================================");
		
		
		System.out.println("6th constructor with 5 parameter");
		Pichkari pich6 = new Pichkari('L',"Straight","triangle",30,20);
		pich6.display();
		System.out.println("=================================================================");
		
		
		System.out.println("7th constructor with 6 parameter");
		Pichkari pich7 = new Pichkari('M',"GUN","straight",50,30,250);
		pich7.display();
		System.out.println("=================================================================");
	
	
	
		
	}
	
}
