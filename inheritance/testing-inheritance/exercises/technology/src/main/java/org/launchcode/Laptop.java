package org.launchcode;

import org.launchcode.Computer;

public class Laptop extends Computer {
    private int numFans;
    public Laptop(String aName, int aMemory, Double aPrice, int aNumFans) {
        super(aName,aMemory,aPrice);
        numFans = aNumFans;
    }
    @Override
    public String toString() {
        return String.format("This is a %s laptop that has a memory of %d GB and costs $%.2f. This lap top has %d fans. ID: %d\n",getName(), getMemoryInGB(), getPrice(), numFans, getID());

    }
}
