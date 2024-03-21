package app.builder;

import app.interfaces.Item;

import java.util.ArrayList;
import java.util.List;

public class OrderModel {
    List<Item> items = new ArrayList<>();

    public void addItem(Item item) {items.add(item);}

    public void showItems() {
        for (Item item : items) {
            System.out.println("Item: " + item.name());
            System.out.println("Manufacturer: " + item.manufacturer());
            System.out.println("Price: " + item.price() + " USD");
        }
    }

    public float getTotalCost() {
        float cost = 0.0f;

        for (Item item : items) {
            cost += item.price();
        }
        return cost;
    }
}
