package edu.slsu.it205.lab10;

// Concrete Observer
public class StudentObserver implements Observer {

    @Override
    public void update(String status) {
        System.out.println("[STUDENT NOTIFICATION] Status changed to: " + status);
    }
}