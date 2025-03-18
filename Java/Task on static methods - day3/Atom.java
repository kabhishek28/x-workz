class Atom{
    public static void name() {
		System.out.println("invoking the methods of class IceCream from 9.6 to 9.10");
		IceCream.coneOrCup();
		System.out.println("invoking the methods of class Atom from 10.1 to 10.5");
        System.out.println("10.1.Name: Hydrogen");
		symbol();
    }

    public static void symbol() {
        System.out.println("10.2.Symbol: H");
		atomicMass();
    }

    public static void atomicNumber() {
        System.out.println("10.3.Atomic Number: 1");
		protons();
    }

    public static void atomicMass() {
        System.out.println("10.4.Atomic Mass: 1.008 u");
		atomicNumber();
    }

    public static void protons() {
        System.out.println("10.5.Protons: 1");
		neutrons();
		
    }

    public static void neutrons() {
        System.out.println("10.6.Neutrons: 0 (for most common isotope)");
		electrons();
    }

    public static void electrons() {
        System.out.println("10.7.Electrons: 1");
		state();
    }

    public static void state() {
        System.out.println("10.8.State at Room Temperature: Gas");
		bonding();
    }

    public static void bonding() {
        System.out.println("10.9.Common Bonding: Forms H₂ molecule or bonds with oxygen to form H₂O");
		discovery();
    }

    public static void discovery() {
        System.out.println("10.10.Discovery: Discovered by Henry Cavendish in 1766");
    }

    public static void main(String[] args) {
        
		name();
		
		
    }
}
