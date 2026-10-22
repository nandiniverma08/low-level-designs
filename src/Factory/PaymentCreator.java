package Factory;

public abstract class PaymentCreator {

    public abstract Payment createPayment();

    public void processPayment(double amount) {
        Payment payment = createPayment();
        payment.pay(amount);
    }
}
