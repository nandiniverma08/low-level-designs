package State;

public class DeliveredState implements OrderState {
    public void handle() {
        System.out.println("Order has been delivered");
    }
}
