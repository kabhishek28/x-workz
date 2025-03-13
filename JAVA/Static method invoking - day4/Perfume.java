class Perfume{
	
	public static void showScent() {
		Bracelet.pattern();
		
	}

	public static void applyPerfume() {
		System.out.println("8.2 You applied the perfume, and it smells amazing!");
		checkBottleLevel();
	}

	public static void checkBottleLevel() {
		System.out.println("8.3 The perfume bottle is half full.");
		changeFragrance();
	}

	public static void changeFragrance() {
		System.out.println("8.4 The fragrance has been changed to a floral scent.");
		Wallet.displayBalance();
		
	}
}