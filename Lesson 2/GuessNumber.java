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
        int gamerNum = 0;
        Random random = new Random();
        int secretNum = random.nextInt(99 + 1) + 1; //(0 : 100] = [1 : 100]
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
                activePlayer = changePlayer();
            } else if (gamerNum > secretNum) {
               System.out.println("Данное число больше того, что загадал компьютер");
               activePlayer = changePlayer();
            }
        }
        System.out.println("Победил игрок " + activePlayer.getName() + "! Загаданное число: " + gamerNum);
    }

    private Player changePlayer() {
        return activePlayer == player1 ? player2 : player1;
    }
}