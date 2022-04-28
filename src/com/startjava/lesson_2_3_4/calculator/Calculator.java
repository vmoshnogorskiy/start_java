package com.startjava.lesson_2_3_4.calculator;

import java.lang.Math;

public class Calculator {

    public static int calculate(String expression) {
        char sign;
        int num1;
        int num2;
        String[] inputArray;

        inputArray = expression.split(" ");
        if (isValidated(inputArray)) {
            num1 = Integer.parseInt(inputArray[0]);
            num2 = Integer.parseInt(inputArray[2]);
            sign = inputArray[1].charAt(0);
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
            return -1;
        }
    }

    private static boolean isValidated(String[] args) {
        return args[0].matches("[+]?\\d+") && args[2].matches("[+]?\\d+");
    }
}