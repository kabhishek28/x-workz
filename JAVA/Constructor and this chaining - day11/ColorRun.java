class ColorRun{
	public static void main(String[] args){
		System.out.println("===============================================");
		Color color1 = new Color();
		color1.display();
		System.out.println("===============================================");
		
		Color color2 = new Color("aisa","red","green","black",4000,100);
		color2.display();
		System.out.println("===============================================");
		
		Color color3 = new Color("wipro ","green","orange","yellow",6000,120);
		color3.display();
		System.out.println("===============================================");
		
		Color color4 = new Color("IMB","Red","yellow","mat black",5000,15);
		color4.display();
		System.out.println("===============================================");
		
		Color color5 = new Color("infosys","blue","pink","white",3000,10);
		color5.display();
		System.out.println("===============================================");
		
		Color color6 = new Color("dilote","red","yellow","black",2500,14);
		color6.display();
		System.out.println("===============================================");
		
		Color color7 = new Color("accenture","black","orange","red",3000,60);
		color7.display();
		System.out.println("===============================================");
	}
}