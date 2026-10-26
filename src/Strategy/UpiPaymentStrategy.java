package Strategy;

import java.math.BigDecimal;

public class UpiPaymentStrategy implements PaymentStrategy {

    @Override
    public void pay(BigDecimal amount) {
        System.out.println("Processing UPI payment: " + amount);
    }
}
