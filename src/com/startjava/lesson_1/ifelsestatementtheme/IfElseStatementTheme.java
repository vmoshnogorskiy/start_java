package com.startjava.lesson_1.ifelsestatementtheme;

public class IfElseStatementTheme {
    public static void main(String[] args) {
        //1. Перевод псевдокода на язык Java
        System.out.println("\n1. Перевод псевдокода на язык Java");
        int age = 21;
        if (age > 20) {
            System.out.println("Вам разрешен доступ в ночной клуб");
        } else {
            System.out.println("Лицам, не достигшим 21 года доступ в ночной клуб запрещен");
        }

        boolean isMale = true;
        if (!isMale) {
            System.out.println("Дамы, вы находитесь в зоне для мужчин");
        }

        float length = 1.9F;
        if (length < 1.80) {
            System.out.println("Можете присесть в первых рядах зала");
        } else {
            System.out.println("Вы будете чувствовать себя комфортней в верхних рядах зала");
        }

        char firstLetter = "Mike".charAt(0);
        if (firstLetter == 'M') {
            System.out.println("Возможно, Ваше имя 'Mike'.");
        } else if (firstLetter == 'I') {
            System.out.println("Возможно, Ваше имя 'Igor'.");
        } else {
            System.out.println("У Вас необычное имя для здешних мест:)");
        }

        //2. Поиск максимального и минимального числа
        System.out.println("\n2. Поиск максимального и минимального числа");
        int num1 = 354;
        int num2 = 1284;
        if (num1 > num2) {
            System.out.println("Максимальное число = " + num1);
            System.out.println("Минимальное число =" + num2);
        } else if (num1 < num2) {
            System.out.println("Максимальное число = " + num2);
            System.out.println("Минимальное число =" + num1);
        } else {
            System.out.println("Числа равны");
        }
        
        //3. Работа с числом
        System.out.println("\n3. Работа с числом");
        num1 = 47;
        if (num1 % 2 != 0) {
            System.out.println("Число " + num1 + " является нечетным");
        } else if (num1 != 0) {
            System.out.println("Число " + num1 + " является четным");
        }
        if (num1 < 0) {
            System.out.println("Число " + num1 + " является отрицательным");
        } else if (num1 > 0) {
            System.out.println("Число " + num1 + " является положительным");
        } else {
            System.out.println("Число " + num1 + " является нулем");
        }

        //4. Поиск общей цифры в числах
        System.out.println("\n4. Поиск общей цифры в числах");
        num1 = 751;
        num2 = 761;

        int hundred1 = num1 / 100;
        int ten1 = (num1 / 10) % 10;
        int one1 = num1 % 10;

        int hundred2 = num2 / 100;
        int ten2 = (num2 / 10) % 10;
        int one2 = num2 % 10;

        if (hundred1 == hundred2) {
            System.out.println("Одинаковые сотни: " + hundred1);
        } 
        if (ten1 == ten2) {
            System.out.println("Одинаковые десятки " + ten1);
        } 
        if (one1 == one2) {
            System.out.println("Одинаковые единицы " + one1);
        }

        //5. Определение буквы, числа или символа по их коду
        System.out.println("\n5. Определение буквы, числа или символа по их коду");
        char character = '\u005A';
        int charCode = (int) character;

        if (charCode > 64 && charCode < 91 || charCode > 96 && charCode < 123) {
            System.out.println("Переменная содержит букву " + character);
        } else if (charCode >= 48 && charCode < 58) {
            System.out.println("Переменная содержит число " + character);
        } else {
            System.out.println("Переменная содержит не букву и не число " + character);
        }

        //6. Определение суммы вклада и начисленных банком %
        System.out.println("\n6. Определение суммы вклада и начисленных банком %");
        int deposit = 300_000;
        int percent = 0;
        if (deposit < 100_000) {
            percent = 5;
        } else if (deposit >= 100_000 && deposit <= 300_000) {
            percent = 7;
        } else if (deposit > 300_000) {
            percent = 10;
        }
        System.out.println("Сумма вклада: " + deposit + " начисленный процент: " + percent + " итоговая сумма с процентом: " + (float) (deposit + (deposit * percent / 100)));

        //7. Определение оценки по предметам
        System.out.println("\n7. Определение оценки по предметам");
        int percentHistory = 59;
        int percentProgramming = 91;
        int historyPoints = 0;
        int programmingPoints = 0;

        if (percentHistory <= 60) {
            historyPoints = 2;
        } else if (percentHistory > 60 && percentHistory <= 73) {
            historyPoints = 3;
        } else if (percentHistory > 73 && percentHistory <= 91) {
            historyPoints = 4;
        } else if (percentHistory > 91) {
            historyPoints = 5;
        }

        if (percentProgramming <= 60) {
            programmingPoints = 2;
        } else if (percentProgramming > 60 && percentProgramming <= 73) {
            programmingPoints = 3;
        } else if (percentProgramming > 73 && percentProgramming <= 91) {
            programmingPoints = 4;
        } else if (percentProgramming > 91) {
            programmingPoints = 5;
        }
        System.out.println("Оценка по истории: " + historyPoints);
        System.out.println("Оценка по программированию: " + programmingPoints);
        System.out.println("Средний бал оценок по предметам: " + (float) (historyPoints + programmingPoints) / 2);
        System.out.println("Средний процент по предметам: " + (float) (percentHistory + percentProgramming) / 2);

        //8. Расчет прибыли (убытка)
        System.out.println("\n8. Расчет прибыли (убытка)");
        int rent = 5000;
        int primeCost = 9000;
        int income = 15000;
        int yearlyIncome = (income - primeCost - rent) * 12;
        if (yearlyIncome < 0) {
            System.out.println("Убыток за год составит: -" + yearlyIncome);
        } else if (yearlyIncome >= 0) {
            System.out.println("Прибыль за год составит: +" + yearlyIncome);
        }

        //9. Определение существования треугольника
        System.out.println("\n9. Определение существования треугольника");        
        int hypotenuse = 5;
        int leg1 = 3;
        int leg2 = 4;
        int buffer = 0;

        /*
        Определим гипотенузу и катеты. Гипотенуза в прямоугольном треугольнике - это самая длинная сторона
        */
        if (hypotenuse < leg1) {
            buffer = hypotenuse;
            hypotenuse = leg1;
            leg1 = buffer;
        }
        if (hypotenuse < leg2) {
            buffer = hypotenuse;
            hypotenuse = leg2;
            leg2 = buffer;
        }

        //В прямоугольном треугольнике квадрат гипотенузы равен сумме квадратов катетов
        if (hypotenuse * hypotenuse == leg1 * leg1 + leg2 * leg2) {
            System.out.println("Прямоугольный треугольник со сторонами " + leg1 + ", " + leg2 + ", " + hypotenuse + " существует");
            System.out.println("Площадь треугольника равна: " + (float) (leg1 * leg2 / 2));
            System.out.println("|\\");
            System.out.println("| \\");
            System.out.println("|  \\");
            System.out.println("|___\\");
        } else {
            System.out.println("Прямоугольный треугольник со сторонами " + leg1 + ", " + leg2 + ", " + hypotenuse + " не существует");
        }

        //10. Подсчет количества банкнот
        System.out.println("\n10. Подсчет количества банкнот");
        int srcSum = 567;
        int keepSum = 0;
        int recalcSum = 0;
        int countMaxNominal = 0;
        int countMidNominal = 0;
        int countMinNominal = 0;
        int maxBanknote = 50;
        int midBanknote = 10;
        int minBanknote = 1;
        int bufferBanknote = 0;

        //Упорядочим номиналы банкнот от Максимального к Минимальному
        if (maxBanknote < midBanknote) {
            bufferBanknote = maxBanknote;
            maxBanknote = midBanknote;
            midBanknote = bufferBanknote;
        } 
        if (maxBanknote < minBanknote) {
            bufferBanknote = maxBanknote;
            maxBanknote = minBanknote;
            minBanknote = bufferBanknote;
        }
        if (midBanknote < minBanknote) {
            bufferBanknote = midBanknote;
            midBanknote = minBanknote;
            minBanknote = bufferBanknote;
        }

        //Подсчитаем необходимое количество банкнот каждого номинала
        countMaxNominal = srcSum / maxBanknote;
        keepSum = srcSum % maxBanknote;
        countMidNominal = keepSum / midBanknote;
        keepSum = keepSum % midBanknote;
        countMinNominal = keepSum / minBanknote;        
        recalcSum = countMaxNominal * maxBanknote + countMidNominal * midBanknote + countMinNominal * minBanknote;

        if (srcSum != recalcSum) {
            System.out.println("Указанную сумму невозможно получить имеющимися номиналами банкнот. Возможно получить сумму: " + recalcSum);
        } else {
            System.out.println("Начальная сумма: " + srcSum + ", банкнот с номиналом " + maxBanknote + ": " + countMaxNominal + ", банкнот с номиналом " + midBanknote + ": " + countMidNominal + ", банкнот с номиналом " + minBanknote + ": " + countMinNominal + ", подсчитанная исходная сумма: " + recalcSum);
        }
    }
}