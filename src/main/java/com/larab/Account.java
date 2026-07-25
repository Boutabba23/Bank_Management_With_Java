public abstract class Account {
    private int accountNumber;
    private double balance;
    private Person owner;

    public Account(int accountNumber, double balance, Person owner) {
        if (accountNumber < 0) {
            throw new IllegalArgumentException("Account Number can not be negative");
        }
        if (balance < 0) {
            throw new IllegalArgumentException("Balance can not be negative");
        }
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.owner = owner;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void deposit(double amount) {
        if (amount < 0) {
            throw new IllegalArgumentException("Deposit can not be negative");
        }
        balance += amount;
    }

    public abstract void withDraw(double amount);

    public double getBalance() {
        return balance;
    }

    protected void increaseBalance(double amount) {
        balance += amount;
    }

    protected void decreaseBalance(double amount) {
        balance -= amount;
    }


    @Override
    public String toString() {
        return "Account {Account Number : " + accountNumber + ", Balance : " + balance + ", Owner : " + owner + "}";
    }

}
