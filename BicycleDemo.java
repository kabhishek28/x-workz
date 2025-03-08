class BicycleDemo{
	public static void main(String[] args){
		
		Bicycle bike1 = new Bicycle();
		Bicycle bike2 = new Bicycle();
		
		bike1.changeCadence(20);
		bike1.changeGare(2);
		bike1.changeSpeed(10);
		bike1.printStates();
		
		
		bike2.changeCadence(30);
		bike2.changeGare(2);
		bike2.changeSpeed(10);
		bike2.changeSpeed(10);
		bike2.changeGare(3);
		bike2.printStates();
		
		
	}
}