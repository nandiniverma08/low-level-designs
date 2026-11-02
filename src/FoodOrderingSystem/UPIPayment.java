package FoodOrderingSystem;

public class UPIPayment implements PaymentStrategy {

    @Override
    public void pay(double amount) {
        System.out.println("Processing UPI payment...");
        System.out.println("Amount paid: Rs. " + amount);
    }
}
