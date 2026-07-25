package com.larab;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Person person1 = new Person("Mohamed", 40);
        Person person2 = new Person("Joda", 31);

        Account account1 = new Account(111, 50000, person1) {
            @Override
            public void withDraw(double amount) {

            }
        };
        Account account2 = new Account(222, 40000, person2) {
            @Override
            public void withDraw(double amount) {

            }
        };

        Bank bank = new Bank();
        bank.addAccounts(account1);
        bank.addAccounts(account2);

        account1.deposit(500);
        account2.deposit(400);

        account1.withDraw(650);
        account2.withDraw(350);

        bank.showAllAccounts();
    }
}