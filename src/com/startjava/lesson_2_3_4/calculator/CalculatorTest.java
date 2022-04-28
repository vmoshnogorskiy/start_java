package com.startjava.lesson_2_3_4.calculator;

import java.util.Scanner;

public class CalculatorTest {

    public static void main(String[] args) {
        int result;
        String yesNo;
        String inputString;

        Scanner scan = new Scanner(System.in);
        do {
            System.out.println("Введите математическое выражение: ");
            inputString = scan.nextLine();
            result = Calculator.calculate(inputString);

            if (result == -1) {
                System.out.println("Для вычислений используйте только целые положительные числа!");
                System.out.println("Введите корректные значения");
            } else {
                System.out.println(inputString + " = " + result);
            }

            do {
                System.out.println("Хотите продолжить вычисления? [yes/no]:");
                yesNo = scan.nextLine();
            } while (!"no".equalsIgnoreCase(yesNo) && !"yes".equalsIgnoreCase(yesNo));
        } while ("yes".equalsIgnoreCase(yesNo));
    }
}