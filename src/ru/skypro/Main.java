package ru.skypro;

public class Main {
    public static void main(String[] args) {
        Task1();
        Task2();
        Task3();
    }
    public static void Task1()
    {
        System.out.println("Первое задание. Числа");
        int i = 1;
        while (i<=10)
        {
            System.out.print(i+" ");
            i++;
        }
        System.out.println();
        for(i--;i>=1;i--)
        {
            System.out.print(i+" ");
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
    public static void Task3(){
        System.out.println("Третье задание. Прилёт кометы");
        int currentYear = 2021;
        int startCalculationYear = currentYear-200;
        int finishCalculationYear = currentYear+100;
        for (int i = 0;i<=finishCalculationYear;i+=79) {
            if (i >= startCalculationYear) {
                System.out.println(i);
            }
        }
    }
}
