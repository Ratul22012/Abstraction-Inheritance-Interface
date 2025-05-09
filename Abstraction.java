import java.io.PrintStream; // needed when you want to create or use a PrintStream object explicitly

//Interface: Defines engine behaviour that all vehicles must implement for startEngine and endEngine method

interface Engine {
    PrintStream o = System.out;
    void startEngine();
    void endEngine();
}

//abstract class: Serves as a base class for all vehicles
abstract class Vehicle {
    String brand;
    int year;
//Constructor: To set values of brand and year since same variable is used for instantiation this keyword used as a reference
    public Vehicle(String brand, int year) {
        this.brand = brand;
        this.year = year;
    }

//Abstract method: Must be implemented by all subclasses.Abstract methods don't print anything
    abstract void drive();
//Concrete method: Shared behaviour for all vehicles
    public void displayInfo() {
        Engine.o.println("Brand: " + brand + ", Year: " + year);
    }
}

//Subclass: Car is inherited from Vehicle that implement the interface Engine
class Car extends Vehicle implements Engine
{
    //Constructor: Calls superclass constructor that sets brand and year
    public Car(String brand, int year) {
        super(brand, year);
    }

    //Override: instructs the compiler that you intend to override a method in the superclass
    @Override
    // startEngine: implements startEngine method from Engine interface
    public void startEngine() {
        o.println("Car Engine is starting...");
    }

    @Override
    //endEngine: implements endEngine method from Engine interface
    public void endEngine() {
        o.println("Car Engine is ending...");
    }

    @Override
    //Drive: Implements abstract drive method from Vehicle class
    public void drive() {
        o.println("Car is being driving...");
    }
}

//Subclass: Bike is inherited from Vehicle that implement the interface Engine
class Bike extends Vehicle implements Engine
{
    //Constructor: Calls superclass constructor that sets brand and year
    public Bike(String brand, int year) {

        super(brand, year);
    }

    @Override
    // startEngine: implements startEngine method from Engine interface
    public void startEngine() {
        o.println("Bike Engine is starting...");
    }
    @Override
    // endEngine: implements endEngine method from Engine interface
    public void endEngine() {
        o.println("Bike Engine is ending...");
    }
    @Override
    //Drive: Implements abstract drive method from Vehicle class
    public void drive() {
        o.println("Bike is being driving...");
    }
}

////Subclass: Boat is inherited from Vehicle that implement the interface Engine
class Boat extends Vehicle implements Engine
{
    //Constructor: Calls superclass constructor that sets brand and year
    public Boat(String brand, int year) {

        super(brand, year);
    }

    @Override
    // startEngine: implements startEngine method from Engine interface
    public void startEngine() {
        o.println("Boat Engine is starting...");
    }

    @Override
    // endEngine: implements endEngine method from Engine interface
    public void endEngine() {
        o.println("Boat Engine is ending...");
    }

    @Override
    //Drive: Implements abstract drive method from Vehicle class
    public void drive() {
        o.println("Boat is being sailing...");
    }
}

public class Abstraction
{
    public static void main(String[] args) {

        Engine.o.println("I am Md.Atif Rahman Rudro.My ID is IT:22002");
        Engine.o.println();

        // Create a Car object using a Vehicle reference (polymorphism)
        Vehicle car = new Car("X-Corolla", 2002);
        car.displayInfo(); // Calls concrete method from Vehicle
        ((Engine) car).startEngine(); // Cast to Engine to access startEngine
        car.drive(); // Calls overridden drive method in Car
        ((Engine) car).endEngine(); // Cast to Engine to access stopEngine
        Engine.o.println(); //Just a line break

        // Create a Bike object using a Vehicle reference (polymorphism)
        Vehicle bike = new Bike("Hero-Honda", 2001);
        bike.displayInfo(); // Calls concrete method from Vehicle
        ((Engine) bike).startEngine(); // Cast to Engine to access startEngine
        bike.drive(); // Calls overridden drive method in bike
        ((Engine) bike).endEngine(); // Cast to Engine to access stopEngine
        Engine.o.println(); //Just a line break

        // Create a Boat object using a Vehicle reference (polymorphism)
        Vehicle boat = new Boat("Osprey", 2022);
        boat.displayInfo(); //Calls concrete method from Vehicle
        ((Engine) boat).startEngine(); // Cast to Engine to access startEngine
        boat.drive(); // Calls overridden drive method in Boat
        ((Engine) boat).endEngine(); // Cast to Engine to access stopEngine
    }
}
