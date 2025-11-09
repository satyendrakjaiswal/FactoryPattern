package com.coding;

public class InvestmentAccount implements Account{

    private final double initialDeposit;
    private final String profile;

    public InvestmentAccount(double initialDeposit, String profile) {
        this.initialDeposit = initialDeposit;
        this.profile = profile;
    }

    @Override
    public void openAccount(String customerId) {

    }

    public double getInitialDeposit() {
        return initialDeposit;
    }

    public String getProfile() {
        return profile;
    }
}
