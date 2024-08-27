package sem1;

import java.util.ArrayList;
import java.util.List;

class BottleOfWaterVendingMachineTest {

    private List<Product> products;
    private BottleOfWaterVendingMachine vendingMachine;

    @BeforeEach
    void setUp() {
        this.products = new ArrayList<>();
        this.vendingMachine = new BottleOfWaterVendingMachine(products);
    }

    @Test
    void getProductTestSuccessful() {
        // expected
        products.add(new BottleOfWater("ExampleName1", 1.0d, 1000));
        products.add(new BottleOfWater("ExampleName2", 2.0d, 500));
        this.vendingMachine = new BottleOfWaterVendingMachine(products);
        BottleOfWater expected = new BottleOfWater("ExampleName2", 2.0d, 500);

        // actual
        BottleOfWater actual = vendingMachine.getProduct("ExampleName2", 500);

        Assertions.assertEquals(expected, actual);
    }
}