package org.launchcode;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class LaptopTest {
    Computer computer;
    Laptop laptop;
    SmartPhone phone;
    @BeforeEach
    public void createObject() {
        computer = new Computer("Xenia", 256, 799.99);
        laptop = new Laptop("Lenovo", 512, 1299.00, 4);
        phone = new SmartPhone("iPhone 13", 64, 899.69, "iOS");
    }

    @Test
    public void correctConstructor() {
        assertEquals(laptop.getName(),"Lenovo");
        assertEquals(laptop.getMemoryInGB(),512);
        assertEquals(laptop.getPrice(),1299.0, 0.001);
    }

    @Test
    public void correctToString() {
        assertTrue(laptop.toString().contains("This is a Lenovo laptop that has a memory of 512 GB and costs $1299.00."));
    }

    @Test
    public void correctIsExpensive() {
        assertTrue(laptop.isExpensive());
    }



}
