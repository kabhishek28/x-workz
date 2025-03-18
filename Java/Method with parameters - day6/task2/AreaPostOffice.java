 
 class AreaPostOffice{
	public static void deliver(String customername,String address){
		System.out.println("AreaPostOffice class is running");		
		SubRegionalPostOffice.deliver(customername,address);
	}
}