package ecomm;

public class Product {
    private int product_id;
    private String product_name;
    private double price;

    public Product(int product_id, String product_name, double price) {
        this.product_id = product_id;
        this.product_name = product_name;
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public String getProductName() {
        return product_name;
    }

    @Override
    public String toString() {
        return product_name + " - ₹" + price;
    }

}
