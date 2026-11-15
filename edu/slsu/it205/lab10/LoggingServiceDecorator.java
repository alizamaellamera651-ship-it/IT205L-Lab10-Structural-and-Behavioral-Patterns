package edu.slsu.it205.lab10;

// Concrete Decorator
public class LoggingServiceDecorator implements Service {

    private Service service;

    public LoggingServiceDecorator(Service service) {
        this.service = service;
    }

    @Override
    public void execute(String id) {
        System.out.println("[LOG] Starting service for ID: " + id);

        service.execute(id);

        System.out.println("[LOG] Service completed for ID: " + id);
    }
}