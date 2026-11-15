# Laboratory Activity 10
## Structural and Behavioral Design Patterns

### 1. Adapter Pattern
The Adapter Pattern allows incompatible interfaces to work together.

In this project, LegacyJsonFeed uses the pull() method, while ModernDataSource requires fetch(). JsonFeedAdapter connects these two classes by implementing ModernDataSource and calling the legacy pull() method.

### 2. Decorator Pattern
The Decorator Pattern adds new functionality to an existing object without modifying its original class.

In this project, LoggingServiceDecorator wraps CoreService and adds logging messages before and after the service executes.

### 3. Strategy Pattern
The Strategy Pattern allows different algorithms or rules to be selected at runtime.

In this project, StandardFee calculates a 5% fee, while PremiumFee calculates a 10% fee. FeeContext can switch between these strategies without changing its own implementation.

### 4. Observer Pattern
The Observer Pattern allows multiple objects to receive notifications when another object's state changes.

In this project, StatusSubject maintains a list of observers. StudentObserver and AdminObserver receive notifications whenever the system status changes.

## Discussion

The Observer Pattern is suitable for notifications because it allows multiple objects to receive updates whenever an event occurs. In the Computer Laboratory Equipment Borrowing System (CLEBS), it could notify students and administrators when borrowing transaction statuses change.

The Strategy Pattern is suitable for interchangeable policies because it allows the system to switch between different rules without modifying the main context class. It could be used in CLEBS if different borrowing policies are required for different equipment categories or user types.

Both patterns improve flexibility and make the system easier to maintain.

## Conclusion

This laboratory demonstrated four important design patterns: Adapter, Decorator, Strategy, and Observer. Each pattern provides a different solution to common software design problems. Applying these patterns helps make programs more organized, flexible, and maintainable.