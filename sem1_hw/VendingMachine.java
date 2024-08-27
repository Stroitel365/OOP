package sem1_hw;

public interface VendingMachine {

    Product getProduct(String name) throws IllegalStateException;

    static Product getProduct(String name,int volume, int temperature ) {
        
        return null;
       
    }
}
