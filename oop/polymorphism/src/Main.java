public class Main {

    public static void main(String[] args) {
        /*
        * Polymorphism = "Poly" = "Many"
        *                "Morph" = "Shape"
        *                Objects can identify as other objects as well as itself.
        *                Objects can be treated as objects of a common superclass.
        *
        * */

        Car car = new Car();
        Bike bike = new Bike();
        Boat boat = new Boat();

        Vehicle[] vehicles = {car, bike, boat};

        for (Vehicle vehicle: vehicles) {
            vehicle.go();
        }
    }
}
