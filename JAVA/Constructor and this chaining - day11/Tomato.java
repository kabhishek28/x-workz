class Tomato{
	
	String location;
	String brand;
	int kg;
	int quntity;
	String qulity;
	boolean frash;
	
	Tomato(){
		System.out.println("nothing to print");
	}
	
	Tomato(String location){
		this.location=location;
	}
	
	Tomato(String location,String brand){
		this(location);
		this.brand=brand;
	}
	
	Tomato(String location,String brand,int kg){
		this(location,brand);
		this.kg=kg;
	}
	
	
	Tomato(String location,String brand,int kg,int quntity){
		this(location,brand,kg);
		this.quntity=quntity;
	}
	
	
	Tomato(String location,String brand,int kg,int quntity,String qulity){
		this(location,brand,kg,quntity);
		this.qulity=qulity;
	}
	
	Tomato(String location,String brand,int kg,int quntity,String qulity,boolean frash){
		this(location,brand,kg,quntity,qulity);
		this.frash=frash;
	}
	
	void display(){
		System.out.println("location :"+this.location);
		System.out.println("brand :"+this.brand);
		System.out.println("kg :"+this.kg);
		System.out.println("quntity :"+this.quntity);
		System.out.println("qulity :"+this.qulity);
		System.out.println("frash :"+this.frash);
	}
}