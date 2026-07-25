package com.larab;

public class CheckingAccount extends Account {
    private double overdraftLimit;

    public CheckingAccount(int accountNumber, double balance, Person owner, double overdraftLimit) {
        super(accountNumber, balance, owner);
        this.overdraftLimit = overdraftLimit;
    }

    @Override
    public void withDraw(double amount) {

    }
}
