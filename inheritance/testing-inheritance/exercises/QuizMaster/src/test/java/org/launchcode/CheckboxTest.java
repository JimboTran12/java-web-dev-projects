package org.launchcode;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

public class CheckboxTest {
    Checkbox test;
    String question = "What is smaller than 4?";
    ArrayList<String> options = new ArrayList<>(Arrays.asList("1","2","3","4"));
    ArrayList<Integer> rightAnswer = new ArrayList<>(Arrays.asList(1,2,3));

    @BeforeEach
    public void createCheckbox() {
        test = new Checkbox(question, options, rightAnswer);
    }
    @Test
    public void checkAnswerCorrect() {

    }

}
