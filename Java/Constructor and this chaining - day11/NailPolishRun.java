class NailPolishRun{
	public static void main(String[] args){
		
		System.out.println("================================================================");
		NailPolish nail1 = new NailPolish();
		nail1.display();
		
		
		System.out.println("================================================================");
		NailPolish nail2 = new NailPolish("OPI","red",15,5,50,"mar 15");
		nail2.display();
		
		System.out.println("================================================================");
		NailPolish nail3= new NailPolish("Essie","Midnight Blue",20,15,250,"oct 28");
		nail3.display();
		
		
		System.out.println("================================================================");
		NailPolish nail4 = new NailPolish("Sally Hansen","Rose Gold",30,20,350,"Nov 20");
		nail4.display();
		
		
		System.out.println("================================================================");
		NailPolish nail5 = new NailPolish("Revlon","Emerald Green",40,10,500,"Mar 15");
		nail5.display();
		
		
		System.out.println("================================================================");
		NailPolish nail6 = new NailPolish("Zoya","Pastel Pink",10,15,1000,"Dec 25");
		nail6.display();
		
		System.out.println("================================================================");
		NailPolish nail7 = new NailPolish("Chanel","Jet Black",20,15,1500,"Oct 15");
		nail7.display();
	}
}