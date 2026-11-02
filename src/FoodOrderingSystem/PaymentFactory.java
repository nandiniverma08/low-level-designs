package FoodOrderingSystem;

public class PaymentFactory {

    public static PaymentStrategy getPaymentType(String type) {

        if (type.equalsIgnoreCase("UPI")) {
            return new UPIPayment();
        }

        if (type.equalsIgnoreCase("CARD")) {
            return new CardPayment();
        }

        if (type.equalsIgnoreCase("CASH")) {
            return new CashPayment();
        }

        throw new IllegalArgumentException("Invalid payment type");
    }
}
