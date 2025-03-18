class ChainRun{
	public static void main(String[] as){
		char size;
		String metrial;
		int price;
		
		size = 'M';
		metrial = "Sotne";
		price = 200;
		Chain chain1 = new Chain(size,price,metrial);
		System.out.println("size : "+chain1.size+" metrial : "+chain1.metrial+" price : "+chain1.price);
		
		size = 'L';
		metrial = "Iron";
		price = 500;
		Chain chain2 = new Chain(size,price,metrial);
		System.out.println("size : "+chain2.size+" metrial : "+chain2.metrial+" price : "+chain2.price);
		
		size = 'S';
		metrial = "Steel";
		price = 600;
		Chain chain3 = new Chain(size,price,metrial);
		System.out.println("size : "+chain3.size+" metrial : "+chain3.metrial+" price : "+chain3.price);
		
		 
		size = 'L';
		metrial = "Thread";
		price = 100;
		Chain chain4 = new Chain(size,price,metrial);
		System.out.println("size : "+chain4.size+" metrial : "+chain4.metrial+" price : "+chain4.price);
		

		size = 'M';
		metrial = "Leather";
		price = 1000;
		Chain chain5 = new Chain(size,price,metrial);
		System.out.println("size : "+chain5.size+" metrial : "+chain5.metrial+" price : "+chain5.price);
	}
}