class Color{
	
	String brand;
	String colorName1;
	String colorName2;
	String colorName3;
	double price;
	double qauntity;
	
	Color(){
		System.out.println("nothing to print");
	}
	
	Color(String brand){
		this.brand=brand;
	}
	
	Color(String brand,String colorName1){
		this(brand);
		this.colorName1 = colorName1;
	}
	
	Color(String brand,String colorName1,String colorName2){
		this(brand,colorName1);
		this.colorName2=colorName2;
	}
	
	Color(String brand,String colorName1, String colorName2,String colorName3){
		this(brand,colorName1,colorName2);
		this.colorName3= colorName3;
	}
	
	Color(String brand,String colorName1,String colorName2,String colorName3,double price){
		this(brand,colorName1,colorName2,colorName3);
		this.price =price;
	}
	
	Color(String brand,String colorName1,String colorName2,String colorName3,double price,double qauntity){
		this(brand,colorName1,colorName2,colorName3,price);
		this.qauntity=qauntity;
	}
	
	public void display(){
		System.out.println("color brand :"+this.brand);
		System.out.println("color1 :"+this.colorName1);
		System.out.println("color2 :"+this.colorName2);
		System.out.println("color3 :"+this.colorName3);
		System.out.println("color price :"+this.price);
		System.out.println("color qauntity :"+this.qauntity);
	}
		
		
}
	
	
	
	
	