package Factory;

import java.util.regex.Pattern;

//Factory Method Pattern — Summary
//- Purpose: Creates objects without making the client directly depend on their concrete classes.
//        - Interface: Define a common interface, e.g., Payment.
//- Concrete classes: Implement the interface, e.g., UPIPayment, CardPayment.
//- Abstract Creator: Declares createPayment() and can contain common business logic.
//        - Concrete Creators: Override createPayment() to create specific objects, e.g., UPIPaymentCreator.
//- OCP: Add new payment types by introducing new classes rather than modifying existing creator classes.

interface Payment {
    void pay(double amount);
}
