package com.startjava.lesson_2_3_4.guessnumber;

import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
    private Player[] players = new Player[3];
    private Player activePlayer;
    private int playerNum;
    private int secretNum;
    private Scanner console;
    private int gameNum;

    public GuessNumber(String name1, String name2, String name3) {
        this.players[0] = new Player(name1);
        this.players[1] = new Player(name2);
        this.players[2] = new Player(name3);
    }

    public void start() {
        Random random = new Random();
        secretNum = random.nextInt(100) + 1;
        System.out.println("У каждого игрока по 10 попыток отгадать число");
        console = new Scanner(System.in);

        if (playerNum > 0) {    //при повторной игре сброс ранее названных чисел
            initPlayers();
        }
        activePlayer = players[random.nextInt(3)];
        playGame();
    }

    private void playGame() {
        while (secretNum != playerNum && activePlayer.getNumberAttempt() < 10) {
            activePlayer.setNumberAttempt(activePlayer.getNumberAttempt() + 1);
            System.out.println("Игрок " + activePlayer.getName() + " угадывает число:");
            playerNum = console.nextInt();
            console.nextLine();
            activePlayer.setEnteredNumbers(activePlayer.getNumberAttempt() - 1, playerNum);

            if (playerNum < secretNum) {
                System.out.println("Данное число меньше того, что загадал компьютер");
            } else if (playerNum > secretNum) {
               System.out.println("Данное число больше того, что загадал компьютер");
            }

            if (activePlayer.getNumberAttempt() >= 10) {
                System.out.println("у " + activePlayer.getName() + " закончились попытки");
                activePlayer = changePlayer();
                continue;
            }

            if (playerNum != secretNum) {
                activePlayer = changePlayer();
            }
        }
        if (secretNum == playerNum) {
            System.out.println("Игрок " + activePlayer.getName() + " угадал число " + playerNum + " с " + activePlayer.getNumberAttempt() + " попытки");
            activePlayer.setScore(activePlayer.getScore() + 1);
        }
        printNumbers();
        gameNum++;

        if (gameNum == 3) {
            System.out.println("\nПо результатам серии из трех игр " + whoWin());
            clearScores();
        }
    }

    private void initPlayers() {
        for (int i = 0; i < players.length; i++) {
            players[i].fillEnteredNumbers(0, players[i].getNumberAttempt());
            players[i].setNumberAttempt(0);
        }
    }

    private Player changePlayer() {
        if (activePlayer == players[2]) {
            return players[0];
        } else if (activePlayer == players[0]) {
            return players[1];
        } else {
            return players[2];
        }
    }

    private void printNumbers() {
        for (int i = 0; i < players.length; i++) { //перечмсление названных чисел
            System.out.print("\nИгрок " + players[i].getName() + " назвал следующие числа:");
            for (int number: players[i].getEnteredNumbers(players[i].getNumberAttempt())
            ) {
                System.out.print(number + " ");
            }
            System.out.println("\nКоличество очков игрока " + players[i].getName() + " равно " + players[i].getScore());
        }
    }

    private String whoWin() {
        int index = 0;
        int counter = 0;

        for (int i = 0; i < players.length; i++) {
            if (players[index].getScore() == players[i].getScore()) {
                counter++;
            }
        }

        if (counter > 2) {
            return "единоличный победитель не выявлен";
        } else {
            for (int i = 0; i < players.length; i++) {
                if (players[index].getScore() < players[i].getScore()) {
                    index = i;
                }
            }
            return "победил игрок " + players[index].getName();
        }
    }

    private void clearScores() {
        gameNum = 0;
        for (int i = 0; i < players.length; i++) {
            players[i].setScore(0);
        }
    }
}