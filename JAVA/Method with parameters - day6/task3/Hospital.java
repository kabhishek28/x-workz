
 class Hospital{
	 public static void checkup(String patientname , int age ,  String mobile ,String email ,String sicknes){
	 
	 System.out.println("Hospital class is running ");
	 System.out.println("\n patientname :" + patientname +"\n age :" + age +"\n mobile no :"+mobile+"\n email :"+email+"\n sicknes :"+sicknes);
	 
	 Doctor.treatment(patientname,age);
	 }
 }
 