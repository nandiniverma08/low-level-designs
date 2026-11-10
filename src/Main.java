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
import ElevatorSystem.*;
import Facade.OrderFacade;
import Factory.PaymentCreator;
import Factory.UPIPaymentCreator;
import FoodOrderingSystem.PaymentFactory;
import FoodOrderingSystem.PaymentService;
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
//import Strategy.PaymentStrategy;
import Strategy.UpiPaymentStrategy;
import FoodOrderingSystem.PaymentStrategy;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

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

        /*

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

         */

        /*

        // Customer selects UPI
        String paymentType = "UPI";

        // Factory creates the correct payment object
        PaymentStrategy strategy =
                PaymentFactory.getPaymentType(paymentType);

        // PaymentService receives that object
        PaymentService paymentService =
                new PaymentService(strategy);

        // Process payment
        paymentService.processPayment(500);

         */

        // Step 1: Create elevators
        // STEP 1: Create elevators
        Elevator e1 = new Elevator(1, 2, 10);
        Elevator e2 = new Elevator(2, 7, 10);
        Elevator e3 = new Elevator(3, 9, 10);

        // STEP 2: Create elevator list
        List<Elevator> elevators = new ArrayList<>();

        elevators.add(e1);
        elevators.add(e2);
        elevators.add(e3);

        // STEP 3: Create scheduler
        ElevatorScheduler scheduler = new ElevatorScheduler();

        // STEP 4: Create controller
        ElevatorController controller =
                new ElevatorController(elevators, scheduler);

        // ==================================
        // SCENARIO 1: Passenger on Floor 3
        // ==================================

        Floor floor3 = new Floor(3);

        // Passenger presses UP
        ElevatorRequest request1 = floor3.pressUpButton();

        // Submit request to controller
        controller.submitRequest(request1);


        // ==================================
        // SCENARIO 2: Passenger on Floor 8
        // ==================================

        Floor floor8 = new Floor(8);

        // Passenger presses DOWN
        ElevatorRequest request2 = floor8.pressDownButton();

        // Submit request
        controller.submitRequest(request2);


        // ==================================
        // SCENARIO 3: Check elevator states
        // ==================================

        System.out.println("\n----- ELEVATOR STATES -----");

        for (Elevator elevator : controller.getElevators()) {

            System.out.println(
                    "Elevator ID: " + elevator.getElevatorId()
            );

            System.out.println(
                    "Current Floor: " + elevator.getCurrentFloor()
            );

            System.out.println(
                    "Direction: " + elevator.getDirection()
            );

            System.out.println(
                    "Status: " + elevator.getStatus()
            );

            System.out.println(
                    "Available: " + elevator.isAvailable()
            );

            System.out.println(
                    "Has Capacity: " + elevator.hasCapacity()
            );

            System.out.println("---------------------");
        }

    }
}