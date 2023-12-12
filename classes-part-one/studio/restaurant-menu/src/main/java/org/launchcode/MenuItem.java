package org.launchcode;


public class MenuItem {
    private String name = "";
    private String description = "";
    private String category = "";
    private double price = 0.0;
    private boolean isNew = false;

    public MenuItem(String name, String description, String category, double price , boolean isNew ) {
        this.name = name;
        this.description = description;
        this.category = category;
        this.price = price;
        this.isNew = isNew;
    }
    public MenuItem(String name, String description, String category) {
        this(name, description, category, 0.0, false);
    }
    public MenuItem(){}

    public boolean isNew() {
        return isNew;
    }

    public double getPrice() {
        return price;
    }

    public String getCategory() {
        return category;
    }

    public String getDescription() {
        return description;
    }

    public String getName() {
        return name;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setNew(boolean aNew) {
        isNew = aNew;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
