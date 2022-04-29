package com.startjava.lesson_2_3_4.calculator;

import java.lang.Math;

public class Calculator {

    public static int calculate(String expression) {
        String[] arrayExpression = expression.split(" ");
        if (isValidated(arrayExpression)) {
            int num1 = Integer.parseInt(arrayExpression[0]);
            int num2 = Integer.parseInt(arrayExpression[2]);
            char sign = arrayExpression[1].charAt(0);
            return switch (sign) {
                case '+' -> num1 + num2;
                case '-' -> num1 - num2;
                case '*' -> Math.multiplyExact(num1, num2);
                case '/' -> num1 / num2;
                case '%' -> num1 % num2;
                case '^' -> (int) Math.pow(num1, num2);
                default  -> throw new IllegalStateException("Unexpected value: " + sign);
            };
        } else {
            System.out.println("Для вычислений используйте только целые положительные числа!");
            System.out.println("Введите корректные значения");
            return 1_999_999_999;
        }
    }

    private static boolean isValidated(String[] args) {
        return args[0].matches("[+]?\\d+") && args[2].matches("[+]?\\d+");
    }
}