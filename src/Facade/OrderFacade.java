package Facade;

class InventoryService {
    void checkStock() {
        System.out.println("Stock checked");
    }
}

class PaymentService {
    void pay() {
        System.out.println("Payment completed");
    }
}

class DeliveryService {
    void arrangeDelivery() {
        System.out.println("Delivery arranged");
    }
}
public class OrderFacade {
    private InventoryService inventory = new InventoryService();
    private PaymentService payment = new PaymentService();
    private DeliveryService delivery = new DeliveryService();

    public void placeOrder() {
        inventory.checkStock();
        payment.pay();
        delivery.arrangeDelivery();
    }
}
