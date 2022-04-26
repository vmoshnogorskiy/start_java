package com.startjava.lesson_2_3_4.guessnumber;

import java.util.Arrays;

public class Player {
    
    private String name;
    private  int[] enteredNumbers;
    private int numberAttempt = 0;
    private static int counter = 0;
    private int score;

    public Player(String name) {
        if (name != null && name != "") {
            this.name = name;
        } else {
            counter++;
            this.name = "Player_" + counter;
        }
        this.enteredNumbers = new int[10];
    }

    public int getNumberAttempt() {
        return numberAttempt;
    }

    public void setNumberAttempt(int value) {
        this.numberAttempt = value;
    }

    public String getName() {
        return name;
    }

    public int[] getEnteredNumbers(int length) {
        int[] numbersCopy = Arrays.copyOf(this.enteredNumbers, length);
        return numbersCopy;
    }

    public void setEnteredNumbers(int index, int value) {
        if (value > 0 && value <= 100) {
            this.enteredNumbers[index] = value;
        }
    }

    public void setScore(int score) {
        this.score = score;
    }

    public int getScore() {
        return score;
    }

    public void fillEnteredNumbers(int fromIndex, int toIndex) {
        Arrays.fill(this.enteredNumbers, fromIndex, toIndex, 0);
    }
}