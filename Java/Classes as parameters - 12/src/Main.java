import Class_Parameter.Display;
import Class_Parameter.Shop;
public class Main {
    public static void main(String[] args) {
        System.out.println(".....................hi i am main class................");
        Shop shop = new Shop();
        Display display = new Display();
        System.out.println("here invoking the ads method of Shop clss");
        shop.ads(display);


    }
}