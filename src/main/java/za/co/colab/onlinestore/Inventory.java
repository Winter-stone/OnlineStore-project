package za.co.colab.onlinestore;

import java.util.ArrayList;
import java.util.List;

public class Inventory {

    private List<Item> items = new ArrayList<>();

    public List<Item> getItems(){
        return items;
    }

    public void addItem(Item item){
        items.add(item);
    }

}

