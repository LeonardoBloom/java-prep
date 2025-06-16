public class Main {

    public static void main(String[] args) {

        /*
        getter & setter methods:
            They help protect object data and add rules for accessing or modifying variables
            GETTERS = methods that make a field readable
            SETTERS = methods that make a field writeable
         */

        Car car = new Car("Mustang", "Silver", 30_000);

        car.setColor("Blue");
        car.setPrice(-20_000);

        System.out.println(car.getColor() + " " + car.getModel() + " " + car.getPrice());

    }
}
