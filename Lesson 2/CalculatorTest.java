import java.util.Scanner;

public class CalculatorTest {

    public static void main(String[] args) {
        int num1 = 0;
        int num2 = 0;
        char sign;
        int result = 0;
        String yesNo = "n";

        Scanner scan = new Scanner(System.in);
        do {
            System.out.println("Введите первое число:");
            num1 = scan.nextInt();
            System.out.println("Введите знак математической операции:");
            sign = scan.next().charAt(0);
            System.out.println("Введите второе число:");
            num2 = scan.nextInt();
            scan.nextLine();
            Calculator calc = new Calculator(num1, num2, sign);
            result = calc.calculate();
            System.out.println(num1 + " " + sign + " " + num2 + " = " + result);

            do {
                System.out.println("Хотите продолжить вычисления? [yes/no]:");
                yesNo = scan.nextLine();
            } while (!yesNo.equalsIgnoreCase("no") && !yesNo.equalsIgnoreCase("yes"));
        } while (yesNo.equalsIgnoreCase("yes"));
        
    }
}