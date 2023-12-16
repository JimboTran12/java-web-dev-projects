package org.launchcode;


import java.util.Objects;

public class MenuItem {
    private String name;

    private String category;
    private double price;
    private boolean isNew;

    public MenuItem(String name, String category, double price ) {
        this.name = name;

        this.category = category;
        this.price = price;
        this.isNew = true;
    }
    public MenuItem(){
        this("","",0.0);
    }

    public void itemPrint() {
        System.out.println("\n*******\nDish: " + name +
                "\nCategory: " + category +
                "\n Price: " + price + "\n*******"
        );

    }


    public boolean isNew() {
        return isNew;
    }

    public double getPrice() {
        return price;
    }

    public String getCategory() {
        return category;
    }



    public String getName() {
        return name;
    }

    public void setCategory(String category) {
        this.category = category;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MenuItem menuItem = (MenuItem) o;
        return Double.compare(price, menuItem.price) == 0 && isNew == menuItem.isNew && Objects.equals(name.toLowerCase(), menuItem.name.toLowerCase()) && Objects.equals(category.toLowerCase(), menuItem.category.toLowerCase());
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, category, price, isNew);
    }

    @Override
    public String toString() {
        if (isNew) {
            return "\n***NEW****\nDish: " + name +
                    "\nCategory: " + category +
                    "\nPrice: " + price + "\n*******\n";
        }
        else {
            return "\n*******\nDish: " + name +
                    "\nCategory: " + category +
                    "\nPrice: " + price + "\n*******\n";
        }
    }
}
