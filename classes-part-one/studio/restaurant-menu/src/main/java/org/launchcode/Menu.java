package org.launchcode;

import java.util.ArrayList;
import java.util.Date;

public class Menu {
    private ArrayList<MenuItem> items;
    private Date menuDate;

    public Menu(ArrayList<MenuItem> items, Date menuDate) {
        this.items = items;
        this.menuDate = menuDate;
    }

    public Date getMenuDate() {
        return menuDate;
    }

    public ArrayList<MenuItem> getItems() {
        return items;
    }

    public void setMenuDate(Date menuDate) {
        this.menuDate = menuDate;
    }

    public void setItems(ArrayList<MenuItem> items) {
        this.items = items;
    }
}
