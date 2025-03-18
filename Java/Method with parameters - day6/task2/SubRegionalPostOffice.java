
 class SubRegionalPostOffice{
	public static void deliver(String customername,String address){
		System.out.println("SubRegionalPostOffice class is running");		
		RegionalPostOffice.deliver(customername,address);
	}
}