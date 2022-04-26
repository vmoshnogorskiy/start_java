package com.startjava.lesson_2_3_4.calculator;

import java.lang.Math;

public class Calculator {

    private char sign;
    private int num1;
    private int num2;
    private static int result;

    public Calculator(int num1, int num2, char sign) {
        this.num1 = num1;
        this.num2 = num2;
        this.sign = sign;
    }

    public static int calculate(int num1, int num2, char sign) {
        result =
            switch (sign) {
                case '+' -> num1 + num2;
                case '-' -> num1 - num2;
                case '*' -> Math.multiplyExact(num1, num2);
                case '/' -> num1 / num2;
                case '%' -> num1 % num2;
                case '^' -> (int) Math.pow(num1, num2);
                default  -> throw new IllegalStateException("Unexpected value: " + sign);
            };
        return result;
    }
}