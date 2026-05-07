package za.co.colab.onlinestore.customer;

public class Account {
    private final Customer user;
    private int amount;

    public Account(Customer user, int amount) {
        this.user = user;
        this.amount = amount;
    }

    public int amount() { return amount; }

    public Customer user() { return user; }

    public void deposit(int amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException("Amount cannot be less than or equal to zero");
        }
        // if we integrate a payment api, we can send the money from the users registered account
        this.amount += amount;
    }

    public void withdraw(int amount) {
        if ((this.amount - amount) < 0) {
            throw new IllegalArgumentException("Withdrawal amount exceeds account balance");
        }
        // if we integrate a payment api, we can send the money back to the users registered account
        this.amount -= amount;
    }
}