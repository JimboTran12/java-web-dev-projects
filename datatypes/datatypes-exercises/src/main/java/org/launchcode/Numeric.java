package org.launchcode;
import java.util.Scanner;
public class Numeric {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter rectangle length: ");
        double length = input.nextDouble();
        System.out.println("Enter rectangle width: ");
        double width = input.nextDouble();
        double area = length * width;
        System.out.println("Rectangle area is " + area);


    }
}
