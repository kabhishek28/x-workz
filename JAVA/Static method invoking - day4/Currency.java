class Currency{
	public static void showExchangeRate() {
		Wallet.checkWalletStatus();
    
	}

	public static void convertAmount() {
		System.out.println("10.2 100 USD is equivalent to 85 EUR.");
		updateExchangeRate();
	}

	public static void updateExchangeRate() {
		System.out.println("10.3 The exchange rate has been updated.");
		checkCurrencyStrength();
	}

	public static void checkCurrencyStrength() {
		System.out.println("10.4 The currency is strong compared to others.");
		Bitcoin.bitcoinPrice();
	}
}