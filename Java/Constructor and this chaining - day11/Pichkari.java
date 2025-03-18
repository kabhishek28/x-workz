class Pichkari{
	char size;
	String name;
	String shape;
	int range;
	int capacity;
	int price;
	
	Pichkari(){
		
	}
	
	Pichkari(char size){
		this.size = size;
	}
	
	Pichkari(char size,String name){
		this(size);
		this.name = name;
	}
	
	Pichkari(char size,String name,String shape){
		this(size,name);
		this.shape = shape;
	}
	
	Pichkari(char size,String name,String shape,int range){
		this(size,name,shape);
		this.range = range;
	}
	
	Pichkari(char size,String name,String shape,int range,int capacity){
		this(size,name,shape,range);
		this.capacity = capacity;
	}
	
	Pichkari(char size,String name,String shape,int range,int capacity,int price){
		this(size,name,shape,range,capacity);
		this.price = price;
	}
	
	 void display(){
		System.out.println("Size :"+this.size);
		System.out.println("name :"+this.name);
		System.out.println("shape :"+this.shape);
		System.out.println("range :"+this.range);
		System.out.println("capacity :"+this.capacity);
		System.out.println("price :"+this.price);
	}
		
}