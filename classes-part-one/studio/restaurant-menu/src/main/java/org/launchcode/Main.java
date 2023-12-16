package org.launchcode;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
	// write your code here
        MenuItem item1 = new MenuItem("Fish", "main course", 15.99);
        MenuItem item2 = new MenuItem("Fries", "appetizer", 5.49);
        MenuItem item3 = new MenuItem("Gyatt Cake", "dessert", 6.99);
        MenuItem item4 = new MenuItem("Spanish gum", "appetizer", 1.49);
        MenuItem item5 = new MenuItem("Chicken feet", "main course", 11.99);
        MenuItem item6 = new MenuItem("chicken feet", "main course", 11.99);

        ArrayList<MenuItem> mainMenuList = new ArrayList<>();
        mainMenuList.add(item1);
        mainMenuList.add(item2);
        mainMenuList.add(item3);
        mainMenuList.add(item4);
        Menu mainMenu = new Menu(mainMenuList);

        mainMenu.addItem(item5);

        mainMenu.addItem(item6);
        System.out.println(mainMenu);
        mainMenu.removeItem("chicken feet");
        System.out.println(mainMenu);


    }
}
