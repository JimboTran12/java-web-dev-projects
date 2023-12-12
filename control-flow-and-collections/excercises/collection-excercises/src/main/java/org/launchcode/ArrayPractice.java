package org.launchcode;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.Scanner;
public class ArrayPractice {
    public static void main(String[] args) {
        int[] array_demo = {1,1,2,3,5,8};
        for (int val : array_demo) {
            if (val % 2 == 1) {
                System.out.println(val);
            }
        }
        String phrase = "I would not, could not, in a box. I would not, could not with a fox. I will not eat them in a house. I will not eat them with a mouse.";
        String[] stringArray = phrase.split(" ");
        System.out.println(Arrays.toString(stringArray));
        String[] stringArray2 = phrase.split(", ");
        System.out.println(Arrays.toString(stringArray2));
        String[] stringArray3 = phrase.split("\\. ");
        System.out.println(Arrays.toString(stringArray3));
        ArrayList<Integer> array = new ArrayList<>();
        for (int i = 0; i < 11; i++) {
            array.add(i);
            System.out.println(array.get(i));
        }

        System.out.println(ArrayListPractice.findSum(array));
        ArrayList<String> strArray = new ArrayList<String>(
                Arrays.asList(phrase.split(" "))
        );
//        for (String word : stringArray) {
//            strArray.add(word);
//        }

        ArrayListPractice.print(strArray, 5);
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a word length: ");
        int length = input.nextInt();
        ArrayListPractice.print(strArray, length);


    }
}
