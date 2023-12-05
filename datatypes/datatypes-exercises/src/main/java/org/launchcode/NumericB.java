package org.launchcode;
import java.util.Scanner;
public class NumericB {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number of miles driven: ");
        double distance = input.nextDouble();
        System.out.println("Enter amount of gas consumed: ");
        double gas = input.nextDouble();
        double mpg = distance / gas;
        System.out.println("MPG is " + mpg);


    }
}