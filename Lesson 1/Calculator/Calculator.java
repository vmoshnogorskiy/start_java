public class Calculator {
    public static void main(String[] args) {
        char sign = '^';
        int num1 = 10;
        int num2 = 5;
        int result = 0;

        switch (sign) {
            case ('+'): 
                result = num1 + num2;
                System.out.println(num1 + " " + sign + " " + num2 + " = " + result);
                break;
            case ('-'):
                result = num1 - num2;
                System.out.println(num1 + " " + sign + " " + num2 + " = " + result);
                break;
            case ('*'):
                result = num1 * num2;
                System.out.println(num1 + " " + sign + " " + num2 + " = " + result);
                break;
            case ('/'):
                result = num1 / num2;
                System.out.println(num1 + " " + sign + " " + num2 + " = " + result);
                break;
            case ('%'):
                result = num1 % num2;
                System.out.println(num1 + " " + sign + " " + num2 + " = " + result);
                break;
            case ('^'):
                result = num1;
                for (int i = 0; i < num2 - 1; i++) {
                    result = result * num1;
                }
                System.out.println(num1 + " " + sign + " " + num2 + " = " + result);
                break;
        }
    }
}