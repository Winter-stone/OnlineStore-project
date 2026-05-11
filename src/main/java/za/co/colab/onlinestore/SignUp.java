package za.co.colab.onlinestore;

import za.co.colab.onlinestore.customer.Customer;

import java.util.HashMap;
import java.util.Map;

public class SignUp {
    private Customer customer;
    private int customerId;
    private Map<Integer, Customer> customers = new HashMap<>();

    public void addCustomer(Customer customer){
        customerId = customers.size() + 1;
        if (customer != null){
            customers.put(++customerId, customer);
        }
        else{
            System.out.println("Not a valid customer");
        }
    }

    public Map<Integer, Customer> customers(){
        return customers;
    }

}
