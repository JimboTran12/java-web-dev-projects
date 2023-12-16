package org.launchcode;

import java.util.ArrayList;
import java.util.Date;

public class Menu {

    private ArrayList<MenuItem> items;

    public static Date update;

    public Menu( ArrayList<MenuItem> items) {

        this.items = items;
        update = new Date();
    }

    public Menu() {
        update = new Date();
    }

    public ArrayList<MenuItem> getItems() {
        return items;
    }
    public void setItems(ArrayList<MenuItem> items) {
        this.items = items;
    }
    public void addItem (MenuItem item) {
        if (items.contains(item)) {
            System.out.println("Item already existed");
        }
        else {
            for (MenuItem aItem : items) {
                aItem.setNew(false);
            }
            items.add(item);
            System.out.println("The following item is added: " + item);
            update = new Date();
        }
    }

    public void addItem (String name,String category, Double price)  {

        MenuItem item = new MenuItem(name, category, price);
        addItem(item);
    }

    public void removeItem(String dishName) {
        int size = items.size();
        for (int i = 0; i < items.size(); i++) {
            if (items.get(i).getName().trim().equalsIgnoreCase(dishName.trim())) {
                items.remove(i);
                i--;
            }
        }
        if (size != items.size()) {
            System.out.println("Menu item " + dishName + " removed.");
            update = new Date();
        }
        else {
            System.out.println("No menu item with the name \"" + dishName + "\" found.");
        }

    }
    @Override
    public String toString() {
        String string = "This is our super cool menu dishes:\n";
        for (MenuItem item : items) {
            string += item;
        }
        string += "Last updated: " + update;
        return string;
    }


}
