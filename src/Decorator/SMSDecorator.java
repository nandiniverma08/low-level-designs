package Decorator;

public class SMSDecorator implements Notification {

    private Notification notification;

    public SMSDecorator(Notification notification) {
        this.notification = notification;
    }

    public void send() {
        notification.send();
        System.out.println("Sending SMS");
    }
}
