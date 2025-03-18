
 class PostHeadMaster{
	public static void deliver(String customername,String address){
		System.out.println("PostHeadMaster class is running");		
		PostMaster.deliver(customername,address);
	}
}