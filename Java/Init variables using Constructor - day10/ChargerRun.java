class ChargerRun{
	public static void main(String[] args){
		String brand = "lenova";
		int price = 250 ;
		int voltage = 105 ;
		Charger charger1 = new Charger(brand,price,voltage);
		System.out.println("brand : "+charger1.brand+" price : "+charger1.price+" voltage : " +charger1.voltage);
		
		
		 brand = "HP";
		 price = 350 ;
		 voltage = 85 ;
		Charger charger2 = new Charger(brand,price,voltage);
		System.out.println("brand : "+charger2.brand+" price : "+charger2.price+" voltage : " +charger2.voltage);
		
		
		 brand = "Acre";
		 price = 200 ;
		 voltage = 75 ;
		Charger charger3 = new Charger(brand,price,voltage);
		System.out.println("brand : "+charger3.brand+" price : "+charger3.price+" voltage : " +charger3.voltage);
		
		 brand = "Dell";
		 price = 350 ;
		 voltage = 100 ;
		Charger charger4 = new Charger(brand,price,voltage);
		System.out.println("brand : "+charger4.brand+" price : "+charger4.price+" voltage : " +charger4.voltage);
		
		 brand = "vevo";
		 price = 450 ;
		 voltage = 250 ;
		Charger charger5 = new Charger(brand,price,voltage);
		System.out.println("brand : "+charger5.brand+" price : "+charger5.price+" voltage : " +charger5.voltage);
	}
}