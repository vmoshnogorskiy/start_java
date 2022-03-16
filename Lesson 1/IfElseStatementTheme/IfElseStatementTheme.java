public class IfElseStatementTheme {
    public static void main(String[] args) {
        //1. Перевод псевдокода на язык Java
        System.out.println("1. Перевод псевдокода на язык Java");
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
        System.out.println("2. Поиск максимального и минимального числа");
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
        System.out.println("3. Работа с числом");
        num1 = 47;
        if (num1 % 2 != 0) {
            System.out.println("Число является нечетным");
        } else if (num1 != 0) {
            System.out.println("Число является четным");
        }
        if (num1 < 0) {
            System.out.println("Число является отрицательным");
        } else if (num1 > 0) {
            System.out.println("Число является положительным");
        } else {
            System.out.println("Число является нулем");
        }

        //4. Поиск общей цифры в числах
        System.out.println("4. Поиск общей цифры в числах");
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
        System.out.println("5. Определение буквы, числа или символа по их коду");
        char ch = '\u005A';
        System.out.println("Переменная содержит букву" + ch);

        //6. Определение суммы вклада и начисленных банком %
        System.out.println("6. Определение суммы вклада и начисленных банком %");
        int deposit = 300_000;
        int percent = 5;
        if (deposit < 100_000) {
            percent = 5;
        } else if (deposit >= 100_000 && deposit <= 300_000) {
            percent = 7;
        } else if (deposit > 300_000) {
            percent = 10;
        }
        System.out.println("Сумма вклада: " + deposit + " начисленный процент: " + percent + " итоговая сумма с процентом: " + (float) (deposit + (deposit * percent / 100)));

        //7. Определение оценки по предметам
        System.out.println("7. Определение оценки по предметам");
        int percentHistory = 59;
        int percentProgramming = 91;
        int showHistory = 0;
        int showProgramming = 0;

        if (percentHistory <= 60) {
            showHistory = 2;
        } else if (percentHistory > 60 && percentHistory <= 73) {
            showHistory = 3;
        } else if (percentHistory > 73 && percentHistory <= 91) {
            showHistory = 4;
        } else if (percentHistory > 91) {
            showHistory = 5;
        }

        if (percentProgramming <= 60) {
            showProgramming = 2;
        } else if (percentProgramming > 60 && percentProgramming <= 73) {
            showProgramming = 3;
        } else if (percentProgramming > 73 && percentProgramming <= 91) {
            showProgramming = 4;
        } else if (percentProgramming > 91) {
            showProgramming = 5;
        }
        System.out.println("Оценка по истории: " + showHistory);
        System.out.println("Оценка по программированию: " + showProgramming);
        System.out.println("Средний бал оценок по предметам: " + (float) (showHistory + showProgramming) / 2);
        System.out.println("Средний процент по предметам: " + (float) (percentHistory + percentProgramming) / 2);

        //8. Расчет прибыли (убытка)
        System.out.println("8. Расчет прибыли (убытка)");
        int rent = 5000;
        int primeCost = 9000;
        int income = 15000;
        int yearlyIncome = (income - (primeCost + rent)) * 12;
        if (yearlyIncome < 0) {
            System.out.println("Убыток за год составит: -" + yearlyIncome);
        } else if (yearlyIncome >= 0) {
            System.out.println("Прибыль за год составит: +" + yearlyIncome);
        }

        //9. Определение существования треугольника
        System.out.println("9. Определение существования треугольника");        
        int c = 5;
        int a = 3;
        int b = 4;

        //В прямоугольном треугольнике квадрат гипотенузы равен сумме квадратов катетов
        if (c * c == a * a + b * b) {
            System.out.println("Прямоугольный треугольник со сторонами " + a + ", " + b + ", " + c + " существует");
            System.out.println("Площадь треугольника равна: " + (float) (a * b / 2));
            System.out.println("|\\");
            System.out.println("| \\");
            System.out.println("|  \\");
            System.out.println("|___\\");
        } else {
            System.out.println("Прямоугольный треугольник со сторонами " + a + ", " + b + ", " + c + " не существует");
        }

        //10. Подсчет количества банкнот
        System.out.println("10. Подсчет количества банкнот");
    }
}