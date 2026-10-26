package Singleton;

// Singleton
/* - What is Singleton? A design pattern that ensures a class has only one instance and provides a common way to access it.
- When do we use it? When different parts of an application need to share the same object, such as application configuration.
- Private constructor: Prevents other classes from creating objects using new.
- Static instance: Stores the single shared object at the class level.
- getInstance() method: Provides access to the same object whenever someone requests it.
- Eager Singleton: Creates the instance when the class is initialized, even if it isn't immediately needed.
- Lazy Singleton: Creates the instance only when it is requested for the first time.
- Thread safety: Important when multiple threads might request the instance simultaneously. Without proper protection, they might create multiple objects.
- Synchronized Singleton: Uses synchronized so only one thread at a time can execute the creation logic.
- Double-Checked Locking: Checks whether the instance is null twice and uses synchronized and volatile to handle concurrent access efficiently.

  */
public class PaymentConfig {

    // 1. One instance, created when the class loads
    private static final PaymentConfig INSTANCE =
            new PaymentConfig();

    // 2. Prevent external object creation
    private PaymentConfig() {
    }

    // 3. Provide access to the shared instance
    public static PaymentConfig getInstance() {
        return INSTANCE;
    }

    public String getCurrency() {
        return "INR";
    }

    public int getPaymentTimeout() {
        return 30;
    }
}
