class Laptop{
    
    public static void processor() {
        System.out.println("1.1.Processor: Intel i7 or AMD Ryzen 7");
		ram();
    }

    
    public static void ram() {
        System.out.println("1.2.RAM: 16GB DDR4");
		storage();
    }

    
    public static void storage() {
        System.out.println("1.3.Storage: 512GB SSD");
		battery();
    }

    
    public static void battery() {
        System.out.println("1.4.Battery: 5000mAh, lasts up to 10 hours");
		display();
    }

    
    public static void display() {
        System.out.println("1.5.Display: 15.6-inch Full HD");
    }

    
    public static void keyboard() {
        System.out.println("1.6.Keyboard: Backlit with NumPad");
    }

    
    public static void touchpad() {
        System.out.println("1.7.Touchpad: Multi-gesture support");
    }

    
    public static void ports() {
        System.out.println("1.8.Ports: USB 3.0, HDMI, Type-C");
    }

    
    public static void coolingSystem() {
        System.out.println("1.9.Cooling System: Dual fans with heat pipes");
    }

    
    public static void operatingSystem() {
        System.out.println("1.10.Operating System: Windows 11 / Linux / macOS");
    }

    public static void main(String[] args) { 
	System.out.println("invoking the methods Loptop class from 1.1 to 1.5");
	
        processor();
		
        
    }
}