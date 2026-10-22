package Factory;

public class UPIPayment implements Payment {

    public void pay(double amount) {
        System.out.println("Paid using UPI");
    }
}
