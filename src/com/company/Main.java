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
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = numbers[numbers.length - 1 - i];
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
}
