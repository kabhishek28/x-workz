class GunRun{
	
	public static void main(String[] args){
		System.out.println("=====================================================================");
		Gun gun1 = new Gun();
		gun1.display();
		
		System.out.println("=====================================================================");
		Gun gun2 = new Gun("AK47","Machine",250,40,150,300000);
		gun2.display();
		
		System.out.println("=====================================================================");
		Gun gun3 = new Gun("THOMAS","Machine",200,40,100,3500000);
		gun3.display();
		
		System.out.println("=====================================================================");
		Gun gun4 = new Gun("Dodama","Machine",300,1000,250,30500000);
		gun4.display();
		
		System.out.println("=====================================================================");
		Gun gun5 = new Gun("KALAS NIKAVO","Machine",260,100,250,305000);
		gun5.display();
		
		System.out.println("=====================================================================");
		Gun gun6 = new Gun("PISTHOL","Normal",120,10,60,500000);
		gun6.display();
		
		System.out.println("=====================================================================");
		Gun gun7 = new Gun("GUN","Normal",120,15,60,505000);
		gun7.display();
		System.out.println("=====================================================================");
	}
}