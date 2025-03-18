class HoliRun{
	public static void main(String[] args){
		System.out.println("===============================================");
		Holi holi1 = new Holi();
		holi1.display();
		System.out.println("===============================================");
		Holi holi2 = new Holi("mar 14");
		holi2.display();
		System.out.println("===============================================");
		Holi holi3 = new Holi("mar 14","Holiii");
		holi3.display();
		System.out.println("===============================================");
		Holi holi4 = new Holi("mar 14","Holiii","Rajajinagar");
		holi4.display();
		System.out.println("===============================================");
		Holi holi5 = new Holi("mar 14","Holiii","Rajajinagar","Bhang");
		holi5.display();
		System.out.println("===============================================");
		Holi holi6 = new Holi("mar 14","Holiii","Rajajinagar","Bhang",25);
		holi6.display();
		System.out.println("===============================================");
		Holi holi7 = new Holi("mar 14","Holiii","Rajajinagar","Bhang",25,04);
		holi7.display();
		System.out.println("===============================================");
	}
}