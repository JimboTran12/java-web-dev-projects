package org.launchcode;

import org.launchcode.Computer;

public class Main {
    public static void main(String[] args) {
        Computer com1 = new Computer("Xenia", 256, 799.99);
        System.out.println(com1);


        Laptop laptop = new Laptop("Lenovo", 512, 1299.00, 4);
        System.out.println(laptop);

        SmartPhone phone = new SmartPhone("iPhone 13", 64, 899.69, "iOS");
        System.out.println(phone);
    }
}
