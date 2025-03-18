class Bitcoin{
	public static void bitcoinPrice() {
    System.out.println("11.1 The current Bitcoin price is $50,000.");
	buyBitcoin();
	}

	public static void buyBitcoin() {
		System.out.println("11.2 You purchased 0.1 BTC.");
		sellBitcoin();
	}

	public static void sellBitcoin() {
		System.out.println("11.3 You sold 0.05 BTC.");
		checkBitcoinBalance();
	}

	public static void checkBitcoinBalance() {
		System.out.println("11.4 You have 0.2 BTC in your wallet.");
	}
}