package ecomm;

import ecomm.utils.Status;

public class Main {
    public static void main(String[] args) {

        Product p1 = new Product(1, "Guava", 4);
        Product p2 = new Product(2, "Apple", 96);

        Order order = new Order(1, "Tushar");

        order.addProduct(p1);
        order.addProduct(p2);

        order.applyDiscount();

        order.makePayment(Status.PAYMENT_METHOD.UPI, 101);

        order.showOrderDetails();

    }
}
