public class GuessNumberGame {
    public static void main(String[] args) {
        int secretNum = 11;
        int gamerNum = 50;

        while (gamerNum != secretNum) {
            if (gamerNum < secretNum) {
                System.out.println("Данное число " + gamerNum +" меньше того, что загадал компьютер");
                gamerNum += 2;
            } else if (gamerNum > secretNum) {
               System.out.println("Данное число " + gamerNum + " больше того, что загадал компьютер");
               gamerNum--;
            }
        }
        System.out.println("Вы победили! Загаданное число: " + gamerNum);
    }
}