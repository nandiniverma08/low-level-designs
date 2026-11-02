package FoodOrderingSystem;

public class CardPayment implements PaymentStrategy {

    @Override
    public void pay(double amount) {
        System.out.println("Processing Card payment...");
        System.out.println("Amount paid: Rs. " + amount);
    }
}
