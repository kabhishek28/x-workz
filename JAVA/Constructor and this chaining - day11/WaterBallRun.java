class WaterBallRun{
	public static void main(String[] args){
		System.out.println("================================================================");
		WaterBall water1 = new WaterBall();
		water1.display();
		System.out.println("================================================================");
		
		System.out.println("================================================================");
		WaterBall water2 = new WaterBall(20,10,25,30,35,"black");
		water2.display();
		
		
		System.out.println("================================================================");
		WaterBall water3 = new WaterBall(20,5,12,15,36,"purple");
		water3.display();
		
		
		System.out.println("================================================================");
		WaterBall water4 = new WaterBall(30,12,45,20,25,"yellow");
		water4.display();
		
		
		System.out.println("================================================================");
		WaterBall water5 = new WaterBall(40,15,25,20,12,"blue");
		water5.display();
		
		
		System.out.println("================================================================");
		WaterBall water6 = new WaterBall(30,12,32,41,20,"green");
		water6.display();
		
		
		System.out.println("================================================================");
		WaterBall water7 = new WaterBall(10,20,15,30,15,"red");
		water7.display();
		System.out.println("================================================================");
	}
}