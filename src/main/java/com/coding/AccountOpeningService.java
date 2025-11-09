package com.coding;

public class AccountOpeningService {

    private final AccountFactory accountFactory;

    AccountOpeningService(AccountFactory accountFactory){
        this.accountFactory = accountFactory;
    }

    // A method for opening a new account for a customer
    public void openNewAccount(String customerId, String accountType, double initialDeposit) {

        Account newAccount = accountFactory.createAccount(accountType,initialDeposit);
        // Business logic
        System.out.println("Setting up new account...");
        newAccount.openAccount(customerId);
        System.out.println(accountType + " Account setup complete for customer " + customerId);
    }
}
