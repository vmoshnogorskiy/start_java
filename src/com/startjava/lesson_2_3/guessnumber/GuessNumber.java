package com.startjava.lesson_2_3.guessnumber;

import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
    private Player player1;
    private Player player2;
    private Player activePlayer;

    public GuessNumber(String name1, String name2) {
        this.player1 = new Player(name1);
        this.player2 = new Player(name2);
    }

    public void start() {
        int playerNum = 0;
        Random random = new Random();
        int secretNum = random.nextInt(100) + 1; //(0 : 100] = [1 : 100]
        System.out.println("Число загадано!");
        Scanner console = new Scanner(System.in);

        if (random.nextInt(2) == 2) {
            activePlayer = player2;
        } else {
            activePlayer = player1;
        }

        while (secretNum != playerNum) {
            System.out.println("Игрок " + activePlayer.getName() + " угадывает число:");
            playerNum = console.nextInt();
            console.nextLine();

            if (playerNum < secretNum) {
                System.out.println("Данное число меньше того, что загадал компьютер");
            } else if (playerNum > secretNum) {
               System.out.println("Данное число больше того, что загадал компьютер");
            }
            activePlayer = changePlayer();
        }
        System.out.println("Победил игрок " + activePlayer.getName() + "! Загаданное число: " + playerNum);
    }

    private Player changePlayer() {
        return activePlayer == player1 ? player2 : player1;
    }
}