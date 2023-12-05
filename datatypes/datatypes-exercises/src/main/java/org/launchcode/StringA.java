package org.launchcode;
import java.util.Scanner;
public class StringA {
    public static void main(String[] args) {
        String story = "Alice was beginning to get very" +
                " tired of sitting by her sister on the bank," +
                " and of having nothing to do: once or twice she" +
                " had peeped into the book her sister was reading, " +
                "but it had no pictures or conversations in it, ‘and what" +
                " is the use of a book,’ thought Alice ‘without pictures or conversation?";
        Scanner input = new Scanner(System.in);
        System.out.println(story + "\n" +
                            "Enter word to find: ");
        String word = input.nextLine();
        boolean contains = story.contains(word);
        int index = story.indexOf(word);

        System.out.println("Story contains word: " + contains);
        System.out.println("index: " + index);
        System.out.println("length: " + word.length());
        String newStory = story.substring(0, index - 1) + story.substring(index + word.length(), story.length() -1);
        System.out.println(newStory);


    }
}
