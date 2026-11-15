# Laboratory Activity 10: Structural and Behavioral Patterns

**Course:** IT 205 – Object-Oriented Programming  
**Package:** `edu.slsu.it205.lab10`  
**Language:** Java  
**JDK Version:** 17

## Project Description

This laboratory activity demonstrates four important object-oriented design patterns: Adapter, Decorator, Strategy, and Observer.

Each pattern solves a different software design problem and helps make applications more flexible, reusable, and maintainable.

## Design Patterns Implemented

### 1. Adapter Pattern
Connects the `LegacyJsonFeed` class to the `ModernDataSource` interface through `JsonFeedAdapter`.

### 2. Decorator Pattern
Adds logging functionality to `CoreService` using `LoggingServiceDecorator` without modifying the original service.

### 3. Strategy Pattern
Provides interchangeable fee calculation algorithms through `StandardFee` and `PremiumFee`. The `FeeContext` can switch strategies at runtime.

### 4. Observer Pattern
Allows `StudentObserver` and `AdminObserver` to receive notifications whenever `StatusSubject` changes its status.

## Project Structure

```text
Lab10Patterns/
│
├── edu/
│   └── slsu/
│       └── it205/
│           └── lab10/
│               ├── Main.java
│               │
│               ├── ModernDataSource.java
│               ├── LegacyJsonFeed.java
│               ├── JsonFeedAdapter.java
│               │
│               ├── Service.java
│               ├── CoreService.java
│               ├── LoggingServiceDecorator.java
│               │
│               ├── FeeStrategy.java
│               ├── StandardFee.java
│               ├── PremiumFee.java
│               ├── FeeContext.java
│               │
│               ├── Observer.java
│               ├── StudentObserver.java
│               ├── AdminObserver.java
│               └── StatusSubject.java
│
├── screenshots/
│
├── PATTERN_NOTES.md
├── POSTLAB.md
└── README.md
```

## How to Compile and Run

Open Git Bash inside the project folder.

### Step 1: Compile

```bash
javac edu/slsu/it205/lab10/*.java
```

### Step 2: Run

```bash
java edu.slsu.it205.lab10.Main
```

## Testing Results

All four design patterns were successfully compiled and executed.

- Adapter successfully retrieved data from the legacy class.
- Decorator successfully displayed logging messages before and after execution.
- Strategy successfully switched between Standard and Premium fee calculations.
- Observer successfully notified both student and administrator observers when the status changed.

## Documentation

- `PATTERN_NOTES.md` – Explanation and discussion of the four patterns.
- `POSTLAB.md` – Answers to the five post-laboratory questions.
- `screenshots/` – Screenshots of the source code and program output.

## References

Freeman, E., & Robson, E. (2021). *Head First Design Patterns* (2nd ed.). O'Reilly Media.

Schildt, H., & Coward, D. (2024). *Java: The Complete Reference* (13th ed.). McGraw-Hill Education.

Oracle. (2025). *The Java Tutorials*. https://docs.oracle.com/javase/tutorial/

---

**Laboratory Activity 10 – Structural and Behavioral Patterns**  
**Status: Completed**