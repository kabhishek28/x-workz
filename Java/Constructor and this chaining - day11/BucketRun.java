class BucketRun{
	public static void main(String[] args){
		System.out.println("========================================================");
		Bucket bucket1 = new Bucket();
		bucket1.display();
		
		System.out.println("========================================================");
		Bucket bucket2 = new Bucket("tub","round","L",36,2,"good");
		bucket2.display();
		
		System.out.println("========================================================");
		Bucket bucket3 = new Bucket("bucket","table","XL",38,3,"very good");
		bucket3.display();
		
		System.out.println("========================================================");
		Bucket bucket4 = new Bucket("bath tub","long","M",40,4,"nice");
		bucket4.display();
		
		System.out.println("========================================================");
		Bucket bucket5 = new Bucket("hot tub","short","L",42,1,"hot");
		bucket5.display();
		
		System.out.println("========================================================");
		Bucket bucket6 = new Bucket("cool tub","long","Xl",36,2,"cool");
		bucket6.display();
		
		System.out.println("========================================================");
		Bucket bucket7 = new Bucket("hot tub","long","XXL",40,3,"hotest");
		bucket7.display();
	}
}