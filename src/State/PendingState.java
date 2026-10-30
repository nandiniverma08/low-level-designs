package State;

public class PendingState implements OrderState {
    public void handle() {
        System.out.println("Order is waiting for confirmation");
    }
}

