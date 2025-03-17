class Egg{
	
	
	String foodItem;
	int noOfEgg;
	int noOfTray;
	double price;
	int onOfOrder;
	boolean eggQulity;
	
	Egg(){
		System.out.println("nothing to println");
	}
	
	Egg(String foodItem){
		this.foodItem = foodItem;
	}
	
	Egg(String foodItem,int noOfEgg){
		this(foodItem);
		this.noOfEgg=noOfEgg;
	}
	
	Egg(String foodItem,int noOfEgg,int noOfTray){
		this(foodItem,noOfEgg);
		this.noOfTray=noOfTray;
	}
	
	Egg(String foodItem,int noOfEgg,int noOfTray,double price){
		this(foodItem,noOfEgg,noOfTray);
		this.price =price;
	}
	
	Egg(String foodItem,int noOfEgg,int noOfTray,double price,int onOfOrder){
		this( foodItem, noOfEgg, noOfTray, price);
		this.onOfOrder = onOfOrder;
	}
	
	Egg(String foodItem,int noOfEgg,int noOfTray,double price,int onOfOrder,boolean eggQulity){
		this( foodItem, noOfEgg, noOfTray, price, onOfOrder);
		this.eggQulity = eggQulity;
	}
	
	void display(){
		System.out.println("foodItem :"+this.foodItem);
		System.out.println("noOfEgg :"+this.noOfEgg);
		System.out.println("noOfTray :"+this.noOfTray);
		System.out.println("price :"+this.price);
		System.out.println("onOfOrder :"+this.onOfOrder);
		System.out.println("eggQulity :"+this.eggQulity);
	}
}