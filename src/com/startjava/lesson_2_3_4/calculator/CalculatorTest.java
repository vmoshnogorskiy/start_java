package com.startjava.lesson_2_3_4.calculator;

import java.util.Scanner;

public class CalculatorTest {

    public static void main(String[] args) {
        int result;
        String answer;
        String mathExpression;

        Scanner scan = new Scanner(System.in);
        do {
            System.out.println("Введите математическое выражение: ");
            mathExpression = scan.nextLine();
            result = Calculator.calculate(mathExpression);

            if (result != 1_999_999_999) {
                System.out.println(mathExpression + " = " + result);
            }

            do {
                System.out.println("Хотите продолжить вычисления? [yes/no]:");
                answer = scan.nextLine();
            } while (!"no".equalsIgnoreCase(answer) && !"yes".equalsIgnoreCase(answer));
        } while ("yes".equalsIgnoreCase(answer));
    }
}