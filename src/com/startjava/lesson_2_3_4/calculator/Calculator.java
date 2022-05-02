package com.startjava.lesson_2_3_4.calculator;

import java.lang.Math;

public class Calculator {

    public static int calculate(String expression) throws Exception {
        String[] arrayExpression = expression.split(" ");
        isValidated(arrayExpression);
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
    }

    private static void isValidated(String[] args) throws Exception {
        if (args[0].matches("-\\d") || args[2].matches("-\\d")) {
            throw new IllegalStateException("Для вычислений используйте только положительные числа!");
        } else if (!args[0].matches("\\d+") || !args[2].matches("\\d+")) {
            throw new Exception("Для вычислений используйте только целые числа!");
        }
    }
}