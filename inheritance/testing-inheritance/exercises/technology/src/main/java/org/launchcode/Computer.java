package org.launchcode;

public class Computer extends AbstractEntity{
    private String name;
    private int memoryInGB;
    private double price;
    public Computer(String aName, int aMemory, double aPrice) {
        super();
        name = aName;
        memoryInGB = aMemory;
        price = aPrice;
    }
    public Computer() {
        this("none",-1, -1.0);
    }
    @Override
    public String toString() {
        return String.format("This is a computer %s that has a memory of %d GB and costs $%.2f. ID: %d\n", name, memoryInGB, price, getID());
    }

    public boolean isExpensive() {
        return price >= 1000;
    }



    public Double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMemoryInGB() {
        return memoryInGB;
    }

    public void setMemoryInGB(int memoryInGB) {
        this.memoryInGB = memoryInGB;
    }
}
