package exp7new;

class Vehicle {
    String make;
    String model;

    void startEngine() {
        System.out.println("Engine started.");
    }

    void stopEngine() {
        System.out.println("Engine stopped.");
    }
}

class Car extends Vehicle {
    int numDoors;

    void drive() {
        System.out.println("Car is in motion.");
    }
}

public class VehicleCar {
    public static void main(String[] args) {
        Car car = new Car();
        car.make = "Ford";
        car.model = "Mustang";
        car.numDoors = 2;
        car.startEngine();
        car.drive();
        car.stopEngine();
    }
}