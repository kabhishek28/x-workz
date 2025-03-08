class BakeryRun{
	public static void main(String[] args){
		String itemname = "cake";
		int quantity = 1;
		Boolean yesorno = true;
		Boolean yesornoo = false;
		String owner = "Sknanda";
		String cashier = "Sagar";
		
		Bakery.buy(itemname,quantity);
		Bakery.open(yesorno);
		Bakery.close(yesornoo);
		Bakery.owner(owner);
		Bakery.cashier(cashier);
	}
}