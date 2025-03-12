class PowerBankRun{
	public static void main(String[] args){
		System.out.println("--------------------invoking Powerbank1----------------");
		PowerBank powerBank1 = new PowerBank();
		powerBank1.brand = "BAJAJ";
		powerBank1.capacity = 1500;
		powerBank1.noOfPorts = 2;
		powerBank1.price = 1000.00;
		System.out.println(" PowerBank brand : "+powerBank1.brand+"\n PowerBank Capacity : "+powerBank1.capacity+"\n powerBank Number of ports : "+powerBank1.noOfPorts+"\n powerbank price : "+powerBank1.price);
		
		
		System.out.println("--------------------invoking Powerbank2----------------");
		PowerBank powerBank2 = new PowerBank();
		powerBank2 = powerBank1;
		powerBank2.brand = "Xiaomi";
		powerBank1.capacity = 1500;
		powerBank1.noOfPorts = 2;
		powerBank1.price = 1000.00;
		System.out.println(" PowerBank brand : "+powerBank1.brand+"\n PowerBank Capacity : "+powerBank1.capacity+"\n powerBank Number of ports : "+powerBank1.noOfPorts+"\n powerbank price : "+powerBank1.price);
		
		
		System.out.println("--------------------invoking Powerbank3----------------");
		PowerBank powerBank3 = new PowerBank();
		powerBank3.brand = "Anker";
		powerBank3.capacity = 2000;
		powerBank3.noOfPorts = 2;
		powerBank3.price = 1500.00;
		System.out.println(" PowerBank brand : "+powerBank3.brand+"\n PowerBank Capacity : "+powerBank3.capacity+"\n powerBank Number of ports : "+powerBank3.noOfPorts+"\n powerbank price : "+powerBank3.price);
		
		
		System.out.println("--------------------invoking Powerbank4----------------");
		PowerBank powerBank4 = new PowerBank();
		powerBank4 = powerBank3;
		powerBank4.brand="OnePlus";
		powerBank1.capacity = 1500;
		powerBank1.noOfPorts = 3;
		powerBank1.price = 1000.00;
		System.out.println(" PowerBank brand : "+powerBank3.brand+"\n PowerBank Capacity : "+powerBank3.capacity+"\n powerBank Number of ports : "+powerBank3.noOfPorts+"\n powerbank price : "+powerBank3.price);
		
		
		System.out.println("--------------------invoking Powerbank5----------------");
		PowerBank powerBank5 = new PowerBank();
		powerBank5.brand = "Samsung";
		powerBank5.capacity = 1800;
		powerBank5.noOfPorts = 1;
		powerBank5.price = 2000.00;
		System.out.println(" PowerBank brand : "+powerBank5.brand+"\n PowerBank Capacity : "+powerBank5.capacity+"\n powerBank Number of ports : "+powerBank5.noOfPorts+"\n powerbank price : "+powerBank5.price);
		
		
		System.out.println("--------------------invoking Powerbank6----------------");
		PowerBank powerBank6 = new PowerBank();
		powerBank6.brand = "Apple";
		powerBank6.capacity = 1500;
		powerBank6.noOfPorts = 2;
		powerBank6.price = 1000.00;
		System.out.println(" PowerBank brand : "+powerBank6.brand+"\n PowerBank Capacity : "+powerBank6.capacity+"\n powerBank Number of ports : "+powerBank6.noOfPorts+"\n powerbank price : "+powerBank6.price);
		
		
		System.out.println("--------------------invoking Powerbank7----------------");
		PowerBank powerBank7 = new PowerBank();
		powerBank7.brand = "Boat";
		powerBank7.capacity = 4000;
		powerBank7.noOfPorts = 2;
		powerBank7.price = 2500.00;
		System.out.println(" PowerBank brand : "+powerBank7.brand+"\n PowerBank Capacity : "+powerBank7.capacity+"\n powerBank Number of ports : "+powerBank7.noOfPorts+"\n powerbank price : "+powerBank7.price);
		
		
		System.out.println("--------------------invoking Powerbank8----------------");
		PowerBank powerBank8 = new PowerBank();
		powerBank8.brand = "BAJAJ";
		powerBank8.capacity = 1500;
		powerBank8.noOfPorts = 2;
		powerBank8.price = 1000.00;
		System.out.println(" PowerBank brand : "+powerBank8.brand+"\n PowerBank Capacity : "+powerBank8.capacity+"\n powerBank Number of ports : "+powerBank8.noOfPorts+"\n powerbank price : "+powerBank8.price);
		
		
		System.out.println("--------------------invoking Powerbank9----------------");
		PowerBank powerBank9 = new PowerBank();
		powerBank9.brand = "Zebronics";
		powerBank9.capacity = 1800;
		powerBank9.noOfPorts = 3;
		powerBank9.price = 2000.00;
		System.out.println(" PowerBank brand : "+powerBank9.brand+"\n PowerBank Capacity : "+powerBank9.capacity+"\n powerBank Number of ports : "+powerBank9.noOfPorts+"\n powerbank price : "+powerBank9.price);
		
		
		System.out.println("--------------------invoking Powerbank10----------------");
		PowerBank powerBank10 = new PowerBank();
		powerBank10.brand = "Syska";
		powerBank10.capacity = 2500;
		powerBank10.noOfPorts = 2;
		powerBank10.price = 1200.00;
		System.out.println(" PowerBank brand : "+powerBank10.brand+"\n PowerBank Capacity : "+powerBank10.capacity+"\n powerBank Number of ports : "+powerBank10.noOfPorts+"\n powerbank price : "+powerBank10.price);
		
		
	}
}