package ru.skypro;

public class Main {

    public static void main(String[] args) {
	  Task1();
      Task2();
      Task3();
      Task4();
      Task5();
    }
    public static void Task1(){
        System.out.println("Первое задание. Операционные системы");
        byte clientOS = 1;
        if (clientOS==0)
            System.out.println("Установите версию приложения для iOS по ссылке");
        else
            System.out.println("Установите версию приложения для Android по ссылке");

    }
    public static void Task2(){
        System.out.println("Второе задание. Операционные системы и год выпуска");
        byte clientOS = 1;
        short ClientDeviceYear = 2015;
        if (clientOS==0&&ClientDeviceYear<2015)
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        else if(clientOS==0&&ClientDeviceYear>=2015)
                System.out.println("Установите версию приложения для iOS по ссылке");
        else if (clientOS==1&&ClientDeviceYear<2015)
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        else if(clientOS==1&&ClientDeviceYear>=2015)
        System.out.println("Установите версию приложения для Android по ссылке");
    }
    public static void Task3(){
        System.out.println("Задание 3. Високосный год");
        short Year=2021;
        if ((Year%4!=0) || ((Year%100==0)&&(Year%400!=0)))
            System.out.println("Год не является високосным");
        else
            System.out.println("Год является високосным");
    }
    public static void Task4() {
        System.out.println("Задание 4. Доставка");
        short DeliveryDistance = 95;
        short Days=0;
        if (DeliveryDistance>0&&DeliveryDistance<=20)
            Days+=1;
        else if(DeliveryDistance>20&&DeliveryDistance<=60)
            Days+=2;
        else if(DeliveryDistance>60&&DeliveryDistance<=100)
            Days+=3;
        System.out.println("Потребуется дней: "+Days);
    }
    public static void Task5(){
        System.out.println("Задание 5. Времена года");
        byte MonthNumber = 12;
        switch (MonthNumber)
        {
            case 12:
            case 1:
            case 2:
            {
                System.out.println("Это зимний месяц");
                break;
            }
            case 3:
            case 4:
            case 5:
            {
                System.out.println("Это весенний месяц");
                break;
            }
            case 6:
            case 7:
            case 8:
            {
                System.out.println("Это летний месяц");
                break;
            }
            case 9:
            case 10:
            case 11:
            {
                System.out.println("Это осенний месяц");
                break;
            }
            default: {
                System.out.println("Месяца с таким номером нет");
                break;
            }
        }
    }
}
