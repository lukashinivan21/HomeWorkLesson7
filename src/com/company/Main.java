package com.company;

import java.time.LocalDate;
import java.util.Arrays;

public class Main {
    //solution1
    public static void isLeapYear(int year) {
        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
            System.out.println(year + " год является високосным");
        } else {
            System.out.println(year + " год не является високосным");
        }
    }

    //solution2
    public static void versionRecommend(int numberOS, int year) {
        int currentYear = LocalDate.now().getYear();
        String base = "Установите";
        base += year < currentYear ? " облегченную версию " : " последнюю версию ";
        base += "для операционной системы ";
        base += numberOS == 0 ? "iOs" : "Android";
        System.out.println(base);


    }

    //solution3
    public static int daysOfDelivery(int distanceInKilometres) {
        int daysAmount = 1;
        if (distanceInKilometres > 20 && distanceInKilometres <= 60) {
            daysAmount += 1;
        }
        if (distanceInKilometres > 60 && distanceInKilometres <= 100) {
            daysAmount += 2;
        }
        return daysAmount;
    }

    //solution4
    public static void validator(String s) {
        for (int i = 0; i < s.length() - 1; i++) {
            if (s.charAt(i) == s.charAt(i + 1)) {
                System.out.println("Нашлось задублирование символа " + s.charAt(i));
                break;
            } else {
                System.out.println("В строке нет задублированных символов");
            }
        }
    }

    //solution5
    public static void arrayMoved(int[] numbers) {
        System.out.println(Arrays.toString(numbers));
        for (int i = 0; i < numbers.length / 2; i++) {
            int temp = numbers[i];
            numbers[i] = numbers[numbers.length - 1 - i];
            numbers[numbers.length - 1 - i] = temp;
        }
        System.out.println(Arrays.toString(numbers));


    }

    public static void main(String[] args) {
        //solution1
        isLeapYear(7864);
        //solution2
        versionRecommend(0, 2022);
        //solution3
        System.out.println("Количество дней доставки равно: " + daysOfDelivery(10));
        //solution4
        validator("adfgghokll");
        //solution5
        arrayMoved(new int[]{2, 6, 8, 12, 14, 19, 21});
    }
    //пояснения по последней задаче №5: сначала мы вводим дополнительную переменную int temp,
    //в которой будем хранить значения первой половины элементов массива до того, как начнем переставлять
    //в массиве элементы, то есть из массива new int[]{2, 6, 8, 12, 14, 19, 21} в переменной temp
    //окажутся значения 2, 6, 8 - соотвественно на 0-й, 1-й и 2-й иттерации цикла for. Затем осуществляется
    // перестановка элементов исходного массива в строке 57 (на 0-й иттерации цикла for в numbers[i] попадёт
    //значение последнего элемента исходного массива, т.е 21; на 1-й иттерации - предпоследнего элемента, т.е 19;
    // на 2-й иттерации - предпредпоследнего элемента, т.е 14). Затем в строке 58 присваиваем трем последним элементам исходного массива значения
    //из переменной temp: на 0-й иттерации цикла for значение numbers[numbers.length - 1 - 0] будет равно значению переменной
    //temp на 0-й иттерации (numbers[numbers.length - 1 - 0] = 2); на 1-й иттерации цикла for (numbers[numbers.length - 1 - 1] = 6);
    //на 2-й иттерации цикла for (numbers[numbers.length - 1 - 2] = 8). Центральный элемент исходного массива за индексом 3, т.е 12,
    // не участвует во всех этих перестановках.
    //                                         И все то же самое только ввиде небольшой таблицы:
    // иттерация цикла for:                         0                                      1                                                2
    //значение int temp в строке 56:          numbers[0] = 2                          numbers[1] = 6                                  numbers[2] = 8
    //значения в строке 57:          numbers[0] = numbers[7 - 1 - 0] = 21     numbers[1] = numbers[7 - 1 - 1] = 19           numbers[2] = numbers[7 - 1 - 1] = 14
    // значения в строке 58:                numbers[7 - 1 - 0] = 2                  numbers[7 - 1 - 1] = 6                         numbers[7 - 1 - 2] = 8
    // И чтобы реализовать этот алгоритм в условии цикла for длину массива делим на 2.
    //СПАСИБО ЗА ПОМОЩЬ И ПОДСКАЗКИ! ЭТО ОЧЕНЬ СИЛЬНО ПОМОГАЕТ.
}
