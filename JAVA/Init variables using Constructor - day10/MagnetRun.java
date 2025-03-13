class MagnetRun{
	public static void main(String[] args){
		int weight;
		char size;
		double price;
		
		
		weight = 10;
		size = 'M';
		price = 200.0;
		Magnet mangnet1 = new Magnet(weight,size,price);
		System.out.println("weight : "+mangnet1.weight+" size : "+mangnet1.size+" price : "+mangnet1.price);
		
		weight = 25;
		size = 'M';
		price = 2000.0;
		Magnet mangnet2 = new Magnet(weight,size,price);
		System.out.println("weight : "+mangnet2.weight+" size : "+mangnet2.size+" price : "+mangnet2.price);
		
		
		weight = 15;
		size = 'S';
		price = 500.0;
		Magnet mangnet3 = new Magnet(weight,size,price);
		System.out.println("weight : "+mangnet3.weight+" size : "+mangnet3.size+" price : "+mangnet3.price);
		
		
		weight = 17;
		size = 'M';
		price = 800.0;
		Magnet mangnet4 = new Magnet(weight,size,price);
		System.out.println("weight : "+mangnet4.weight+" size : "+mangnet4.size+" price : "+mangnet4.price);
		
		
		weight = 20;
		size = 'S';
		price = 400.0;
		Magnet mangnet5 = new Magnet(weight,size,price);
		System.out.println("weight : "+mangnet5.weight+" size : "+mangnet5.size+" price : "+mangnet5.price);
	}
}	