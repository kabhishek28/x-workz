class Wallet{
	
	public static void displayBalance() {
		System.out.println("9.1 Your wallet balance is $500.");
		addCash();
	}

	public static void addCash() {
		System.out.println("9.2 You added $100 to your wallet.");
		spendCash();
	}

	public static void spendCash() {
		System.out.println(" 9.3 You spent $50 from your wallet.");
		Currency.showExchangeRate();
	}

	public static void checkWalletStatus() {
		System.out.println("9.4 Your wallet is not empty.");
		System.out.println("10.1 The exchange rate is 1 USD = 0.85 EUR.");
		Currency.convertAmount();
	
	}
}