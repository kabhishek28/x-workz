 
 class PostRunner{
	public static void main(String[] args){
		System.out.println("PostRunner class is running");
		String customername = "OM";
		String address = "Rajajinagar";
		
		AreaPostOffice.deliver(customername,address);
	}
}