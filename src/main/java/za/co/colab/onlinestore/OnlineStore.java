package za.co.colab.onlinestore;

import com.google.common.collect.HashBiMap;
import za.co.colab.onlinestore.customer.Customer;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class OnlineStore {

    private Inventory products = new Inventory();
    private SignUp signUp = new SignUp();
    private ShoppingCart cart;

    public OnlineStore(Customer customer){
        this.cart = new ShoppingCart();
    }

    public void addItem(String item){
        if (products.getItems().contains(item));
    }


    public Customer getCustomer(int customerId){
        return signUp.customers().get(customerId);
    }

    public List<Inventory> inventory(){
        return products;
    }


}
