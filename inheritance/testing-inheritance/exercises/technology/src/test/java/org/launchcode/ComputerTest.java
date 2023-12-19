package org.launchcode;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ComputerTest {
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
        assertEquals(computer.getName(),"Xenia");
        assertEquals(computer.getMemoryInGB(),256);
        assertEquals(computer.getPrice(),799.99, 0.001);
    }

    @Test
    public void correctToString() {
        assertTrue(computer.toString().contains("This is a computer Xenia that has a memory of 256 GB and costs $799.99."));
    }


    @Test
    public void correctIsExpensive() {
        assertFalse(computer.isExpensive());
    }



}
