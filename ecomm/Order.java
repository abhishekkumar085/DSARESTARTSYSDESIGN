package ecomm;

import java.util.ArrayList;
import java.util.List;
import ecomm.utils.Status;

public class Order {
    private static int total_order = 0;
    private int order_id;
    private String customer_name;
    private List<Product> products;
    private double total_price;
    private double discount;
    private double finalPayable;
    private Payment payment;
    private Status.ORDER_STATUS orderStatus;

    public Order(int order_id, String customer_name) {
        this.order_id = order_id;
        this.customer_name = customer_name;
        this.products = new ArrayList<>();
        total_order++;
        orderStatus = Status.ORDER_STATUS.CREATED;

    }

    public void addProduct(Product product) {
        // add the product to the list instead of assigning
        this.products.add(product);
        total_price += product.getPrice();

    }

    // Apply discount if applicable
    public void applyDiscount() {
        if (total_price > 100) {
            discount = total_price * 0.10;
        }
        finalPayable = total_price - discount;
    }

    public void makePayment(Status.PAYMENT_METHOD method, double amount) {
        payment = new Payment(method, amount);
        payment.makePayment(finalPayable);

        if (payment.getPaymentStatus() == Status.PAYMENT_STATUS.SUCCESS) {
            orderStatus = Status.ORDER_STATUS.PAID;
        }
    }

    public void showOrderDetails() {

        System.out.println("-----------------------------------------");
        System.out.println("Order ID        : " + order_id);
        System.out.println("Customer Name   : " + customer_name);
        System.out.println("Order Status    : " + orderStatus);
        System.out.println("-----------------------------------------");

        System.out.println("Products:");
        int count = 1;
        for (Product p : products) {
            System.out.println(count++ + ". " + p);
        }

        System.out.println("-----------------------------------------");
        System.out.println("Total Amount    : ₹" + total_price);
        System.out.println("Discount (10%)  : ₹" + discount);
        System.out.println("Final Payable   : ₹" + finalPayable);

        if (payment != null) {
            System.out.println("-----------------------------------------");
            System.out.println("Payment Method  : " + payment.getPaymentMethod());
            System.out.println("Payment Status  : " + payment.getPaymentStatus());
        }

        System.out.println("-----------------------------------------");
        System.out.println("Total Orders    : " + total_order);
        System.out.println("-----------------------------------------");
    }

}
