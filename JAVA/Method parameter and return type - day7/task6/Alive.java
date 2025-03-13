//Method which takes a name and return alive;8

class Alive{
	public static boolean getAlive(String name){
		if(name == "abhi"){

			return true;
		}
		else if(name == "dhanu"){
			return true;
		}
		else if(name == "srujal"){
			return false;
		}
		else if(name == "harsha"){
			return false;
		}
		else if(name == "dolli"){
			return false;
		}
		else if(name == "vinutha"){
			return true;
		}
		else if(name == "aishwarya"){
			return true;
		}
		else{
			return false;
		}
		
		//return true;
	}

	public static boolean check(int no)
	{
		if(no>10)
		{
			return true;
		}
		else{
			return false;
		}
		//return false;
	}
}