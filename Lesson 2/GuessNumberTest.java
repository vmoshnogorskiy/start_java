import java.util.Scanner;

public class GuessNumberTest {

    public static void main(String[] args) {
        String option = "";
        Scanner console = new Scanner(System.in);
        System.out.println("Введите имя первого игрока: ");
        String playerName1 = console.nextLine();
        System.out.println("Введите имя второго игрока: ");
        String playerName2 = console.nextLine();

        if (playerName1 != "" && playerName2 != "") {
            do {
                GuessNumber guessNumber = new GuessNumber(playerName1, playerName2);
                guessNumber.start();
                do {
                    System.out.println("Хотите продолжить игру? [yes/no]:");
                    option = console.nextLine();
                } while (!"no".equalsIgnoreCase(option) && !"yes".equalsIgnoreCase(option));
            } while ("yes".equalsIgnoreCase(option));
        } else {
            System.out.println("Введено некорректное имя игрока");
        }
    }
}