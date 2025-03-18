//Program to store 10 references of hotel names and print on console

class Hotel{
	public static void main(String[] args){
		String[] hotelNames = {"Ambur Biryani","Nati mane","Uthara karnnataka uta","Roti mane","UK Mane","Mayar","Swathi Hotel","Hotel Manasa","Shanthi Sagar","Donne biryani Buy one get one free"};
		for(String ref : hotelNames){
			System.out.println(ref);
		}
	}
}