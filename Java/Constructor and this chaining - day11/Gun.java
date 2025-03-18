class Gun{
	
	String name;
	String type;
	int speed;
	int noOfBullet;
	int range;
	int price;
	
	
	Gun(){
		System.out.println("nothig to print");
	}
	
	Gun(String name){
		this.name = name;
	}
	
	Gun(String name , String type){
		this(name);
		this.type = type;
	}
	
	Gun(String name,String type,int speed){
		this(name,type);
		this.speed = speed;
	}
	
	Gun(String name,String type,int speed,int noOfBullet){
		this(name,type,speed);
		this.noOfBullet = noOfBullet;
	}
	
	Gun(String name,String type,int speed,int noOfBullet,int range){
		this(name,type,speed,noOfBullet);
		this.range = range;
	}
	
	Gun(String name , String type,int speed,int noOfBullet,int range,int price){
		this(name,type,speed,noOfBullet,range);
		this.price = price;
	}
	
	void display(){
		System.out.println("Name :"+this.name);
		System.out.println("type :"+this.type);
		System.out.println("speed :"+this.speed);
		System.out.println("noOfBullet :"+this.noOfBullet);
		System.out.println("range :"+this.range);
		System.out.println("price :"+this.price);
		
	}
}