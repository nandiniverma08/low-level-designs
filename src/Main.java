import AbstractFactory.InterfaceTypes;
import AbstractFactory.UIFactory;
import AbstractFactory.WindowsFactory;
import Builder.Transaction;
import Factory.PaymentCreator;
import Factory.UPIPaymentCreator;
import Singleton.PaymentConfig;
import Strategy.CardPaymentStrategy;
import Strategy.PaymentStrategy;
import Strategy.UpiPaymentStrategy;

import java.math.BigDecimal;

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

        /*
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

         */

        /*
    // Behavioural : Strategy Pattern

        PaymentStrategy strategy = new UpiPaymentStrategy();
        strategy.pay(new BigDecimal("500.00"));

        strategy = new CardPaymentStrategy();
        strategy.pay(new BigDecimal("1200.00"));

         */


        UIFactory factory = new WindowsFactory();

        InterfaceTypes.Button button = factory.createButton();
        InterfaceTypes.Checkbox checkbox = factory.createCheckbox();

        button.render();
        checkbox.render();
    }
}