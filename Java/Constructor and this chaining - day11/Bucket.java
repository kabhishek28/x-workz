class Bucket{
	
	String name;
	String shape;
	String size;
	int no;
	int count;
	String quntity;
	
	Bucket(){
		System.out.println("nothing to print");
	}
	
	Bucket(String name){
		this.name=name;
	}
	
	Bucket(String name ,String shape){
		this(name);
		this.shape = shape;
	}
	
	Bucket(String name,String shape,String size){
		this(name,shape);
		this.size=size;
	}
	
	
	Bucket(String name,String shape,String size,int no){
		this(name,shape,size);
		this.no = no;
	}
	
	Bucket(String name,String shape,String size,int no,int count){
		this( name, shape, size, no);
		this.count = count;
	}
	
	Bucket(String name,String shape,String size,int no,int count,String quntity){
		this( name, shape, size, no, count);
		this.quntity = quntity;
	}
	
	void display(){
		System.out.println("name :"+this.name);
		System.out.println("shape :"+this.shape);
		System.out.println("size :"+this.size);
		System.out.println("no :"+this.no);
		System.out.println("count :"+this.count);
		System.out.println("quntity :"+this.quntity);
	}
}