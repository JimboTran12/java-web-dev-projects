package org.launchcode;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SmartphoneTest {
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
        assertEquals(phone.getName(),"iPhone 13");
        assertEquals(phone.getMemoryInGB(),64);
        assertEquals(phone.getPrice(),899.69, 0.001);
    }

    @Test
    public void correctToString() {
        assertTrue(phone.toString().contains("This is a iPhone 13 smartphone that has a memory of 64 GB and costs $899.69."));
    }

    @Test
    public void correctIsExpensive() {
        assertFalse(phone.isExpensive());
    }



}
