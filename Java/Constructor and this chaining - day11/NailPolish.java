class NailPolish{
	
	String brand;
	String color;
	int bottleSize;
	int dryingTime;
	int price;
	String expiryDate;
	
	NailPolish(){
		System.out.println("nothing to print");
	}
	
	NailPolish(String brand){
		this.brand = brand;
	}
	
	NailPolish(String brand,String color){
		this(brand);
		this.color = color;
	}
	
	NailPolish(String brand,String color,int bottleSize){
		this(brand,color);
		this.bottleSize=bottleSize;
	}
	
	NailPolish(String brand,String color,int bottleSize,int dryingTime){
		this(brand,color,bottleSize);
		this.dryingTime= dryingTime;
	}
	
	NailPolish(String brand,String color,int bottleSize,int dryingTime,int price){
		this(brand,color,bottleSize,dryingTime);
		this.price=price;
	}
	
	NailPolish(String brand,String color,int bottleSize,int dryingTime,int price,String expiryDate){
		this(brand,color,bottleSize,dryingTime,price);
		this.expiryDate = expiryDate;
	}
	
	void display(){
		System.out.println("brand :"+this.brand);
		System.out.println("color :"+this.color);
		System.out.println("bottleSize :"+this.bottleSize);
		System.out.println("dryingTime :"+this.dryingTime);
		System.out.println("price :"+this.price);
		System.out.println("expiryDate :"+this.expiryDate);
	}
}