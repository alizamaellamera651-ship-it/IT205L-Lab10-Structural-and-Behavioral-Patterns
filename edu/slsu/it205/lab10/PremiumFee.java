package edu.slsu.it205.lab10;

// Concrete Strategy
public class PremiumFee implements FeeStrategy {

    @Override
    public double calculateFee(double amount) {
        return amount * 0.10;
    }
}