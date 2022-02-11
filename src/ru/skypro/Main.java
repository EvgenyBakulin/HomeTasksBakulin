package ru.skypro;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] arr = generateRandomArray();
        /*Выведем для удобства массив в табличку по 10 значений в строке*/
        for (int i = 0; i < arr.length; i++) {
            if ((i + 1) % 10 == 0) {
                System.out.println(arr[i]);
            } else {
                System.out.print(arr[i] + " ");
            }
        }
        task1(arr);
        task2(arr);
        task3(arr);
        task4();
        task5();
        task6();
        task7();
        task8();
        task9();
    }

    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }

    public static void task1(int[] arr) {
        System.out.println("Первое задание. Найдём общую сумму за месяц");
        int commonMonthSum = 0;
        for (final int daySum : arr) {
            commonMonthSum += daySum;
        }
        System.out.println("Общие выплаты за месяц составляют " + commonMonthSum + " рублей");
    }

    public static void task2(int[] arr) {
        System.out.println("Второе задание. Найдём максимальную и минимальную трату");
        int minExpense = arr[0];
        int maxExpense = arr[0];
        for (final int daySum : arr) {
            if (daySum < minExpense) {
                minExpense = daySum;
            }
            if (daySum > maxExpense) {
                maxExpense = daySum;
            }
        }
        System.out.println("Минимальная сумма затрат за день составила " + minExpense + " рублей");
        System.out.println("Максимальная сумма затрат за день составила " + maxExpense + " рублей");
    }

    public static void task3(int[] arr) {
        System.out.println("Третье задание. Найдём среднюю сумму трат");
        int commonMonthSum = 0;
        for (final int daySum : arr) {
            commonMonthSum += daySum;
        }
        double averageExpense = (double) commonMonthSum / arr.length;
        /*Приведем сумму к виду 2 знака после запятой*/
        System.out.println(String.format("Средняя сумма трат за месяц составила %.2f рублей", averageExpense));
    }

    public static void task4() {
        System.out.println("Четвёртое задание. Исправляем перевёрнутую фамилию");
        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        /*Будем выводить массив наоборот. Но вдруг баг спаботал не везде? Как проверить? Если баг сработал,
        то последний символ в массиве всегда будет в верхнем регистре. Если это так, выведем массив наоборот, а если
        не так, то пусть выведется как есть - значит ФИО не перевернулись*/
        if (Character.isUpperCase(reverseFullName[reverseFullName.length - 1])) {
            for (int i = 0; i < reverseFullName.length; i++) {
                System.out.print(reverseFullName[reverseFullName.length - 1 - i]);
            }
            System.out.println();
        } else {
            for (final char letter : reverseFullName) {
                System.out.print(letter);
            }
            System.out.println();
        }
    }

    public static void task5() {
        System.out.println("Пятое задание. Матрица с единичками по диагоналям");
        int[][] matrixArray = new int[3][3];
        for (int i = 0; i < matrixArray.length; i++) {
            for (int j = 0; j < matrixArray[i].length; j++) {
                if ((j == i) || (j == matrixArray[i].length - 1 - i)) {
                    matrixArray[i][j] = 1;
                } else {
                    matrixArray[i][j] = 0;
                }
            }
        }
        for (int[] row : matrixArray) {
            for (int column : row) {
                System.out.print(column + " ");
            }
            System.out.println();
        }
    }

    public static void task6() {
        System.out.println("Шестое задание. Вернуть верный массив с помошью другого массива");
        int[] wrongArr = {5, 4, 3, 2, 1};
        System.out.println(Arrays.toString(wrongArr));
        int[] tempArr = new int[wrongArr.length];
        for (int i = 0; i < tempArr.length; i++) {
            tempArr[i] = wrongArr[wrongArr.length - 1 - i];
        }
        for (int i = 0; i < wrongArr.length; i++) {
            wrongArr[i] = tempArr[i];
        }
        System.out.print(Arrays.toString(wrongArr));
        System.out.println();
    }

    public static void task7() {
        System.out.println("Седьмое задание. Перевернуть массив без помощи другого массива");
        int[] wrongArr = {5, 4, 3, 2, 1};
        System.out.println(Arrays.toString(wrongArr));
        for (int i = 0; i < wrongArr.length / 2; i++) {
            int temp = wrongArr[i];
            wrongArr[i] = wrongArr[wrongArr.length - 1 - i];
            wrongArr[wrongArr.length - 1 - i] = temp;
        }
        System.out.println(Arrays.toString(wrongArr));
    }

    public static void task8() {
        System.out.println("Восьмое задание. Пара чисел с суммой -2");
        int[] array = {-6, 2, 5, -8, 8, 10, 4, -7, 12, 1};
        System.out.print(Arrays.toString(array));
        System.out.println();
        boolean isMinusTwo = false;
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if ((array[i] + array[j]) == -2) {
                    System.out.println(array[i] + " + " + array[j] + " = -2");
                    isMinusTwo = true;
                    break;
                }
                if (isMinusTwo == true) {
                    break;
                }
            }
        }
    }

    public static void task9() {
        System.out.println("Девятое задание. Все пары чисел с суммой -2");
        int[] array = {-6, 2, 5, -8, 8, 10, 4, -7, 12, 1};
        System.out.print(Arrays.toString(array));
        System.out.println();
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if ((array[i] + array[j]) == -2) {
                    System.out.println(array[i] + " + " + array[j] + " = -2");
                }
            }
        }
    }
}
