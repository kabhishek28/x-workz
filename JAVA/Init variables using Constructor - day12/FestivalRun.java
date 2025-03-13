class FestivalRun{
	public static void main(String[] args){
		String date = "Mar 14";
		String food = "Bhang";
		int distance = 25;
		String name = "Holi";
		Festival festival1 = new Festival(name,date,food,distance);
		System.out.println(festival1.date +" is the "+festival1.name+" so we have to travel "+festival1.distance+"km to get the "+festival1.food);
				
				
	
		String date1 = "Feb 26";
		String food1 = "ganja";
		int distance1 = 12;
		String name1 = "Shivarathri";
		Festival festival2 = new Festival(name1,date1,food1,distance1);
		System.out.println(festival2.date +" is the "+festival2.name+" so we have to travel "+festival2.distance+"km to get the "+festival2.food);
		/*	
			
		date = "Oct 28";
		food = "sweets";
		distance = 450;
		name = "Deepavali";
		Festival festival3 = new Festival(name,date,food,distance);
		System.out.println(festival3.date +" is the "+festival3.name+" so we have to travel "+festival3.distance+"km to get the "+festival3.food);
			
		 date = "Nov 20";
		 food = "sangam Sweets";
		 distance = 36;
		 name = "Dasara";
		Festival festival4 = new Festival(name,date,food,distance);
		System.out.println(festival4.date +" is the "+festival4.name+" so we have to travel "+festival4.distance+"km to get the "+festival4.food);
			
		 date = "Dec 25";
		 food = "Rum Cake";
		 distance = 360;
		 name = "Christmas";
		Festival festival5 = new Festival(name,date,food,distance);
		System.out.println(festival5.date +" is the "+festival5.name+" so we have to travel "+festival5.distance+"km to get the "+festival5.food);
			
			
		*/
		String date3 = "Oct 28";
		String food3 = "sweets";
		int distance3 = 450;
		String name3 = "Deepavali";
		Festival festival3 = new Festival(name3,date3,food3,distance3);
		System.out.println(festival3.date +" is the "+festival3.name+" so we have to travel "+festival3.distance+"km to get the "+festival3.food);
			
		String date4 = "Nov 20";
		String food4 = "sangam Sweets";
		int distance4 = 36;
		String name4 = "Dasara";
		Festival festival4 = new Festival(name4,date4,food4,distance4);
		System.out.println(festival4.date+" is the "+festival4.name+" so we have to travel "+festival4.distance+"km to get the "+festival4.food);
			
		String date5 = "Dec 25";
		String food5 = "Rum Cake";
		int distance5 = 360;
		String name5 = "Christmas";
		Festival festival5 = new Festival(name5,date5,food5,distance5);
		System.out.println(festival5.date +" is the "+festival5.name+" so we have to travel "+festival5.distance+"km to get the "+festival5.food);
			
		
	}
}
			