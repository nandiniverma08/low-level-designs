package Decorator;

//Definition: Decorator Pattern adds new behavior to an existing object dynamically, without modifying its original class.
// 1. Real-life example
//Suppose you have a basic notification and want to add SMS notifications too.
//- Notification → common contract (send())
//  - BasicNotification → sends a basic notification
//- SMSDecorator → calls the existing notification and adds SMS behavior
public class BasicNotification implements Notification {

    public void send() {
        System.out.println("Sending basic notification");
    }
}
