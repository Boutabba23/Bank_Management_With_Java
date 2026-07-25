package com.larab;

import java.util.ArrayList;

public class Bank {
    private ArrayList<Account> accounts;

    public Bank() {
        accounts = new ArrayList<>();
    }

    public void addAccounts(Account account) {
        if (account == null) {
            throw new IllegalArgumentException("com.larab.Account can not be null!");
        }
        accounts.add(account);
    }

    public void showAllAccounts() {
        for (Account account : accounts) {
            System.out.println(account);
        }
    }

    public Account findAccount(int accountNumber) {
        for (Account account : accounts) {
            if (account.getAccountNumber() == accountNumber) {
                return account;
            }
        }
        return null;
    }

}
