public class VariablesTheme {
    public static void main(String[] args) {
        //1. Создание переменных и вывод их значений на консоль
        System.out.println("1. Создание переменных и вывод их значений на консоль");
        byte processorsCount = 1;
        System.out.println("Количество процессоров: " + processorsCount);
        short processorBitRate = 64;
        System.out.println("Разрядность процессора: " + processorBitRate);
        int ramCapacity = 16_255;
        System.out.println("Объем оперативной памяти: " + ramCapacity);
        long maxVirtualMemoryCapacity = 18_687L;
        System.out.println("Максимальный объем виртуальной памяти: " + maxVirtualMemoryCapacity);
        float processorFrequency = 1.8F;
        System.out.println("Частота процессора: " + processorFrequency);
        double eulerNumber = 2.7182818284;
        System.out.println("Число Эйлера (e): " + eulerNumber);
        char symbolDollar = 36;
        System.out.println("Знак американского доллара: " + symbolDollar);
        boolean isCheck = true;
        System.out.println("Признак пройденной проверки: " + isCheck);

        //2. Расчет стоимости товара со скидкой
        System.out.println("2. Расчет стоимости товара со скидкой");
        int priceX = 100;
        int priceY = 200;
        float discount = (float) (priceX + priceY) * 0.11F;        
        float finalSum = priceX + priceY - discount;
        System.out.println("Итоговая сумма товаров с учетом скидки: " + finalSum); 
        System.out.println("Сумма скидки: " + discount);

        //3. Вывод на консоль слова JAVA
        System.out.println("3. Вывод на консоль слова JAVA");
        System.out.println("   J    a  v     v  a   ");
        System.out.println("   J   a a  v   v  a a  ");
        System.out.println("J  J  aaaaa  V V  aaaaa ");
        System.out.println(" JJ  a     a  V  a     a");

        //4. Отображение min и max значений числовых типов данных
        System.out.println("4. Отображение min и max значений числовых типов данных");
        byte maxByte = 127;
        System.out.println("Максимальное значение типа byte: " + maxByte);
        short maxShort = 32_767;
        System.out.println("Максимальное значение типа short: " + maxShort);
        int maxInt = 2_147_483_647;
        System.out.println("Максимальное значение типа int: " + maxInt);
        long maxLong = 9_223_372_036_854_775_807L;
        System.out.println("Максимальное значение типа long: " + maxLong);
        float maxFloat = Float.MAX_VALUE;
        System.out.println("Максимальное значение типа float: " + maxFloat);
        double maxDouble = Double.MAX_VALUE;
        System.out.println("Максимальное значение типа double: " + maxDouble);
        System.out.println("Значение типа byte после инкремента на 1: " + ++maxByte);
        System.out.println("Значение типа short после инкремента на 1: " + ++maxShort);
        System.out.println("Значение типа int после инкремента на 1: " + ++maxInt);
        System.out.println("Значение типа long после инкремента на 1: " + ++maxLong);
        System.out.println("Значение типа float после инкремента на 1: " + ++maxFloat);
        System.out.println("Значение типа double после инкремента на 1: " + ++maxDouble);
        System.out.println("Значение типа byte после декремента на 1: " + --maxByte);
        System.out.println("Значение типа short после декремента на 1: " + --maxShort);
        System.out.println("Значение типа int после декремента на 1: " + --maxInt);
        System.out.println("Значение типа long после декремента на 1: " + --maxLong);
        System.out.println("Значение типа float после декремента на 1: " + --maxFloat);        
        System.out.println("Значение типа double после декремента на 1: " + --maxDouble);

        //5. Перестановка значений переменных
        System.out.println("5. Перестановка значений переменных");
        float var1 = 2.54F;
        System.out.println("Переменная 1: " + var1);
        float var2 = 3.14F;
        System.out.println("Переменная 2: " + var2);
        float buffer = var1;
        var1 = var2;
        var2 = buffer;
        System.out.println("Переменная 1 (поменяли местами):" + var1);
        System.out.println("Переменная 2 (поменяли местами):" + var2);

        //6. Вывод символов и их кодов
        System.out.println("6. Вывод символов и их кодов");
        int grid = 35;
        System.out.println("Коду " + grid + " соответствует символ " + (char) grid);
        int ampersand = 38;
        System.out.println("Коду " + ampersand + " соответствует символ " + (char) ampersand);
        int at = 64;
        System.out.println("Коду " + at + " соответствует символ " + (char) at);
        int apostrophe = 94;
        System.out.println("Коду " + apostrophe + " соответствует символ " + (char) apostrophe);
        int underlining = 95;
        System.out.println("Коду " + underlining + " соответствует символ " + (char) underlining);

        //7. Произведение и сумма цифр числа
        System.out.println("7. Произведение и сумма цифр числа");
        int srcNum = 345;
        int hundred = srcNum / 100;
        int one = srcNum % 10;
        int ten = (srcNum / 10) % 10;        
        System.out.println("Произведение цифр числа: " + (hundred * ten * one));
        System.out.println("Сумма цифр числа: " + (hundred + ten + one));

        //8. Вывод на консоль ASCII-арт Дюка
        System.out.println("8. Вывод на консоль ASCII-арт Дюка");
        char slash = '/';
        char backslash = '\\';
        char space = ' ';
        char char_Underlining = '_';
        char leftbracket = '(';
        char rightbracket = ')';        
        System.out.println("" + space + space + space + space + slash + backslash);
        System.out.println("" + space + space + space + slash + space + space + backslash);
        System.out.println("" + space + space + slash + char_Underlining + leftbracket + space + rightbracket + backslash);
        System.out.println("" + space + slash + space + space + space + space + space + space + backslash);
        System.out.println("" + slash + char_Underlining + char_Underlining + char_Underlining + char_Underlining + slash + backslash + char_Underlining + char_Underlining + backslash);

        //9. Отображение сотен, десятков, единиц числа
        System.out.println("9. Отображение сотен, десятков, единиц числа");
        srcNum = 123;
        System.out.println("сотни: " + (srcNum / 100));
        System.out.println("десятки: " + ((srcNum / 10) % 10));
        System.out.println("единицы: " + (srcNum % 10));

        //10. Преобразование секунд
        System.out.println("10. Преобразование секунд");
        int originSeconds = 86399;
        int hours = originSeconds / 3600;
        int minutes = (originSeconds % 3600) / 60;
        int seconds = (originSeconds % 3600) % 60;
        System.out.println(hours + ":" + minutes + ":" + seconds);
    }
}