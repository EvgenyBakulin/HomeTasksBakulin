package ru.skypro;

public class Main {

    public static void main(String[] args) {
        Car car = new Car();
        Car car2 = new Car();
        car.setModelName("car1");
        car2.setModelName("car2");
        car.setWheelsCount(4);
        car2.setWheelsCount(4);

        Truck truck = new Truck();
        Truck truck2 = new Truck();
        truck.setModelName("truck1");
        truck2.setModelName("truck2");
        truck.setWheelsCount(6);
        truck2.setWheelsCount(8);

        Bicycle bicycle = new Bicycle();
        Bicycle bicycle2 = new Bicycle();
        bicycle.setModelName("bycicle1");
        bicycle2.setModelName("bycicle2");
        bicycle.setWheelsCount(2);
        bicycle2.setWheelsCount(2);

        ServiseStation station = new ServiseStation();
        station.check(car, null, null);
        station.check(car2, null, null);
        station.check(null, bicycle, null);
        station.check(null, bicycle2, null);
        station.check(null, null, truck);
        station.check(null, null, truck2);
    }
}
