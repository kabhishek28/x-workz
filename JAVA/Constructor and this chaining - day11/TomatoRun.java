class TomatoRun{
	public static void main(String[] asd){
		
		System.out.println("===============================================================");
		Tomato tomato1 = new Tomato();
		tomato1.display();
		
		
		
		System.out.println("===============================================================");
		Tomato tomato2 = new Tomato("mangaluru","KGN",25,250,"good",true);
		tomato2.display();

		
		System.out.println("===============================================================");
		Tomato tomato3 = new Tomato("hubli","RUDRA",30,300,"2 star",false);
		tomato3.display();
		
		System.out.println("===============================================================");
		Tomato tomato4 = new Tomato("Hospet","DURGA",40,450,"5 star",true);
		tomato4.display();
		
		System.out.println("===============================================================");
		Tomato tomato5 = new Tomato("Gulbarga","Kakaa",45,450,"3 star",true);
		tomato5.display();
		
		System.out.println("===============================================================");
		Tomato tomato6 = new Tomato("Vijaypur","Madha appa",80,1050,"two star",true);
		tomato6.display();

		
		System.out.println("===============================================================");
		Tomato tomato7 = new Tomato("bengaluru","HKGN",20,250,"3 star",true);
		tomato7.display();
	}
}