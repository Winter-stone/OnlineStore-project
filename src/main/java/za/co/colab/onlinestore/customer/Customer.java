package za.co.colab.onlinestore.customer;

public class Customer {
    private final String name;
    private final int customerId;

    public Customer(String name, int customerId) {
        this.name = name;
        this.customerId = customerId;
    }

    public String name() { return name; }
    public int customerId() { return customerId; }
}