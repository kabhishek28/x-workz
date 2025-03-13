import java.util.Scanner;
class Run{
	public static void main(String[] args){
		System.out.println("enter the No to open which class \n"+"1. for class Food_Item \n"+"2. for class Beer \n"+"3. for class TeddyBear \n" + "4. for class Dmart \n" +"5. for class Ladder \n" + "6. for class Tubelight \n" + "7. for class Paper \n");
		
		Scanner sc = new Scanner(System.in);
		int choice = sc.nextInt();
		switch( choice){
			case 1:{
				
				int quntity = 1;
				String veg = "panner";
				String nonveg= "chicken";
				String drink = " pipse";
				System.out.println("enter the number combo order which one u want to place the order ");
				System.out.println("1. only veg panner \n"+"2.only nonveg chicken \n"+"3. only drink pipes \n" +"4. veg and number of plate \n"+"5. nonveg and number of plate \n"+"6. veg and nonveg and number of plate \n"+"7. nonveg and drink and number of plate \n");
				int orderno = sc.nextInt();
				switch(orderno){
					case 1:{
						Fooditem.veg(veg);
						break;
					}
					case 2:{
						Fooditem.nonVeg(nonveg);
						break;
					}
					case 3:{
						Fooditem.drink(drink);
						break;
					}
					case 4:{
						Fooditem.veg_quntity(veg , quntity);
						break;
					}
					case 5:{
						Fooditem.nonVeg_quntity(nonveg , quntity);
						break;
					}
					case 6:{
						Fooditem.vegAndNonveg(veg,nonveg,quntity);
						break;
					}
					case 7:{
						Fooditem.nonVegAndDrink(nonveg,drink,quntity);
						break;
					}
					default:{
						System.out.println("enter from 1 to 7");
						break;
					}
				}
				
				break;
			}
			
			case 2:{
				String beerName = "Corona";
				String brand = "KF";
				int quntity = 2;
				double alcoholPerCentage = 5.49;
				double priceperbottel = 249;
				double totalprice = 498;
				System.out.println("now calling the all the methods \n");
				Beer.selectBeer(beerName);
				Beer.selectByQuantity( quntity);
				Beer.selectByAlcoholPercentage( alcoholPerCentage);
				Beer.orderBeer( beerName,  quntity);
				Beer.orderBeerWithPrice(beerName, priceperbottel);
				Beer.orderBeerTotalPrice( beerName, quntity,  totalprice);
				Beer.orderBeerByBrand(brand,  alcoholPerCentage, quntity);
				
				break;
			}
			
			case 3:{
				String teddyName = "Baby";
				int size = 38;
				double price = 599;
				String color = "white";
				int quntity = 1;
				System.out.println("enter 1. for single parameter methods \n enter 2. for Double parameter methods \n enter 3. for 3 parameter methods \n");
				int parameter = sc.nextInt();
				switch(parameter){
					case 1:{
						TeddyBear.selectTeddy(teddyName);
						TeddyBear.selectBySize(size);
						TeddyBear.selectByPrice( price);
						break;
					}
					case 2:{
						TeddyBear.orderTeddy( teddyName,  size);
						TeddyBear.buyTeddy( teddyName,  price);
						break;
					}
					case 3:{
						TeddyBear.giftTeddy(teddyName,  size,  price);
						TeddyBear.customTeddy( teddyName,  color,  quntity);
						break;
					}
					default:{
				
						System.out.println("enter within the limit ");
						break;
					}
				}
				break;
			}
			
			
			case 4:{
				String productName = "face wash";
				boolean available = true;
				int quantity = 2;
				double price = 449;
				double totalPrice = 898;
				double discount = 49;
				String category = "daily product";
				
				
				System.out.println(" enter 1. for single parameter methods \n enter 2. for Double parameter methods \n enter 3. for 3 parameter methods \n");
				int parameter = sc.nextInt();
				switch(parameter){
					case 1:{
						
						Dmart.selectProduct(productName);
						Dmart.showPrice( price);
						Dmart.isAvailable( available);
						break;
					}
					case 2:{
						Dmart.buyProduct( productName,  price);
						Dmart.purchaseProduct( productName,  quantity);
						break;
					}
					case 3:{
						Dmart.checkout( productName,  quantity,  totalPrice);
						Dmart.applyDiscount( category,  productName,  discount);
						
						break;
					}
					default:{
						System.out.println("enter within the limit ");
						break;
					}
				}
				break;
			}
			case 5:{
				
				int height = 10;
				String material= "iron";
				int steps = 8;
				int width = 4;
				String brand = "PUMA";
				double weightCapacity = 50;
				double price = 1000;
				
				System.out.println(" enter 1. for single parameter methods \n enter 2. for Double parameter methods \n enter 3. for 3 parameter methods \n");
				int parameter = sc.nextInt();
				switch(parameter){
					case 1:{
						Ladder.setHeight( height);
						Ladder.setMaterial( material);
						Ladder.setSteps( steps);						
						break;
					}
					case 2:{
						
						Ladder.setDimensions( height,  width);
						Ladder.setWeightCapacity( weightCapacity,  material);
						break;
					}
					case 3:{
						Ladder.setLadderDetails( brand,  height,  steps);
						Ladder.setLadderInfo( material,  weightCapacity,  price);						
						break;
					}
					default:{
						System.out.println("enter within the limit ");
						break;
					}
				}
				break;
			}
			
			case 6:{
				int wattage = 18;
				String brand= "Philips";
				double length = 4.4;
				String color = "white";
				String type = "LED";
				double price = 299.99;
				double voltage = 220;
				
				System.out.println(" enter 1. for single parameter methods \n enter 2. for Double parameter methods \n enter 3. for 3 parameter methods \n");
				int parameter = sc.nextInt();
				switch(parameter){
					case 1:{
						
						Tubelight.setWattage( wattage);
						Tubelight.setBrand( brand);
						Tubelight.setLength( length);
											
						break;
					}
					case 2:{
						Tubelight.setPowerConsumption( wattage,  voltage);
						Tubelight.setLightColor( color,  type);
						
						
						break;
					}
					case 3:{
						
						Tubelight.setTubelightDetails( brand,  wattage,  length);
						Tubelight.setTubelightInfo( type,  color,  price);
									
						break;
					}
					default:{
						System.out.println("enter within the limit ");
						break;
					}
				}
				break;
			}
			
			case 7:{
				
				String size= "A4";
				double height = 100;
				String brand = "JK";
				String type = "Glossy";
				double weight = 80.5;
				double width = 21.0;
				double thickness = 0.1;
				String quality = "High Quality";
				double price = 350;
				int sheets =500;
				
				System.out.println(" enter 1. for single parameter methods \n enter 2. for Double parameter methods \n enter 3. for 3 parameter methods \n");
				int parameter = sc.nextInt();
				switch(parameter){
					case 1:{
						
						Paper.setSize( size);
						Paper.setType( type) ;
						Paper.setWeight( weight);
						
						break;
					}
					case 2:{
						
						Paper.setDimensions( width,  height);
						Paper.setThickness( thickness,  quality);
						
						break;
					}
					case 3:{
						Paper.setPaperDetails( size,  type,  weight);
						Paper.setPaperInfo( brand,  sheets,  price);
							
						break;
					}
					default:{
						System.out.println("enter within the limit ");
						break;
					}
				}
				break;
			}
			
			default:{
				
				System.out.println("enter within the limit ");
				break;
			}

			
			
		}
	}
}		