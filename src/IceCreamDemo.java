import java.util.ArrayList;

public class IceCreamDemo {
    public static void main(String[] args) {
        IceCream iceCream  = new IceCream("Chocolate",15,3);
        IceCream iceCream1 = new IceCream("Strawberry",20,2);

        iceCream.addTopping("nuts");
        iceCream.addTopping("cherries");

        iceCream.printToppings();

        iceCream1.addTopping("Sprinkles");
        iceCream1.printToppings();

       // iceCream.printToppings();

    }
}
