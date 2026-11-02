package FoodOrderingSystem;

import Adapter.Payment;

public class CashPayment implements PaymentStrategy{

    @Override
    public void pay(double amount) {
        System.out.println("Processing Cash payment...");
        System.out.println("Amount paid: Rs. " + amount);
    }
}
