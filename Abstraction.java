import java.io.PrintStream;

interface Engine {
    void startEngine();
    void stopEngine();
}

abstract class Vehicle {
    String info;
    static PrintStream o = System.out;

    public Vehicle(String info) {
        this.info = info;
    }

    abstract void drive();

    public void displayInfo() {
        o.println("Info: " + info);
    }
}

class Car extends Vehicle implements Engine {
    int year;

    public Car(String brand, int year) {
        super(brand);
        this.year = year;
    }

    @Override
    public void startEngine() {
        o.println("Car engine started.");
    }

    @Override
    public void stopEngine() {
        o.println("Car engine stopped.");
    }

    @Override
    void drive() {
        o.println("Driving a car.");
    }

    @Override
    public void displayInfo() {
        o.println("Car Brand: " + info + ", Year: " + year);
    }
}

class Bike extends Vehicle implements Engine {
    int year;

    public Bike(String brand, int year) {
        super(brand);
        this.year = year;
    }

    @Override
    public void startEngine() {
        o.println("Bike engine started.");
    }

    @Override
    public void stopEngine() {
        o.println("Bike engine stopped.");
    }

    @Override
    void drive() {
        o.println("Riding a bike.");
    }

    @Override
    public void displayInfo() {
        o.println("Bike Brand: " + info + ", Year: " + year);
    }
}

class Boat extends Vehicle implements Engine {
    int capacity;

    public Boat(String type, int capacity) {
        super(type);
        this.capacity = capacity;
    }

    @Override
    public void startEngine() {
        o.println("Boat engine started.");
    }

    @Override
    public void stopEngine() {
        o.println("Boat engine stopped.");
    }

    @Override
    void drive() {
        o.println("Sailing a boat.");
    }

    @Override
    public void displayInfo() {
        o.println("Boat Type: " + info + ", Capacity: " + capacity + " persons");
    }
}

public class TestVehicle {
    public static void main(String[] args) {
        PrintStream o = System.out;

        Vehicle car = new Car("Toyota", 2022);
        car.displayInfo();
        ((Engine) car).startEngine();
        car.drive();
        ((Engine) car).stopEngine();

        o.println();

        Vehicle bike = new Bike("Yamaha", 2023);
        bike.displayInfo();
        ((Engine) bike).startEngine();
        bike.drive();
        ((Engine) bike).stopEngine();

        o.println();

        Vehicle boat = new Boat("Fishing", 8);
        boat.displayInfo();
        ((Engine) boat).startEngine();
        boat.drive();
        ((Engine) boat).stopEngine();
    }
}
