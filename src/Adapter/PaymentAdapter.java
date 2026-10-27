package Adapter;

public class PaymentAdapter implements Payment{

    private ThirdPartyGateway gateway;

    public PaymentAdapter(ThirdPartyGateway gateway) {
        this.gateway = gateway;
    }

    @Override
    public void pay(double amount) {
        gateway.makePayment(String.valueOf(amount));
    }
}
