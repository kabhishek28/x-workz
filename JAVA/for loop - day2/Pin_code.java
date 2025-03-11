// Program to store 10 references of pin-code and print on console

class Pin_code{
	public static void main(String[] args){
		int[] pinCode = {58302,50012,52001,30561,52003 ,50505, 60606, 70707, 80808, 90909, 10110};
		for(int ref:pinCode){
			System.out.println(ref);
		}
	}
}