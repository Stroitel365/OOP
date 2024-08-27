package sem1_hw;

import java.util.ArrayList;
import java.util.List;

public class HotDrinkVendingMachine implements VendingMachine {

    List<HotDrink> hotDrinksList = new ArrayList<>();
    List<HotDrink> searchForProduct = new ArrayList<>();

    @Override
    public Product getProduct(String name) {
        return null;

    }

    public String getProduct(String name, int volume, int temperature ) {
        for (HotDrink hotDrink : hotDrinksList) {
            if (hotDrink.getName().equals(name) && (hotDrink.getVolume()==volume) && (hotDrink.getTemperature()==temperature) ){
                searchForProduct.add(hotDrink);
            }
        }
        return searchForProduct.toString();
    }

    public void initProduct(List<HotDrink> list) {
       this.hotDrinksList = list;
    }



}