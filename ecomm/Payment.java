package ecomm;

import ecomm.utils.Status;

public class Payment {
    private Status.PAYMENT_STATUS paymentStatus;
    private Status.PAYMENT_METHOD paymentMethod;
    private double amount;

    public Payment(Status.PAYMENT_METHOD paymentMethod, double amount) {
        this.paymentMethod = paymentMethod;
        this.paymentStatus = Status.PAYMENT_STATUS.FAILED; // default failed;
        this.amount = amount;

    }

    public void makePayment(double payableAmount) {
        if (amount <= 0) {
            System.out.println("Amount cannot be 0 or negative");
            return;
        }
        if (payableAmount == amount) {
            this.paymentStatus = Status.PAYMENT_STATUS.SUCCESS;
            System.out.println("Payment successful using " + paymentMethod);
        } else {
            this.paymentStatus = Status.PAYMENT_STATUS.FAILED;
            System.out.println("Payment failed. Amount mismatch. Expected: " + payableAmount + ", Received: " + amount);
        }
    }

    public Status.PAYMENT_STATUS getPaymentStatus() {
        return paymentStatus;
    }

    public Status.PAYMENT_METHOD getPaymentMethod() {
        return paymentMethod;
    }

    public double getAmount() {
        return amount;
    }

    @Override
    public String toString() {
        return "Payment Method: " + paymentMethod +
                ", Amount: " + amount +
                ", Payment Status: " + paymentStatus;
    }

}
