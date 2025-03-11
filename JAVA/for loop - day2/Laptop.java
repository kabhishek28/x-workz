//Program to store 10 references of laptop brands and print on console
class Laptop{
	public static void main(String[] args){
		
		String[] laptops = {"Dell", "HP", "Lenovo", "Apple", "Asus", "Acer", "Microsoft", "Razer", "MSI", "Samsung"};
        for (String laptop : laptops) {
            System.out.println(laptop);
        }
	}
}