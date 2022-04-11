package com.startjava.lesson_2_3.calculator;

public class Calculator {

    private char sign;
    private int num1;
    private int num2;
    private int result;

    public Calculator(int num1, int num2, char sign) {
        this.num1 = num1;
        this.num2 = num2;
        this.sign = sign;
    }

    public int calculate() {
        switch (sign) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                result = num1 / num2;
                break;
            case '%':
                result = num1 % num2;
                break;
            case '^':
                result = num1;
                for (int i = 0; i < num2 - 1; i++) {
                    result *= num1;
                }
                break;
            default:
                System.out.println("Введенный символ " + sign + " не поддерживается");
                break;
        }
        return result;
    }
}