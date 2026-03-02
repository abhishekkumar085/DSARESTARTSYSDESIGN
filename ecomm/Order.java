package ecomm;

import java.util.ArrayList;
import java.util.List;

import ecomm.utils.Status;

public class Order {
    int order_id;
    String customer_name;
    List<Product> products = new ArrayList<>();
    double total_price = 0;
    static int total_order = 0;
    Status.ORDER_STATUS orderStatus;

    public Order(int order_id, String customer_name) {
        this.order_id = order_id;
        this.customer_name = customer_name;
        total_order++;
        orderStatus = Status.ORDER_STATUS.CREATED;

    }

    public void createOrder() {
        System.out.println(order_id);
        System.out.println(customer_name);

    }

    public void getOrder() {
        System.out.println("ORDER Id : " + order_id);
        System.out.println("CUSTOMER_NAME : " + customer_name);
        System.out.println("ORDER_STATUS : " + orderStatus);
    }

    public void addProduct(Product product) {
        // add the product to the list instead of assigning
        this.products.add(product);
        total_price += product.price;
    }

    public double calculateTotal() {
        return total_price;
    }

    public void getProductDetails() {
        for (int i = 0; i < products.size(); i++) {

            System.out.println(products.get(i));

        }
    }

    public void showOrderDetails() {
        getOrder();
        getProductDetails();

    }

}
