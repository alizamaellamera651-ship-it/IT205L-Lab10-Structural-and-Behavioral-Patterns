package edu.slsu.it205.lab10;

// Concrete Observer
public class AdminObserver implements Observer {

    @Override
    public void update(String status) {
        System.out.println("[ADMIN NOTIFICATION] System status is now: " + status);
    }
}