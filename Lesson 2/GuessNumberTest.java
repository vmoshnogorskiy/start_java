import java.util.Scanner;

public class GuessNumberTest {

    public static void main(String[] args) {
        String yesNo = "";
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите имя первого игрока: ");
        String gamerName1 = scan.nextLine();
        System.out.println("Введите имя второго игрока: ");
        String gamerName2 = scan.nextLine();

        if (gamerName1 != "" && gamerName2 != "") {
            Person gamer1 = new Person(gamerName1);
            Person gamer2 = new Person(gamerName2);
            do {
                GuessNumber guessNumber = new GuessNumber(gamer1, gamer2);
                guessNumber.start();
                do {
                    System.out.println("Хотите продолжить игру? [yes/no]:");
                    yesNo = scan.nextLine();
                } while (!"no".equalsIgnoreCase(yesNo) && !"yes".equalsIgnoreCase(yesNo));
            } while ("yes".equalsIgnoreCase(yesNo));
        } else {
            System.out.println("Введено некорректное имя игрока");
        }
    }
}