package com.startjava.lesson_2_3_4.guessnumber;

import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
    private Player[] players = new Player[3];
    private Player activePlayer;
    private int secretNumber;
    private Scanner console;
    private int numberGames;

    public GuessNumber(String[] playersNames) {
        for (int i = 0; i < playersNames.length; i++) {
            this.players[i] = new Player(playersNames[i]);
        }
        console = new Scanner(System.in);
    }

    public void start() {
        initPlayers();
        Random random = new Random();
        secretNumber = random.nextInt(100) + 1;
        System.out.println("У каждого игрока по 10 попыток отгадать число");
        activePlayer = players[random.nextInt(3)];
        startGameplay();
    }

    private void startGameplay() {
        int playerNumber = 0;
        String result = "меньше";
        while (secretNumber != playerNumber && activePlayer.getNumberAttempt() < 10) {
            System.out.println("Игрок " + activePlayer.getName() + " угадывает число:");
            playerNumber = console.nextInt();
            console.nextLine();
            activePlayer.setEnteredNumber(playerNumber);

            result = playerNumber < secretNumber ? "меньше" : "больше";
            System.out.println("Данное число " +  result + " того, что загадал компьютер");

            if (activePlayer.getNumberAttempt() >= 10) {
                System.out.println("у " + activePlayer.getName() + " закончились попытки");
                activePlayer = changePlayer();
                continue;
            }

            if (playerNumber != secretNumber) {
                activePlayer = changePlayer();
            }
        }
        if (secretNumber == playerNumber) {
            System.out.println("Игрок " + activePlayer.getName() + " угадал число " + playerNumber + " с "
                    + activePlayer.getNumberAttempt() + " попытки");
            activePlayer.setScore(activePlayer.getScore() + 1);
        }
        printNumbers();
        numberGames++;

        if (numberGames == 3) {
            System.out.println("\nПо результатам серии из трех игр " + determineWinner());
            clearScores();
        }
    }

    private void initPlayers() {
        for (int i = 0; i < players.length; i++) {
            players[i].clearEnteredNumbers();
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
        for (int i = 0; i < players.length; i++) { //перечисление названных чисел
            System.out.print("\nИгрок " + players[i].getName() + " назвал следующие числа:");
            for (int number: players[i].getEnteredNumbers()) {
                System.out.print(number + " ");
            }
            System.out.println("\nКоличество очков игрока " + players[i].getName() + " равно " + players[i].getScore());
        }
    }

    private String determineWinner() {
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
        numberGames = 0;
        for (int i = 0; i < players.length; i++) {
            players[i].setScore(0);
        }
    }
}