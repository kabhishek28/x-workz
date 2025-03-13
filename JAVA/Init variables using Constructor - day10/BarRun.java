class BarRun{
	public static void main(String[] fg){
		String name;
		double alcohol;
		int price;
		
		
		name = "VAT 69";
		alcohol = 49.0;
		price = 3000;
		Bar  bar1 = new Bar(name , alcohol ,price);
		System.out.println("name :"+bar1.name+" alcohol % :"+bar1.alcohol+" price :"+bar1.price);
		
		name = "BP";
		alcohol = 49.0;
		price = 2800;
		Bar  bar2 = new Bar(name , alcohol ,price);
		System.out.println("name :"+bar2.name+" alcohol % :"+bar2.alcohol+" price :"+bar2.price);
		
		name = "budweiser";
		alcohol = 15.0;
		price = 250;
		Bar  bar3 = new Bar(name , alcohol ,price);
		System.out.println("name :"+bar3.name+" alcohol % :"+bar3.alcohol+" price :"+bar3.price);
		
		name = "kingfisher ";
		alcohol = 14.0;
		price = 300;
		Bar  bar4 = new Bar(name , alcohol ,price);
		System.out.println("name :"+bar4.name+" alcohol % :"+bar4.alcohol+" price :"+bar4.price);
		
		name = "GIN";
		alcohol = 49.0;
		price = 3000;
		Bar  bar5 = new Bar(name , alcohol ,price);
		System.out.println("name :"+bar5.name+" alcohol % :"+bar5.alcohol+" price :"+bar5.price);
		
	}
}