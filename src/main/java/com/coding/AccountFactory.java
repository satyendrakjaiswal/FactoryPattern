package com.coding;

public class AccountFactory {

    public Account createAccount(String accountType, double initialDeposit){
        Account newAccount;
        switch(accountType.toLowerCase()){
            case "checking":
                newAccount = new CheckingAccount(initialDeposit);
                break;
            case "savings":
                // Savings accounts get a 0.05% interest rate
                newAccount = new SavingsAccount(initialDeposit, 0.05);
                break;
            case "investment":
                // Investment accounts default to an "AGGRESSIVE" profile
                newAccount = new InvestmentAccount(initialDeposit, "AGGRESSIVE_GROWTH");
                break;
            default:
                throw new IllegalArgumentException("Invalid account type");
        }
        return newAccount;
    }
}
