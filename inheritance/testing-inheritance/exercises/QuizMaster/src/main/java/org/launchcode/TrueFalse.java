package org.launchcode;

import java.util.Scanner;

public class TrueFalse extends Question {
    private boolean userAnswer;
    private final boolean correctAnswer;

    public TrueFalse(String question, boolean correctAnswer){
        super(question);
        this.correctAnswer = correctAnswer;
    }


    public void askQuestion() {
        System.out.printf("%s (1 for true, 0 for false)\n", question);
        Scanner input = new Scanner(System.in);
        int inputInt = input.nextInt();
        userAnswer = (inputInt != 0);

    }

    public boolean checkAnswer() {
        return userAnswer && correctAnswer;
    }


}
