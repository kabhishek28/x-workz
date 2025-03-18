//Program to store 10 references of char's and print on console
class Character{
	public static void main(String[] args){
		char[] characters = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J'};
        for (char ch : characters) {
            System.out.println(ch);
        }
	}
}