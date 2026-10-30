package State;

public class Order {
    private OrderState state;

    public void setState(OrderState state) {
        this.state = state;
    }

    public void processOrder() {
        state.handle();
    }
}
