class Boolean_data_tp{
	public static void main(String[] args){	
	
		boolean isActive = true;
        boolean isComplete = false;
        boolean isAvailable = true;
        boolean isVerified = false;
        boolean isSuccessful = true;

        System.out.println("First initialization values (boolean):");
        System.out.println(isActive);
        System.out.println(isComplete);
        System.out.println(isAvailable);
        System.out.println(isVerified);
        System.out.println(isSuccessful);

        boolean status = isActive;
        boolean completion = isComplete;
        boolean availability = isAvailable;
        boolean verification = isVerified;
        boolean success = isSuccessful;

        System.out.println("Re-initialization values (boolean):");
        System.out.println(status);
        System.out.println(completion);
        System.out.println(availability);
        System.out.println(verification);
        System.out.println(success);
    }
}