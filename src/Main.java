import AbstractFactory.InterfaceTypes;
import AbstractFactory.UIFactory;
import AbstractFactory.WindowsFactory;
import Adapter.Payment;
import Adapter.PaymentAdapter;
import Adapter.ThirdPartyGateway;
import Builder.Transaction;
import Decorator.BasicNotification;
import Decorator.Notification;
import Decorator.SMSDecorator;
import Facade.OrderFacade;
import Factory.PaymentCreator;
import Factory.UPIPaymentCreator;
import Observer.Observer;
import Observer.YouTubeChannel;
import Observer.Subscriber;
import ParkingLotSystem.ParkingSpot;
import ParkingLotSystem.Vehicle;
import ParkingLotSystem.VehicleType;
import Singleton.PaymentConfig;
import State.DeliveredState;
import State.Order;
import State.PendingState;
import State.ShippedState;
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

        /* Structural : Abstract Factory

        UIFactory factory = new WindowsFactory();

        InterfaceTypes.Button button = factory.createButton();
        InterfaceTypes.Checkbox checkbox = factory.createCheckbox();

        button.render();
        checkbox.render();

         */

/* Adapter
        ThirdPartyGateway gateway = new ThirdPartyGateway();

        Payment payment = new PaymentAdapter(gateway);

        payment.pay(500);

 */
        /* Decorator

        Notification notification = new BasicNotification();

        notification = new SMSDecorator(notification);

        notification.send();

         */
        /*

        OrderFacade order = new OrderFacade();
        order.placeOrder();

         */
        /*

        YouTubeChannel channel = new YouTubeChannel();

        Observer s1 = new Subscriber("Aman");
        Observer s2 = new Subscriber("Riya");

        channel.subscribe(s1);
        channel.subscribe(s2);

        channel.uploadVideo("Java Design Patterns");

         */

        /*

        Order order = new Order();

        order.setState(new PendingState());
        order.processOrder();

        order.setState(new ShippedState());
        order.processOrder();

        order.setState(new DeliveredState());
        order.processOrder();

         */

        //Parking System

        // 1. Create parking spots
        ParkingSpot carSpot = new ParkingSpot(101, VehicleType.CAR);
        ParkingSpot bikeSpot = new ParkingSpot(102, VehicleType.BIKE);

        // 2. Create vehicles
        Vehicle car = new Vehicle("MP07AB1234", VehicleType.CAR);
        Vehicle bike = new Vehicle("MP07CD5678", VehicleType.BIKE);

        // 3. Check initial availability
        System.out.println("Car spot available: " + carSpot.isAvailable());

        // 4. Park car in car spot
        boolean carParked = carSpot.parkVehicle(car);
        System.out.println("Car parked: " + carParked);

        // 5. Try parking another car in the same spot
        Vehicle anotherCar = new Vehicle("MP07EF9999", VehicleType.CAR);
        boolean anotherCarParked = carSpot.parkVehicle(anotherCar);
        System.out.println("Another car parked: " + anotherCarParked);

        // 6. Try parking bike in car spot
        boolean wrongVehicleParked = carSpot.parkVehicle(bike);
        System.out.println("Bike parked in car spot: " + wrongVehicleParked);

        // 7. Remove car
        carSpot.removeVehicle();
        System.out.println("Car spot available after removal: " + carSpot.isAvailable());

        // 8. Park bike in bike spot
        boolean bikeParked = bikeSpot.parkVehicle(bike);
        System.out.println("Bike parked: " + bikeParked);


    }
}