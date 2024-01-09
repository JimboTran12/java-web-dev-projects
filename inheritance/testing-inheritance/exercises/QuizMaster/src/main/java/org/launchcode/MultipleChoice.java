package org.launchcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MultipleChoice extends Question{
    private int userAnswer;
    private final int correctAnswer;
    private  HashMap<Integer, String> options;

    public MultipleChoice(String aQuestion, ArrayList<String> options, int correctAnswer) {
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
        userAnswer = input.nextInt();
    }

    public boolean checkAnswer() {
        return userAnswer == correctAnswer;
    }

}
