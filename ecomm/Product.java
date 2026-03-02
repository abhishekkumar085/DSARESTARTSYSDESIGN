package ecomm;

public class Product {
    int product_id;
    String product_name;
    double price;

    public Product(int product_id, String product_name, double price) {
        this.product_id = product_id;
        this.product_name = product_name;
        this.price = price;
    }

    public void CreateProduct() {
        if (price <= 0) {
            System.out.println("Price Cannot be 0 or negative");
        }
        System.out.println("Product Id : " + product_id);
        System.out.println("Product Name : " + product_name);
        System.out.println("Product Price : " + price);

    }

    @Override
    public String toString() {
        return "Product ID : " + product_id +
                ", Name : " + product_name +
                ", Price : " + price;
    }

}
