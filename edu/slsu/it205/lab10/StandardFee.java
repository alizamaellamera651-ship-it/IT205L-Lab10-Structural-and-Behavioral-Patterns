package edu.slsu.it205.lab10;

// Concrete Strategy
public class StandardFee implements FeeStrategy {

    @Override
    public double calculateFee(double amount) {
        return amount * 0.05;
    }
}