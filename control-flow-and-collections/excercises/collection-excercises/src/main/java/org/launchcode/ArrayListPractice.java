package org.launchcode;
import java.util.ArrayList;
public class ArrayListPractice {
    public static int findSum(ArrayList<Integer> array) {
        int sum = 0;
        for (int val : array) {
            if (val % 2 == 0) {
                sum += val;
            }
        }
        return sum;
    }

    public static void print(ArrayList<String> array, int length) {
        for (String item : array) {
            if (item.length() == length) {
                System.out.println(item);
            }
        }
    }
}


