package Strategy;

import java.math.BigDecimal;

public class CardPaymentStrategy implements PaymentStrategy{

    @Override
    public void pay(BigDecimal amount) {
        System.out.println("Processing card payment: " + amount);
    }
}
