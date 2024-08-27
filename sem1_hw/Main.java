package sem1_hw;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        HotDrinkVendingMachine vmHotDrink = new HotDrinkVendingMachine();
        List<HotDrink> hotDrinksList = new ArrayList<>(Arrays.asList(
                new HotDrink("Capuchino", 550, 500, 90),
                new HotDrink("Tea", 350, 300, 100),
                new HotDrink("Latte", 600, 500, 90)));


        vmHotDrink.initProduct(hotDrinksList);


        System.out.println(vmHotDrink.getProduct("Tea", 300, 100));
        }
}
