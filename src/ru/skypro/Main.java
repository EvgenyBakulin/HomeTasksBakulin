package ru.skypro;

public class Main {

    public static void main(String[] args) {

        System.out.println("Первое задание");
        int[] arrayInt = new int[3];
        /*Иницциализирую массив через цикл (там же 1,2,3 должно быть)*/
        for (int i = 0; i < arrayInt.length; i++) {
            arrayInt[i] = ++i;
            --i;
        }
        System.out.println("Массив arrayInt создан");
        double[] arrayDouble = {1.57, 7.654, 9.986};
        System.out.println("Массив arrayDouble создан");
        char[] arrayChar = new char[5];
        arrayChar[0] = 'H';
        arrayChar[1] = 'e';
        arrayChar[2] = 'l';
        arrayChar[3] = 'l';
        arrayChar[4] = 'o';
        System.out.println("Массив arrayChar создан");
        System.out.println("Второе задание");
        for (int i = 0; i < arrayInt.length; i++) {
            if (i == arrayInt.length - 1) {
                System.out.println(arrayInt[i]);
            } else {
                System.out.print(arrayInt[i] + ", ");
            }
        }
        for (int i = 0; i < arrayDouble.length; i++) {
            if (i == arrayDouble.length - 1) {
                System.out.println(arrayDouble[i]);
            } else {
                System.out.print(arrayDouble[i] + ", ");
            }
        }
        for (int i = 0; i < arrayChar.length; i++) {
            if (i == arrayChar.length - 1) {
                System.out.println(arrayChar[i]);
            } else {
                System.out.print(arrayChar[i] + ", ");
            }
        }
        System.out.println("Третье задание. Обратный порядок");
        for (int i = arrayInt.length - 1; i >= 0; i--) {
            if (i == 0) {
                System.out.println(arrayInt[i]);
            } else {
                System.out.print(arrayInt[i] + ", ");
            }
        }
        for (int i = arrayDouble.length - 1; i >= 0; i--) {
            if (i == 0) {
                System.out.println(arrayDouble[i]);
            } else {
                System.out.print(arrayDouble[i] + ", ");
            }
        }
        for (int i = arrayChar.length - 1; i >= 0; i--) {
            if (i == 0) {
                System.out.println(arrayChar[i]);
            } else {
                System.out.print(arrayChar[i] + ", ");
            }
        }
        System.out.println("Четвёртое задание. Нечётные числа сделать чётными");
        System.out.println("Исходный массив");
        for (int i = 0; i < arrayInt.length; i++) {
            if (i == arrayInt.length - 1) {
                System.out.println(arrayInt[i]);
            } else {
                System.out.print(arrayInt[i] + ", ");
            }
        }
        System.out.println("Новый массив");
        for (int i = 0; i < arrayInt.length; i++) {
            if (arrayInt[i] % 2 == 1) {
                arrayInt[i]++;
            }
            if (i == arrayInt.length - 1) {
                System.out.println(arrayInt[i]);
            } else {
                System.out.print(arrayInt[i] + ", ");
            }
        }
    }
}
