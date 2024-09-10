package weekquiz02;

public class Product implements Promotion {
    String name;
    int price;
    int weight;

    public Product(String name, int price, int weight) {
        this.name = name;
        this.price = price;
        this.weight = weight;
    }

    @Override
    public int getDiscountAmount() {
        if (this.name.equals("grocery")) {
            return 2000;
        } else if (this.name.equals("beauty")) {
            return 10000;
        } else {
            return 0;
        }
    }

    @Override
    public String toString() {
        return name;
    }
}