class Water{
	
	int temperature;
	int pHLevel;
	int density;
	String source;
	boolean isDrinkable;
	String mineralContent;
	
	Water(){
		System.out.println("nothing too print");
	}
	
	Water(int temperature){
		this.temperature = temperature;
	}
	
	Water(int temperature ,int pHLevel){
		this(temperature);
		this.pHLevel=pHLevel;
	}
	
	Water(int temperature ,int pHLevel ,int density){
		this(temperature,pHLevel);
		this.density = density;
	}
	
	Water(int temperature ,int pHLevel,int density,String source){
		this(temperature,pHLevel,density);
		this.source=source;
	}
	
	Water(int temperature,int pHLevel,int density,String source,boolean isDrinkable){
		this(temperature,pHLevel,density,source);
		this.isDrinkable = isDrinkable;
	}
	
	Water(int temperature,int pHLevel,int density,String source,boolean isDrinkable,String mineralContent){
		this(temperature,pHLevel,density,source,isDrinkable);
		this.mineralContent = mineralContent;
	}
	
	void display(){
		System.out.println("temperature :"+this.temperature);
		System.out.println("pHLevel :"+this.pHLevel);
		System.out.println("density :"+this.density);
		System.out.println("source :"+this.source);
		System.out.println("isDrinkable :"+this.isDrinkable);
		System.out.println("mineralContent :"+this.mineralContent);
	}
		
}