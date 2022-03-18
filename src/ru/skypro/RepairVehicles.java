package ru.skypro;

public interface RepairVehicles {

    default public void updateTyre() {
        System.out.println("Колёса отстутствуют");
    }

    default public void checkEngine() {
        System.out.println("Двигатель отсутствует");
    }

    default public void checkTrailer() {
        System.out.println("Прицеп отсутствует");
    }
}
