class RatPoisonRun{
	public static void main(String[] args){
		int noOfPice;
		int noOfRats;
		boolean deathOrLived;
		
		noOfPice = 2;
		noOfRats = 4;
		deathOrLived = true;
		RatPoison ratpoison1 = new RatPoison(noOfPice,noOfRats,deathOrLived);
		System.out.println("noOfPice : "+ratpoison1.noOfPice+" noOfRats : "+ratpoison1.noOfRats+" deathOrLived : "+ratpoison1.deathOrLived);
		
		
		noOfPice = 6;
		noOfRats = 18;
		deathOrLived = false;
		RatPoison ratpoison2 = new RatPoison(noOfPice,noOfRats,deathOrLived);
		System.out.println("noOfPice : "+ratpoison2.noOfPice+" noOfRats : "+ratpoison2.noOfRats+" deathOrLived : "+ratpoison2.deathOrLived);
		
		
		noOfPice = 5;
		noOfRats = 16;
		deathOrLived = true;
		RatPoison ratpoison3 = new RatPoison(noOfPice,noOfRats,deathOrLived);
		System.out.println("noOfPice : "+ratpoison3.noOfPice+" noOfRats : "+ratpoison3.noOfRats+" deathOrLived : "+ratpoison3.deathOrLived);
		
		
		noOfPice = 4;
		noOfRats = 2;
		deathOrLived = true;
		RatPoison ratpoison4 = new RatPoison(noOfPice,noOfRats,deathOrLived);
		System.out.println("noOfPice : "+ratpoison4.noOfPice+" noOfRats : "+ratpoison4.noOfRats+" deathOrLived : "+ratpoison4.deathOrLived);
		
		
		noOfPice = 1;
		noOfRats = 4;
		deathOrLived = false;
		RatPoison ratpoison5 = new RatPoison(noOfPice,noOfRats,deathOrLived);
		System.out.println("noOfPice : "+ratpoison5.noOfPice+" noOfRats : "+ratpoison5.noOfRats+" deathOrLived : "+ratpoison5.deathOrLived);
		
		
		
		
		
		
		
	}
}