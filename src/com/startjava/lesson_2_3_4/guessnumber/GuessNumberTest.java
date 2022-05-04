package com.startjava.lesson_2_3_4.guessnumber;

import java.util.Scanner;

public class GuessNumberTest {

    private static Scanner console;

    public static void main(String[] args) {
        String option = "";
        GuessNumber guessNumber = new GuessNumber(createPlayers());
        do {
            guessNumber.start();
            do {
                System.out.println("\nХотите продолжить игру? [yes/no]:");
                option = console.nextLine();
            } while (!"no".equalsIgnoreCase(option) && !"yes".equalsIgnoreCase(option));
        } while ("yes".equalsIgnoreCase(option));
    }

    private static String[] createPlayers() {
        String[] playersNames = new String[3];
        console = new Scanner(System.in);
        for (int i = 0; i < playersNames.length; i++) {
            System.out.println("Введите имя " + (i + 1) + " игрока: ");
            playersNames[i] = console.nextLine();
        }
        return playersNames;
    }
}