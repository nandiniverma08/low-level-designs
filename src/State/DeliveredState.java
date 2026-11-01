package State;

import javax.naming.Context;

//Problem: Object ka behaviour uski state ke according change hota hai.
//Solution: Har state ke liye separate class banate hain.
//Context: Current state ka reference maintain karta hai.
//        Benefit: Large if-else / switch conditions ko reduce kar sakte hain.

public class DeliveredState implements OrderState {
    public void handle() {
        System.out.println("Order has been delivered");
    }
}
