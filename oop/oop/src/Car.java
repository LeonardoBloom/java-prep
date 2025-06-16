public class Car {

    String make = "Ford";
    String model = "Mustang";
    int year = 2025;
    double price = 58000.99;
    boolean isRunning = false;

    void start() {
        System.out.println("Starting Car...");
        isRunning = true;
    }

    void stop() {
        isRunning = false;
        System.out.println("Stopping Car...");
    }

    void drive() {
        System.out.println("Driving a " + make + " " + model + "...");
    }

    void brake() {
        System.out.println("Braking the car...");
    }

}
