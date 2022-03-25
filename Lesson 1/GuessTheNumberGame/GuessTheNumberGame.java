public class GuessTheNumberGame {
    public static void main(String[] args) {
        int srcNum = 11;
        int gamerNum = 50;
        boolean isFinish = false;

        while (!isFinish) {
            if (gamerNum == srcNum) {
                System.out.println("Вы победили!");
                isFinish = true;
            } else if (gamerNum < srcNum) {
                System.out.println("Данное число " + gamerNum +" меньше того, что загадал компьютер");
              gamerNum = gamerNum + 2;
            } else if (gamerNum > srcNum) {
               System.out.println("Данное число " + gamerNum + " больше того, что загадал компьютер");
               gamerNum = gamerNum - 1;
            }
        }
    }
}