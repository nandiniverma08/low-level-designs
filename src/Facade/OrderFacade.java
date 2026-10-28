package Facade;

//Intuition: Ek complex system ko use karne ke liye ek simple entry point provide karna.
//
//Real-life example: Jab tum online order place karti ho, tumhe inventory,
// payment aur delivery services ko individually call nahi karna padta. Ek OrderFacade ye sab coordinate kar sakta hai.
//
//Problem: Client ko multiple complex subsystems directly use karne pad rahe hain.
//        Solution: Ek facade class simple interface provide karti hai.
//Benefit: Client code simpler aur subsystems se less coupled hota hai.
//Memory trick: Facade = One simple entry point for a complex system.

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
