package org.launchcode;

import java.util.ArrayList;
import java.util.Arrays;

public class QuizRunner {
    public static void main(String[] args) {
        String q1 = "Is 1+1 = 2 true?";
        String q2 = "Is 1+1 = 3 true?";
        String q3 = "Is 1+1 =  2 + 0 true?";

        String q4 = "what is 1+1 ?";
        String q5 = "what is 2+1";
        String q6 = "what is 3+1";
        ArrayList<String> options = new ArrayList<>(Arrays.asList("1","2","3","4"));

        TrueFalse quiz1 = new TrueFalse(q1, true);
        TrueFalse quiz2 = new TrueFalse(q2, false);
        TrueFalse quiz3 = new TrueFalse(q3, true);
        MultipleChoice quiz4 = new MultipleChoice(q4, options, 2);
        Checkbox test;
        String question = "What is smaller than 4?";
        ArrayList<Integer> rightAnswer = new ArrayList<>(Arrays.asList(1,2,3));
        Checkbox checkboxQ = new Checkbox(question, options,rightAnswer);
        checkboxQ.askQuestion();





    }
}
