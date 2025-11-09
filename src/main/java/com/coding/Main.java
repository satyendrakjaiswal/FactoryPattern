package com.coding;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        AccountFactory accountFactory = new AccountFactory();
        AccountOpeningService accountOpeningService = new AccountOpeningService(accountFactory);

        accountOpeningService.openNewAccount("Cust1","Savings",5000);
        accountOpeningService.openNewAccount("Cust2","Checking",10000);
        accountOpeningService.openNewAccount("Cust3","Investment",50000);
    }
}