import Builder.Transaction;
import Factory.PaymentCreator;
import Factory.UPIPaymentCreator;
import Singleton.PaymentConfig;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        /* Singleton
        PaymentConfig config1 = PaymentConfig.getInstance();
        PaymentConfig config2 = PaymentConfig.getInstance();

        System.out.println(config1.getCurrency());
        System.out.println(config2.getPaymentTimeout());

        System.out.println(config1 == config2);


Factory
        PaymentCreator creator = new UPIPaymentCreator();
        creator.processPayment(500);

 */
        Transaction transaction =
                new Transaction.Builder(5000, "INR")
                        .description("Rent payment")
                        .referenceNumber("REF123")
                        .notes("October rent")
                        .build();

        System.out.println(transaction.getAmount());
        System.out.println(transaction.getCurrency());
        System.out.println(transaction.getDescription());
        System.out.println(transaction.getReferenceNumber());
        System.out.println(transaction.getNotes());
    }
}