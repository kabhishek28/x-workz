class Baloon{

	String color;
	String shape;
	String desing;
	double size;
	int noOfBaloon;
	int price;
	int noOfColor;

	public Baloon(){
		
		super();
		System.out.println("constructor 1: nothing to print");
		
	}

	public Baloon(String color,String shape){
		
		this();
		this.color = color;
		this.shape = shape;
		System.out.println("constructor 2: with two variable");
	}

	public Baloon(String color,String shape,String desing,double size){
		this(color,shape);
		this.desing = desing;
		this.size = size;
		System.out.println("constructor 3: with 4 variable");
	}
	
	public Baloon(int noOfBaloon){
		this.noOfBaloon = noOfBaloon;
		System.out.println("constructor 4: with 1 variable");
	}
	
	public Baloon(String color,String shape,String desing,double size,int noOfBaloon){
		this(color,shape,desing,size);
		//this(noOfBaloon);
		this.noOfBaloon = noOfBaloon;
		System.out.println("constructor 5: with 5 variable");
	}
	
	public Baloon(String color,String shape,String desing,double size,int noOfBaloon,int price){
		this( color, shape, desing, size, noOfBaloon);
		this.price = price;
		System.out.println("constructor 6: with 6 variable");
	}
	
	public Baloon(String color,String shape,String desing,double size,int noOfBaloon,int price,int noOfColor){
		this( color, shape, desing, size, noOfBaloon,price);
		this.noOfColor = noOfColor;
		System.out.println("constructor 7: with 7 variable");
	}
	
	public  void display(){
		System.out.println("dispayling the all the values");
		System.out.println("Color :"+this.color);
		System.out.println("Shape :"+this.shape);
		System.out.println("Desing :"+this.desing);
		System.out.println("Size :"+this.size);
		System.out.println("noOfBaloon :"+this.noOfBaloon);
		System.out.println("Price :"+this.price);
		System.out.println("noOfColor :"+this.noOfColor);
	}
}