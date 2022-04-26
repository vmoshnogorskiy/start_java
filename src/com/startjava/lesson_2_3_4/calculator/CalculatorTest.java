package com.startjava.lesson_2_3_4.calculator;

import java.util.Scanner;

public class CalculatorTest {

    public static void main(String[] args) {
        int num1 = 0;
        int num2 = 0;
        char sign;
        int result = 0;
        String yesNo = "";
        String inputString = "";
        String[] inputArray = new String[3];

        Scanner scan = new Scanner(System.in);
        do {
            System.out.println("Введите математическое выражение: ");
            inputString = scan.nextLine();
            inputArray = inputString.split(" ");
            if (inputArray[0].matches("[+]?\\d+") && inputArray[2].matches("[+]?\\d+")) {
                num1 = Integer.parseInt(inputArray[0]);
                num2 = Integer.parseInt(inputArray[2]);
                sign = inputArray[1].charAt(0);
                result = Calculator.calculate(num1, num2, sign);
                System.out.println(num1 + " " + sign + " " + num2 + " = " + result);
            } else {
                System.out.println("Для вычислений используйте только целые положительные числа!");
                System.out.println("Введите корректные значения");
            }
            do {
                System.out.println("Хотите продолжить вычисления? [yes/no]:");
                yesNo = scan.nextLine();
            } while (!"no".equalsIgnoreCase(yesNo) && !"yes".equalsIgnoreCase(yesNo));
        } while ("yes".equalsIgnoreCase(yesNo));
    }
}