// Method which takes foodItem and return price; 19 foodItem



class Price{
	public static int getPrice(String foodItem){
		
		if(foodItem == "Burger"){
			return 150;
		}
		else if(foodItem == "Pizza"){
			return 250;
		}
		else if(foodItem == "Pasta"){
			return 180;
		}
		else if(foodItem == "Sandwich"){
			return 90;
		}
		else if(foodItem == "Biryani"){
			return 220;
		}
		else if(foodItem == "Fried Rice"){
			return 150;
		}
		else if(foodItem == "Butter Chicken"){
			return 300;
		}
		else if(foodItem == "Paneer Tikka"){
			return 200;
		}
		else if(foodItem == "Dosa"){
			return 100;
		}
		else if(foodItem == "Samosa"){
			return 20;
		}
		else if(foodItem == "Chowmein"){
			return 130;
		}
		else if(foodItem == "Momos"){
			return 110;
		}
		else if(foodItem == "Ice Cream"){
			return 80;
		}
		else if(foodItem == "Pani Puri"){
			return 50;
		}
		else if(foodItem == "Chole Bhature"){
			return 140;
		}
		else if(foodItem == "Dal Makhani"){
			return 190;
		}
		else if(foodItem == "Idli"){
			return 80;
		}
		else if(foodItem == "Chocolate Cake"){
			return 250;
		}
		else if(foodItem == "Milkshake"){
			return 160;
		}
		else{
			System.out.println("Enter in this below list \nBurger\nPizza\nPasta\nSandwich\nBiryani\nFried Rice\nButter Chicken\nPaneer Tikka\nDosa\nSamosa\nChowmein\nMomos\n Ice Cream\nPani Puri\nChole Bhature\nDal Makhani\nIdli\nChocolate Cake\nMilkshake");
		}
		return 0;
	}
}