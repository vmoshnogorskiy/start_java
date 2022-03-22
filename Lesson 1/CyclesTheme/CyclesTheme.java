public class CyclesTheme {
    public static void main(String[] args) {
        // 1. Подсчет суммы четных и нечетных чисел
        System.out.println("\n1. Подсчет суммы четных и нечетных чисел");
        int num = -10;
        int sumEven = 0;
        int sumOdd = 0;

        do {
            if ( num % 2 == 0) {
                sumEven = sumEven + num;
            } else {
                sumOdd = sumOdd + num;
            }
            num++;
        }
        while (num <= 21);
        System.out.println("Сумма четных чисел равна: " + sumEven);
        System.out.println("Сумма нечетных чисел равна: " + sumOdd);

        //2. Вывод чисел между max и min
        System.out.println("\n2. Вывод чисел между max и min");
        int maxNum = 10;
        int midNum = 5;
        int minNum = -1;
        int buffer = 0;

        if (maxNum < midNum) {
            buffer = maxNum;
            maxNum = midNum;
            midNum = buffer;
        }
        if (minNum > midNum) {
            buffer = minNum;
            minNum = midNum;
            midNum = buffer;
        }
        for (int i = maxNum; i >= minNum; i--) {
            System.out.println(i);
        }

        //3. Вывод реверсивного числа и суммы его цифр
        System.out.println("\n3. Вывод реверсивного числа и суммы его цифр");
        int sum = 0;
        int distNum = 0;
        int digitLength = 1000;
        buffer = 0;
        num = 1234;        

        while (num > 0) {
            buffer = num % 10;
            sum = sum + buffer;
            distNum = distNum + buffer * digitLength;
            digitLength = digitLength / 10;
            num = num / 10;
        }
        System.out.println("Исходное число в обратном порядке: " + distNum + " , сумма его цифр: " + sum );

        //4. Вывод чисел на консоль в несколько строк
        int counter = 0;
        System.out.println("\n4. Вывод чисел на консоль в несколько строк");        
        for (int i = 1; i <= 24; i += 2) {
            counter++;
            System.out.format("  %2d", i);

            if (counter == 5) {
                System.out.println();
                counter = 0;
            }
        }
        while (counter < 5) {
            counter++;
            System.out.format("  %2d", 0);
        }

        //5. Проверка количества единиц на четность
        System.out.println("\n\n5. Проверка количества единиц на четность");
        num = 3141591;
        counter = 0;
        buffer = num;

        while (num % 10 > 0) {
            if (num % 10 == 1) {
                counter++;
                System.out.println("проход по циклу " + counter);
            }
            num = num / 10;
        }
        if (counter % 2 == 0) {
            System.out.println("Количество единиц в числе " + buffer + " является четным и равняется " + counter);
        } else {
            System.out.println("Количество единиц в числе " + buffer + " является нечетным и равняется " + counter);
        }

        //6. Отображение фигур в консоли
        System.out.println("\n6. Отображение фигур в консоли");

        //прямоугольник
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        //треугольник
        int counter1 = 5;
        int counter2 = counter1;
        while (counter1 > 0) {
            while (counter2 > 0) {
                System.out.print("#");
                counter2--;
            }
            System.out.println();
            counter1--;
            counter2 = counter1;
        }

        //ромб
        int limiter = 0;
        counter1 = 5;
        counter2 = 0;
        do {
            do {
                System.out.print("$");
                counter2++;
            } while (counter2 <= limiter);
            System.out.println();
            if (counter1 >= 3) {
                limiter++;
                counter2--;
            } 
            if (counter1 == 4) {
                limiter++;
            }
            counter1--;
        } while (counter1 > 0);
        
        //7. Отображение ASCII-символов
        System.out.println("\n7. Отображение ASCII-символов");
        System.out.format("\n Dec  Char");
        
        for (int i = 0; i < 128; i++) {
            System.out.format("\n %3d  %2c", i, (char) i);
        }
        
        //8. Проверка, является ли число палиндромом
        System.out.println("\n\n8. Проверка, является ли число палиндромом");
        int reversedNumber = 0;
        int originNumber = 12321;
        int tmpOriginal = originNumber;

        while (tmpOriginal > 0) {
            reversedNumber = (reversedNumber * 10) + tmpOriginal % 10;
            tmpOriginal = tmpOriginal / 10;
        }
        if (originNumber == reversedNumber) {
            System.out.println("Число " + originNumber + " является палиндромом");
        } else {
            System.out.println("Число " + originNumber + " не является палиндромом");
        }

        //9. Определение, является ли число счастливым
        System.out.println("\n9. Определение, является ли число счастливым");
        int sum1 = 0;
        int sum2 = 0;
        int number1 = 0;
        int number2 = 0;
        originNumber = 654456;
        buffer = originNumber;
        counter = 0;

        while (originNumber > 0) {
            counter++;
            if (counter <= 3) {
                number1 =  (number1 * 10) + originNumber % 10;
                sum1 = sum1 + originNumber % 10;
                originNumber = originNumber / 10;
            } else {
                number2 =  (number2 * 10) + originNumber % 10;
                sum2 = sum2 + originNumber % 10;
                originNumber = originNumber / 10;
            }
        }
        System.out.println((number1 / 100) + " + " + ((number1 / 10) % 10) + " + " + (number1 % 100) % 10 + " = " + sum1);
        System.out.println((number2 / 100) + " + " + ((number2 / 10) % 10) + " + " + (number2 % 100) % 10 + " = " + sum2);
        if (sum1 == sum2) {
            System.out.println("Число " + buffer + " является счастливым");
        } else {
            System.out.println("Число " + buffer + " не является счастливым");
        }

        //10. Вывод таблицы умножения Пифагора
        System.out.println("\n10. Вывод таблицы умножения Пифагора");
        for (int i = 1; i <= 9;i++) {
            for (int j = 1; j <= 9; j++) {
                if ( i == j && j == 1) {
                    System.out.format(" %2s", " ");
                } else {
                    System.out.format(" %2d", i * j);
                }
            }
            System.out.println();
        }
    }
}