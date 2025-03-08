class Bicycle{
	int speed;
	int gare;
	int cadence;
	
	void changeCadence(int cadencee){
		cadence = cadencee;
	}
	
	void changeGare(int garee){
		gare = garee;
	}
	
	void changeSpeed(int speedd){
		speed = speed + speedd;
	}
	
	void printStates(){
		System.out.println("cadence :" + cadence +" "+"gare :"+gare+" "+"speed :"+speed);
	}
}