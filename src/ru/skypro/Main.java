package ru.skypro;

public class Main {
    public static void main(String[] args) {
        Task1();
        Task2();
        Task3();
        Task4();
        Task5();
    }

    public static void Task1() {
        System.out.println("Первое задание. Числа");
        int i = 1;
        while (i <= 10) {
            System.out.print(i + " ");
            i++;
        }
        System.out.println();
        for (i--; i >= 1; i--) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void Task2() {
        System.out.println("Второе задание. Пятница - отчётный день");
        int Friday = 1;
        int DaysinMonth = 31;
        for (int i = Friday; i <= DaysinMonth; i += 7) {
            System.out.println("Сегодня пятница, " + i + " число. Необходимо подготовить отчёт");
        }
    }
    public static void Task3() {
        System.out.println("Третье задание. Прилёт кометы");
        int currentYear = 2021;
        int startCalculationYear = currentYear - 200;
        int finishCalculationYear = currentYear + 100;
        for (int i = 0; i <= finishCalculationYear; i += 79) {
            if (i >= startCalculationYear) {
                System.out.println(i);
            }
        }
    }

    public static void Task4() {
        System.out.println("Задание 4 (усложнённое). Числа с остатком");
        for (int i = 1; i <= 30; i++) {
            if (i % 3 == 0 && i % 5 == 0)
                System.out.println(i + ": ping pong");
            else if (i % 3 == 0) {
                System.out.println(i + ": ping");
            } else if (i % 5 == 0) {
                System.out.println(i + ": pong");
            } else {
                System.out.println(i + ":");
            }
        }
    }

    public static void Task5() {
        System.out.println("Задание 5 (усложнённое). Числа Фибоначчи");
        int Start = 0;
        int Second = 1;
        System.out.print(Start + " " + Second + " ");
        for (int i = 1; i <= 10; i++) {
            if (i == 1 || i == 2) {
                continue;
            } else {
                int Temp = Second;
                Second = Second + Start;
                Start = Temp;
                System.out.print(Second + " ");
            }

        }
    }
}
