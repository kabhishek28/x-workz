class BaloonRun{
	public static void main(String[] args){
		System.out.println("now your in main function");
		Baloon baloon1 = new Baloon();
		System.out.println("------------------------------------------------");
		Baloon baloon2 = new Baloon("RED","ROUND" );
		System.out.println("------------------------------------------------");
		Baloon baloon3 = new Baloon("BLACK","triangle","PLAN",5.2);
		System.out.println("------------------------------------------------");
		Baloon baloon4 = new Baloon(10 );
		System.out.println("------------------------------------------------");
		Baloon baloon5 = new Baloon("yellow","box","strip",7.2,20);
		System.out.println("------------------------------------------------");
		Baloon baloon6 = new Baloon("green","love","lines",6.2,25,305);
		System.out.println("------------------------------------------------");
		Baloon baloon7 = new Baloon("white","hareat","patch",9.2,21,105,3);
		System.out.println("------------------------------------------------");
		//System.out.println("Displaying data of the instances 1: "+baloon1.display()); // error
		//rrrrrrrrrrrrrrrr
		//rrrrrrrrrrrrrrr
		System.out.println("**********************DISPLAY**************************");
		System.out.println("Displaying data of the instances 1: ");
		baloon1.display();
		System.out.println("************************************************");
		System.out.println("Displaying data of the instances 2: ");
		baloon2.display();
		System.out.println("************************************************");
		System.out.println("Displaying data of the instances 3: ");
		baloon3.display();
		System.out.println("************************************************");
		System.out.println("Displaying data of the instances 4: ");
		baloon4.display();
		System.out.println("************************************************");
		System.out.println("Displaying data of the instances 5: ");
		baloon5.display();
		System.out.println("************************************************");
		System.out.println("Displaying data of the instances 6: ");
		baloon6.display();
		System.out.println("************************************************");
		System.out.println("Displaying data of the instances 7: ");
		baloon7.display();
		System.out.println("************************************************");
		


	}
}
		