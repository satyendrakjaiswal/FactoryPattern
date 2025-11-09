package com.coding;

public class CheckingAccount implements Account{
    double initialDeposit;

    public CheckingAccount(double initialDeposit) {
        this.initialDeposit = initialDeposit;
    }

    @Override
    public void openAccount(String customerId) {

    }
}