package com.larab;

public class SavingsAccount extends Account {
    private double interestRate;

    public SavingsAccount(int accountNumber, double balance, Person owner, double interestRate) {
        super(accountNumber, balance, owner);
        this.interestRate = interestRate;
    }

    @Override
    public void deposit(double amount) {
        super.deposit(amount * 1.01);
    }


    @Override
    public void withDraw(double amount) {
        if (getBalance() - amount < 0) {
            throw new IllegalArgumentException("Insufficient funds");
        }

        decreaseBalance(amount);
    }


}
