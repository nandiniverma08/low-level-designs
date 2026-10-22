package Factory;

public class UPIPaymentCreator extends PaymentCreator{

    @Override
    public Payment createPayment() {
        return new UPIPayment();
    }
}
