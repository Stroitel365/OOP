package sem1_hw;

public abstract class Product {
    public String name;
    private double cost;
    private int volume;


    public Product(String name, double cost, int volume) {
        this.name = name;
        this.cost = cost;
        this.volume = volume;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    @Override
    public String toString() {
        return "Product{" +
               "name='" + name + '\'' +
               ", cost=" + cost +
               '}';
    }
}