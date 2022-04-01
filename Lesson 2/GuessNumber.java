import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
    Person player1;
    Person player2;
    Person activePlayer;

    public GuessNumber(Person player1, Person player2) {
        this.player1 = (Person) player1.clone();
        this.player2 = (Person) player2.clone();
    }

    public void start() {
        int gamerNum = 0;
        Random random = new Random();
        int secretNum = random.nextInt(100);
        System.out.println("Число загадано!");
        Scanner scanner = new Scanner(System.in);

        if (random.nextInt(2) == 2) {
            activePlayer = player2;
        } else {
            activePlayer = player1;
        }

        while (secretNum != gamerNum) {
            System.out.println("Игрок " + activePlayer.getName() + " угадывает число:");
            gamerNum = scanner.nextInt();
            scanner.nextLine();

            if (gamerNum < secretNum) {
                System.out.println("Данное число меньше того, что загадал компьютер");
                changePlayer();
            } else if (gamerNum > secretNum) {
               System.out.println("Данное число больше того, что загадал компьютер");
               changePlayer();
            }
        }
        System.out.println("Победил игрок " + activePlayer.getName() + "! Загаданное число: " + gamerNum);
    }

    private void changePlayer() {
        if (activePlayer == player1) {
            activePlayer = player2;
        } else {
            activePlayer = player1;
        }
    }
}