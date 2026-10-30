package State;

public class ShippedState implements OrderState {
    public void handle() {
        System.out.println("Order is on the way");
    }
}
