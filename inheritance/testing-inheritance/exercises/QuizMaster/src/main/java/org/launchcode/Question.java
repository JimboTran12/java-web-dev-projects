package org.launchcode;

public abstract class Question {
    protected String question;
    public Question(){
        question = "No question";
    }
    public Question(String question){
        this();
        this.question = question;
    }


    public abstract void askQuestion();
    public abstract boolean checkAnswer();

}
