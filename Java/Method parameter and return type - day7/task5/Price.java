//Method which takes source and return price; 20

class Price{
	public static long getPrice(String source){
		if(source == "Solar Panels"){
			return 50000;
		}
		else if(source == "wind turbine"){
			return 120000;
		}
		else if(source == "Hydroelectric"){
			return 300000;
		}
		else if(source == "Geothermal"){
			return 2500000;
		}
		else if(source == "Coal Power"){
			return 500000;
		}
		
		else if(source == "Nuclear"){
			return 1000000;
		}
		
		else if(source == "Natural Gas Plant"){
			return 450000;
		}
		
		else if(source == "Biogas Plant"){
			return 200000;
		}
		else if(source == "Diesel Generator "){
			return 150000;
		}
		else if(source == "Battery Storage System"){
			return 80000;
		}
		else if(source == "Electric Grid "){
			return 70000;
		}
		else if(source == "Tidal Energy"){
			return 600000;
		}
		else if(source == "Stone"){
			return 2000;
		}
		else if(source == "Iron"){
			return 5500;
		}
		else if(source == "Copper"){
			return 8000;
		}
		else if(source == "Gold"){
			return 88000;
		}
		else if(source == "Metal"){
			return 1500;
		}
		else if(source == "Plastic"){
			return 200;
		}
		else if(source == "Paper"){
			return 150;
		}
		else if(source == "Clothes"){
			return 1000;
		}
		else if(source == "Battery"){
			return 8000;
		}
		else{
			System.out.println("entere the valid names");
		}
		return 0;
	}
}