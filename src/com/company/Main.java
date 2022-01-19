package com.company;

public class Main {
    //solution1
    public static void yearBissextile(int year) {
        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
            System.out.println(year + " год является високосным");
        } else {
            System.out.println(year + " год не является високосным");
        }
    }

    //solution2
    public static void versionRecommend(int numberOS, int year) {
        int currentYear = 2019;
        if (year < currentYear && numberOS == 0) {
            System.out.println("Предлагаю вам установить lite-версию для iOS");
        } else if (year > currentYear && numberOS == 0) {
            System.out.println("У вас отличный телефон на базе iOS!");
        }
        if (year < currentYear && numberOS == 1) {
            System.out.println("Предлагаю вам установить lite-версию для Android");
        } else if (year > currentYear && numberOS == 1) {
            System.out.println("У вас отличный телефон на базе Android!");
        }
    }

    //solution3
    public static int daysOfDelivery(int distanceInKilometres) {
        int daysAmount = 0;
        if (distanceInKilometres <= 20) {
            daysAmount = 1;
        } else if (distanceInKilometres > 20 && distanceInKilometres <= 60) {
            daysAmount = 2;
        } else if (distanceInKilometres > 60 && distanceInKilometres <= 100) {
            daysAmount = 3;
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
        for (int i = numbers.length - 1; i >= 0; i--) {
            if (i == 0) {
                System.out.println(numbers[i] + ".");
            } else {
                System.out.print(numbers[i] + ", ");
            }
        }
    }

    public static void main(String[] args) {
        //solution1
        yearBissextile(7864);
        //solution2
        versionRecommend(1, 2014);
        //solution3
        System.out.println("Количество дней доставки равно: " + daysOfDelivery(10));
        //solution4
        validator("adfgghokll");
        //solution5
        arrayMoved(new int[]{2, 6, 8, 12, 14, 23, 29});
    }
}
