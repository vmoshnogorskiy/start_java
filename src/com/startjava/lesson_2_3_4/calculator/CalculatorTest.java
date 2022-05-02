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
            try {
                result = Calculator.calculate(mathExpression);
                System.out.println(mathExpression + " = " + result);
            } catch(Exception e) {
                System.out.println(e.getMessage());
                System.out.println("Введите корректные значения");
            }

            do {
                System.out.println("Хотите продолжить вычисления? [yes/no]:");
                answer = scan.nextLine();
            } while (!"no".equalsIgnoreCase(answer) && !"yes".equalsIgnoreCase(answer));
        } while ("yes".equalsIgnoreCase(answer));
    }
}