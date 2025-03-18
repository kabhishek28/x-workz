//Program to store 10 references of temple names and print on console


class Temple{
	public static void main(String[] args){
		String[] temples = {"Tirupati", "Vaishno Devi", "Kashi Vishwanath", "Golden Temple", "Somnath", "Kedarnath", "Badrinath", "Meenakshi", "Siddhivinayak", "Jagannath"};
        for (String temple : temples) {
            System.out.println(temple);
        }
	}
}