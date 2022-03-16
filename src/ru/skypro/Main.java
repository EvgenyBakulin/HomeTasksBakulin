package ru.skypro;

public class Main {

    public static void main(String[] args) {
	Slizerin drago = new Slizerin("Драго Малфой",70,47,88,99,50,55);
    Slizerin graham = new Slizerin("Грехэм Монтегю", 67,45,34,66,33,44);
    Slizerin goil = new Slizerin("Грегори Гойл",33,44,22,55,66,5);
        System.out.println(drago);
        System.out.println(graham);
        System.out.println(goil);
        Griffindor harry = new Griffindor("Гарри Поттер", 100,100,89,78,99);
        Griffindor germy = new Griffindor("Гермиона Грейнджер", 90,88,90,77,88);
        Griffindor ron = new Griffindor("Рон Уизли", 80,70,60,60,90);
        System.out.println(harry);
        System.out.println(ron);
        System.out.println(germy);
        Ravenclow chang = new Ravenclow("Чжоу Чанг",44,33,55,66,55);
        Ravenclow padma = new Ravenclow("Падма Патил",43,33,57,69,53);
        Ravenclow belby = new Ravenclow("Чжоу Чанг",30,100,66,99,60);
        System.out.println(chang);
        System.out.println(padma);
        System.out.println(belby);
        Hufflepuff smith = new Hufflepuff("Захария Смит",66,66,77,44,55);
        Hufflepuff sedrik = new Hufflepuff("Седрик Диггори",67,67,78,41,54);
        Hufflepuff filch = new Hufflepuff("Джастин Филч-Флетчли",68,67,75,40,50);
        System.out.println(smith);
        System.out.println(sedrik);
        System.out.println(filch);
        harry.compare(ron);
        drago.compare(goil);
        padma.compare(belby);
        smith.compare(sedrik);
        ron.compareCapability(drago);
        filch.compareCapability(harry);
    }
}
