public class Account {
    private int accountNumber;
    private double balance = 0.0;

    public Account(int accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public boolean setBalance(double b) {
        if (b > 0) {
            balance = b;
            return true;
        } else {
            System.out.println("The price must be positive");
        }
        return false;
    }

    public void credit(double amount) {
        balance = balance + amount;
    }

    public void debit(double amount) {
        balance = balance - amount;
    }

    @Override
    public String toString() {
        return "{" + " accountNumber='" + getAccountNumber() + "'" + ", balance='" + getBalance() + "'" + "}";
    }

    // public String toString() {
    // return String.format("Account number is: " + "AN" + accountNumber + "AN" + ",
    // Balance is: $" + balance);
    // }

    public Account() {
        super();
    }
}