public class Main {

    public static void main(String[] args) {

        Car car1 = new Car("Mustang", "Blue");
        Car car2 = new Car("Corvette", "Yellow");
        Car car3 = new Car("Charger", "Black");

        Car[] cars = {car1, car2, car3};

        System.out.println(car1.model);
        car1.drive();

        System.out.println("");

        for(Car car: cars) {
            System.out.println(car.model);
            car.drive();
        }
        System.out.println("");

        Car[] newCars = {new Car("Accent", "Blue"),
                            new Car("Prius", "Silver")};
        for(Car car: newCars) {
            car.color = "green";
            car.drive();
        }

    }

}
