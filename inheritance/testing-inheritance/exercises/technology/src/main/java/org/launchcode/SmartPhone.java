package org.launchcode;

import org.launchcode.Computer;

public class SmartPhone extends Computer {
    private final String phoneOS;
    public SmartPhone(String name, int memory, double price, String OS) {
        super(name, memory, price);
        phoneOS = OS;
    }

    @Override
    public String toString() {
        return String.format("This is a %s smartphone that has a memory of %d GB and costs $%.2f. This phone runs %s. ID: %d\n",getName(), getMemoryInGB(), getPrice(), phoneOS, getID());

    }

}
