class WaterRun{
	public static void main(String[] ra){
		
		System.out.println("=======================================================");
		Water water1 = new Water();
		water1.display();
		
		System.out.println("=======================================================");
		Water water2 = new Water(25,7,997,"Spring",true,"calcium");
		water2.display();
		
		System.out.println("=======================================================");
		Water water3 = new Water(4,6,999,"Glacier",true,"Silica");
		water3.display();
		
		System.out.println("=======================================================");
		Water water4 = new Water(35,8,995,"Well",true,"Magnesium");
		water4.display();
		
		System.out.println("=======================================================");
		Water water5 = new Water(20,7,996,"Tap",true,"Sodium");
		water5.display();
		
		System.out.println("=======================================================");
		Water water6 = new Water(15,5,997,"Rainwater",false,"Nitrate");
		water6.display();
		
		System.out.println("=======================================================");
		Water water7 = new Water(16,4,994,"Poundwater",true,"Sulfur");
		water7.display();
	}
}
		
		
