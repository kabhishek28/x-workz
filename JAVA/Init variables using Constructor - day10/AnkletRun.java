class AnkletRun{
	public static void main(String[] as){
		char size;
		String metrial;
		int price;
		
		size = 'M';
		metrial = "Sotne";
		price = 200;
		Anklet anklet1 = new Anklet(size,price,metrial);
		System.out.println("size : "+anklet1.size+" metrial : "+anklet1.metrial+" price : "+anklet1.price);
		
		size = 'L';
		metrial = "Iron";
		price = 500;
		Anklet anklet2 = new Anklet(size,price,metrial);
		System.out.println("size : "+anklet2.size+" metrial : "+anklet2.metrial+" price : "+anklet2.price);

		size = 'S';
		metrial = "Steel";
		price = 600;
		Anklet anklet3 = new Anklet(size,price,metrial);
		System.out.println("size : "+anklet3.size+" metrial : "+anklet3.metrial+" price : "+anklet3.price);
		 
		 
		size = 'L';
		metrial = "Thread";
		price = 100;
		Anklet anklet4 = new Anklet(size,price,metrial);
		System.out.println("size : "+anklet4.size+" metrial : "+anklet4.metrial+" price : "+anklet4.price);


		size = 'M';
		metrial = "Leather";
		price = 1000;
		Anklet anklet5 = new Anklet(size,price,metrial);
		System.out.println("size : "+anklet5.size+" metrial : "+anklet5.metrial+" price : "+anklet5.price);
	}
}