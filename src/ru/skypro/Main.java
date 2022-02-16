package ru.skypro;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean isTask = true;
        while (isTask) {
            System.out.println("Введите номер задания: 1 - первое, 2 - второе, 3 - третье, 4 - четвёртое," +
                    " 5 - пятое, 0 - выход");
            int task = input.nextInt();
            switch (task) {
                case 0:
                default: {
                    isTask = false;
                    break;
                }
                case 1: {
                    System.out.println("Введите год:");
                    int year = input.nextInt();
                    ifVisocosYear(year);
                    break;
                }
                case 2: {
                    System.out.println("Введите код операционной системы устройства: 0 - iOs, 1 - Android");
                    int system = input.nextInt();
                    int clientDeviceYear = 2015;
                    task2(clientDeviceYear, system);
                    break;
                }
                case 3: {
                    System.out.println("Введите расстояние:");
                    int distance = input.nextInt();
                    System.out.println("Время доставки - " + quantityDays(distance) + " дней");
                    break;
                }
                case 4: {
                    System.out.println("Введите строку");
                    String str = input.next();
                    System.out.println(sortString(str));
                    doubles(sortString(str));
                    break;
                }
                case 5: {
                    int[] array = {4, 5, 3, 6, 7, 8, 5, 6,};
                    for (int value : array) {
                        System.out.print(value + " ");
                    }
                    System.out.println();
                    changeArray(array);
                    break;
                }
            }
        }
        input.close();
    }

    public static boolean visocosYear(int year) {
        if ((year % 4 != 0) || (year % 100 == 0) && (year % 400 != 0)) {
            return false;
        } else {
            return true;
        }
    }

    public static void ifVisocosYear(int year) {
        if (visocosYear(year)) {
            System.out.println("Год вискосный");
        } else {
            System.out.println("Год не явдяется високосным");
        }
    }

    public static void task2(int clientDeviceYear, int system) {
        String s = "";
        if (system == 0) {
            s = "iOs";
        } else if (system == 1) {
            s = "Android";
        }
        if (clientDeviceYear < 2022) {
            System.out.println("Установите облегченную версию приложения для " + s + " по ссылке");
        } else {
            System.out.println("Установите версию приложения для " + s + " по ссылке");
        }
    }

    public static int quantityDays(int distance) {
        int quantity = 1;
        if (distance >= 20) {
            quantity++;
        }
        if (distance >= 60) {
            quantity++;
        }
        if (quantity >= 100) {
            quantity++;
        }
        return quantity;
    }

    public static String sortString(String str) {
        char[] arrStr = str.toCharArray();
        Arrays.sort(arrStr);
        return new String(arrStr);
    }

    public static void doubles(String string) {
        char[] arrString = string.toCharArray();
        int temp = 0;
        for (int i = 0; i < arrString.length - 1; i++) {
            if (arrString[i] == arrString[i + 1]) {
                System.out.println("Дубли есть. Дублируется символ " + arrString[i]);
                temp++;
                break;
            }
        }
        if (temp == 0) {
            System.out.println("Дублей нет");
        }

    }

    public static void changeArray(int[] array) {
        for (int i = 0; i < array.length / 2; i++) {
            int temp = array[i];
            array[i] = array[array.length - 1 - i];
            array[array.length - 1 - i] = temp;
        }
        for (int value : array) {
            System.out.print(value + " ");
        }
        System.out.println();
    }
}





