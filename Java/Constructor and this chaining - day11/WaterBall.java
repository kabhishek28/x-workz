class WaterBall{
	
	int noOfWaterBall;
	int radius;
	int volume;
	int velocity;
	int mass;
	String color;
	
	WaterBall(){
		System.out.println("nothing to print");
	}
	
	WaterBall(int noOfWaterBall){
		this.noOfWaterBall = noOfWaterBall;
	}
	
	WaterBall(int noOfWaterBall,int radius){
		this(noOfWaterBall);
		this.radius = radius;
	}
	
	WaterBall(int noOfWaterBall,int radius,int volume){
		this(noOfWaterBall,radius);
		this.volume = volume;
	}
	
	WaterBall(int noOfWaterBall,int radius,int volume,int velocity){
		this(noOfWaterBall,radius,volume);
		this.velocity = velocity;
	}
	
	WaterBall(int noOfWaterBall,int radius,int volume,int velocity,int mass){
		this(noOfWaterBall,radius,volume,velocity);
		this.mass = mass;
	}
	
	WaterBall(int noOfWaterBall,int radius,int volume,int velocity,int mass,String color){
		this(noOfWaterBall,radius,volume,velocity,mass);
		this.color=color;
	}
	
	void display(){
		System.out.println("noOfWaterBall :"+this.noOfWaterBall);
		System.out.println("radius :"+this.radius);
		System.out.println("volume :"+this.volume);
		System.out.println("velocity :"+this.velocity);
		System.out.println("mass :"+this.mass);
		System.out.println("color :"+this.color);
	}
}