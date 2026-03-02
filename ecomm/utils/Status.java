package ecomm.utils;

public class Status {
    public enum ORDER_STATUS {
        CREATED,
        PAID,
        CANCELLED

    }

    public enum PAYMENT_STATUS {
        SUCCESS,
        FAILED
    }

    public enum PAYMENT_METHOD {
        UPI, CARD, NET_BANKING
    }
}
