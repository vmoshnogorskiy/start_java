package com.startjava.lesson_2_3_4.guessnumber;

import java.util.Arrays;

public class Player {
    
    private String name;
    private  int[] enteredNumbers;
    private int numberAttempt = 0;
    private static int counter = 0;
    private int score;

    public Player(String name) {
        if (name != null && !name.equals("")) {
            this.name = name;
        } else {
            counter++;
            name = "Player_" + counter;
        }
        enteredNumbers = new int[10];
    }

    public int getNumberAttempt() {
        return numberAttempt;
    }

    public void setNumberAttempt(int numberAttempt) {
        this.numberAttempt = numberAttempt;
    }

    public String getName() {
        return name;
    }

    public int[] getEnteredNumbers() {
        return Arrays.copyOf(enteredNumbers, numberAttempt);
    }

    public void setEnteredNumber(int number) {
        numberAttempt++;
        if (number > 0 && number <= 100) {
            enteredNumbers[numberAttempt - 1] = number;
        }
    }

    public void setScore(int score) {
        this.score = score;
    }

    public int getScore() {
        return score;
    }

    public void clearEnteredNumbers() {
        Arrays.fill(enteredNumbers, 0, numberAttempt, 0);
    }
}