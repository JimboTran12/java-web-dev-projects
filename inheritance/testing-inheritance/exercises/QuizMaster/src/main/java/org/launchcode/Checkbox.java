package org.launchcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Checkbox extends Question{
    private ArrayList<Integer> userAnswer;
    private final ArrayList<Integer> correctAnswer;
    private HashMap<Integer, String> options;

    public Checkbox(String aQuestion, ArrayList<String> options, ArrayList<Integer> correctAnswer) {
        super(aQuestion);
        int i = 1;
        this.options = new HashMap<>();
        for(String option : options) {
            this.options.put(i, option);
            i++;
        }
        this.correctAnswer = correctAnswer;
    }

    public void askQuestion() {
        System.out.println(question);
        for(Map.Entry<Integer, String> option : options.entrySet()) {
            System.out.println(option.getKey() + ": " + option.getValue());
        }
        Scanner input = new Scanner(System.in);
        int userInput = input.nextInt();
        while(userInput > 0) {
            userAnswer.add(userInput);
            userInput = input.nextInt();
        }
    }

    public boolean checkAnswer() {
       if (userAnswer.size() == correctAnswer.size()) {
           if (correctAnswer.containsAll(userAnswer)) {
               return true;
           }
       }
       return false;
    }
}
