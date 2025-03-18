
 class HospitalRunner{
	 public static void main(String[] args){
		 String patientname = "manju";
		 int age = 21;
		 String mobile = "9019754104";
		 String email = "manju.143@gmail.com";
		 String sicknes = "HIV";
		 System.out.println("HospitalRunner class is running");
		 Hospital.checkup(patientname,age,mobile,email,sicknes);
	 }
 }