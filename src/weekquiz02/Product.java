package weekquiz02;

public class Product implements Promotion {
    String name;
    int price;
    int weight;
    int discountPrice;

    public Product(String name, int price, int weight) {
        this.name = name;
        this.price = price;
        this.weight = weight;

        initDiscountPrice();
    }

    private void initDiscountPrice() {
        if (this.name.equals("grocery")) {
            this.discountPrice = 2000;
        } else if (this.name.equals("beauty")) {
            this.discountPrice = 10000;
        } else {
            this.discountPrice = 0;
        }
    }

    @Override
    public int getDiscountAmount() {
        return discountPrice;
    }

    @Override
    public String toString() {
        return name;
    }
}