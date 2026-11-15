# Laboratory Activity 10: Structural and Behavioral Patterns
## Post-Lab Questions and Answers

### 1. How does Adapter differ from Decorator?

Adapter changes the interface of an existing class so it can work with another interface expected by the client. Decorator keeps the same interface but adds extra functionality to an existing object. Adapter focuses on compatibility, while Decorator focuses on extending behavior.

### 2. Why can Decorator reduce subclass explosion?

Decorator reduces subclass explosion because we can add different features by wrapping objects instead of creating many subclasses for every possible combination of features. This makes the program more flexible and easier to maintain.

### 3. Give a Strategy example from your campus domain.

A campus system can use the Strategy Pattern for calculating student fees. For example, regular students and students with special discounts may follow different fee calculation rules. The system can switch between these strategies without changing the main fee calculator.

### 4. What happens in Observer if you forget to unregister listeners?

If observers are not unregistered when they are no longer needed, they may continue receiving notifications. This can cause unnecessary processing and may lead to memory leaks because the subject still holds references to those observers.

### 5. Which pattern will you apply in the Final Project and where in the code?

I will apply the Observer Pattern in the Computer Laboratory Equipment Borrowing System (CLEBS), particularly in the borrowing transaction module. It can notify students and administrators whenever a borrowing request changes status, such as Pending, Approved, or Returned. This makes communication more organized and reduces the need to manually check for updates.