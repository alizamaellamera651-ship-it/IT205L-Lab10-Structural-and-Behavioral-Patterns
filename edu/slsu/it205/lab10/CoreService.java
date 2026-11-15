package edu.slsu.it205.lab10;

// Concrete Component
public class CoreService implements Service {

    @Override
    public void execute(String id) {
        System.out.println("Processing service for ID: " + id);
    }
}