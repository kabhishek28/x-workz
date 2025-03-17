class EggRun{
	public static void main(String[] args){
		System.out.println("========================================================");
		Egg egg1 = new Egg();
		egg1.display();
		
		System.out.println("========================================================");
		Egg egg2 = new Egg("omlet",30,10,250,5,true);
		egg2.display();
		
		System.out.println("========================================================");
		Egg egg3 = new Egg("egg burge",20,5,200,7,false);
		egg3.display();
		
		System.out.println("========================================================");
		Egg egg4 = new Egg("masala egg",10,20,150,3,true);
		egg4.display();
		
		System.out.println("========================================================");
		Egg egg5 = new Egg("boiled Egg",50,30,500,9,true);
		egg5.display();
		
		System.out.println("========================================================");
		Egg egg6 = new Egg("Egg fried",15,60,550,7,true);
		egg6.display();
		
		System.out.println("========================================================");
		Egg egg7 = new Egg("Egg rice",60,70,2500,3,true);
		egg7.display();
	}
}