import Class_Parameter.*;




public class Main {
    public static void main(String[] args) {

        System.out.println("-----------------------------------------------------------START--------------------------------------------------------------------------");

        System.out.println("====================programming 1=====================");
        Shop shop = new Shop();
        Display display = new Display();
        shop.ads(display);

        System.out.println("====================programming 2=====================");
        Theater theater = new Theater();
        Poster poster = new Poster();
        theater.show(poster);

        System.out.println("====================programming 3=====================");
        RCB rcb = new RCB();
        Match match = new Match();
        rcb.captain(match);


        System.out.println("====================programming 4=====================");
        Space space = new Space();
        ISRO isro = new ISRO();
        space.noOfRocket(isro);

        System.out.println("====================programming 5=====================");
        Rocket rocket = new Rocket();
        rocket.budget(isro);

        System.out.println("====================programming 6=====================");
        Dolo650 dolo650 = new Dolo650();
        Factory factory = new Factory();
        dolo650.noOfTablet(factory);

        System.out.println("====================programming 7=====================");
        Barber barber = new Barber();
        Cost cost = new Cost();
        barber.style(cost);

        System.out.println("====================programming 8=====================");
        Cameraa cameraa = new Cameraa();
        Lens lens = new Lens();
        cameraa.onOfD(lens);

        System.out.println("====================programming 9=====================");
        Mango mango = new  Mango();
        Hotel hotel = new Hotel();
        mango.shake(hotel);


        System.out.println("====================programming 10=====================");
        Pillow pillow = new Pillow();
        Cot cot = new  Cot();
        pillow.kg(cot);

        System.out.println("-------------------------------------------------------END---------------------------------------------------------------------------");

    }


}