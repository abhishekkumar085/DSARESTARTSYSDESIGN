package ecomm;

public class Main {
    public static void main(String[] args) {
        Product p1 = new Product(1, "Guava", 40);
        Product p2 = new Product(2, "Apple", 140);
        p1.CreateProduct();
        System.out.println(p1);
        p2.CreateProduct();
        System.out.println(p2);
        Order o1 = new Order(1, "Tushar");
        o1.createOrder();
        System.out.println(o1);

        o1.addProduct(p1);
        o1.addProduct(p2);
        System.out.println("-------------------------------------------");
        // double price = o1.calculateTotal();
        // System.out.println("TOTAL PRICE : " + price);
        System.out.println("------------------------------------------");

        o1.getOrder();
        System.out.println("-----------------------------------------------");
        o1.getProductDetails();

        System.out.println("--------------------------------------");
        o1.showOrderDetails();
        System.out.println("----------------------------------------------");
        double price = o1.calculateTotal();
        System.out.println("TOTAL PRICE : " + price);

    }
}
