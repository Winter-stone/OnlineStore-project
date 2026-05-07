package za.co.colab.onlinestore;

import za.co.colab.onlinestore.customer.Customer;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class OnlineStore {

    private Map<Integer, Customer> customers = new HashMap<>();
    private List<Inventory> products = new ArrayList<>();
    private int customerId;



    public OnlineStore(Customer customer) {
        addCustomer(customer);
        customerId = 0;
    }

    public Customer getCustomer(int customerId){
        return customers.get(customerId);
    }

    public List<Inventory> invntory(){
        return products;
    }

    public void addCustomer(Customer customer){
        if (customer != null){
            customers.put(++customerId, customer);
        }
        else{
            System.out.println("Not a valid customer");
        }
    }

}
