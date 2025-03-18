//Method which takes company name and return owner name; 12 company

class Owner{
	
	public static String getName(String company){
		
		if(company == "Tesla"){
			return "Elon Musk";
		}
		else if(company == "Amazon"){
			return "Jeff Bezos";
		}
		else if(company == "Microsoft"){
			return "Bill Gates & Paul Allen";
		}
		else if(company == "Apple"){
			return "Steve Jobs";
		}
		else if(company == "Google"){
			return "Larry Page & Sergey Brin";
		}
		else if(company == "Facebook"){
			return "Mark Zuckerberg";
		}
		else if(company == "SpaceX"){
			return "Elon Musk";
		}
		else if(company == "Reliance Industries"){
			return "Mukesh Ambani";
		}
		else if(company == "Tata Group"){
			return "Jamsetji Tata ";
		}
		else if(company == "Adani Group"){
			return "Gautam Adani";
		}
		else if(company == "Alibaba Group"){
			return "Jack Ma ";
		}
		else if(company == "Berkshire Hathaway"){
			return "Warren Buffett";
		}
        return "Tesla\nAmazon\nMicrosoft\nApple\nGoogle\nFacebook\nSpaceX\nReliance Industries\nTata Group\nAdani Group\nAlibaba Group\nBerkshire Hathaway";
	}
}