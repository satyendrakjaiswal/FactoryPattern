package com.coding;

public class SavingsAccount implements Account{

    private final double initialDeposit;
    private final double interestRate;

    public SavingsAccount(double initialDeposit, double interest_rate) {
        this.initialDeposit = initialDeposit;
        interestRate = interest_rate;
    }

    @Override
    public void openAccount(String customerId) {

    }

    public double getInitialDeposit() {
        return initialDeposit;
    }

    public double getInterestRate() {
        return interestRate;
    }
}
