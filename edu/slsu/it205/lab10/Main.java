package edu.slsu.it205.lab10;

public class Main {

    public static void main(String[] args) {

        // =================================
        // 1. ADAPTER PATTERN
        // =================================
        System.out.println("========== ADAPTER PATTERN ==========");

        LegacyJsonFeed legacyFeed = new LegacyJsonFeed();

        ModernDataSource dataSource =
                new JsonFeedAdapter(legacyFeed);

        System.out.println("Fetched Data: " + dataSource.fetch());


        // =================================
        // 2. DECORATOR PATTERN
        // =================================
        System.out.println("\n========== DECORATOR PATTERN ==========");

        Service coreService = new CoreService();

        Service loggingService =
                new LoggingServiceDecorator(coreService);

        loggingService.execute("STU-001");


        // =================================
        // 3. STRATEGY PATTERN
        // =================================
        System.out.println("\n========== STRATEGY PATTERN ==========");

        FeeContext feeContext = new FeeContext(new StandardFee());

        double amount = 1000.00;

        System.out.println("Original Amount: " + amount);
        System.out.println("Standard Fee: " +
                feeContext.calculate(amount));

        // Switch strategy at runtime
        feeContext.setStrategy(new PremiumFee());

        System.out.println("Premium Fee: " +
                feeContext.calculate(amount));


        // =================================
        // 4. OBSERVER PATTERN
        // =================================
        System.out.println("\n========== OBSERVER PATTERN ==========");

        StatusSubject subject = new StatusSubject();

        Observer student = new StudentObserver();
        Observer admin = new AdminObserver();

        subject.registerObserver(student);
        subject.registerObserver(admin);

        subject.setStatus("System is Online");

        System.out.println();

        subject.setStatus("System Maintenance");

    }
}