class HarpicRun{
	public static void main(String[] args){
		int ml;
		int price;
		int days;
		
		ml = 250;
		price = 300;
		days = 25;
		Harpic harpic1 = new Harpic(ml,price,days);
		System.out.println("ml : "+harpic1.ml+" price : "+harpic1.price+" days : "+harpic1.days);
		
		
		ml = 1000;
		price = 800;
		days = 95;
		Harpic harpic2 = new Harpic(ml,price,days);
		System.out.println("ml : "+harpic2.ml+" price : "+harpic2.price+" days : "+harpic2.days);
		
		ml = 150;
		price = 200;
		days = 20;
		Harpic harpic3 = new Harpic(ml,price,days);
		System.out.println("ml : "+harpic3.ml+" price : "+harpic3.price+" days : "+harpic3.days);
		
		ml = 50;
		price = 100;
		days = 15;
		Harpic harpic4 = new Harpic(ml,price,days);
		System.out.println("ml : "+harpic4.ml+" price : "+harpic4.price+" days : "+harpic4.days);
		 
		ml = 500;
		price = 600;
		days = 50;
		Harpic harpic5 = new Harpic(ml,price,days);
		System.out.println("ml : "+harpic5.ml+" price : "+harpic5.price+" days : "+harpic5.days);
	}
}