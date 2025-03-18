class Holi{
	String date;
	String name;
	String palce;
	String food;
	int noOfPepole;
	int noOfColor;
	
	public Holi(){
		
		System.out.println("1 constrction with 0 arguments ");
	}
	
	public Holi(String date){
		this.date = date;
		
		System.out.println("2 constrction with 1 arguments ");

	}
	
	public Holi(String date,String name){
		this(date);
		this.name= name;
		
		System.out.println("3 constrction with 2 arguments ");
	}
	
	public Holi(String date,String name,String palce){
		this(date,name);
		this.palce = palce;
		
		System.out.println("4 constrction with 3 arguments ");
	}
	
	public Holi(String date,String name,String palce,String food){
		this( date, name, palce);
		this.food = food;
		
		System.out.println("5 constrction with 4 arguments ");
	}
	
	public Holi(String date,String name,String palce,String food,int noOfPepole){
		this( date, name, palce, food);
		this.noOfPepole = noOfPepole;
		
		System.out.println("6 constrction with 5 arguments ");
	}
	
	public Holi(String date,String name,String palce,String food,int noOfPepole,int noOfColor){
		this( date, name, palce, food, noOfPepole);
		this.noOfColor = noOfColor;
		
		System.out.println("7 constrction with 6 arguments ");
	}
	
	public  void display(){
		
		System.out.println("date : "+this.date);
		System.out.println("name : "+this.name);
		System.out.println("palce :"+this.palce);
		System.out.println("food :"+this.food);
		System.out.println("noOfPepole :"+this.noOfPepole);
		System.out.println("noOfColor :"+this.noOfColor);
	}
}
	