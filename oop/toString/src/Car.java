public class Car {

    String make;
    String model;
    int year;
    String color;

    Car(String make, String model, int year, String color) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.color = color;
    }

    @Override // this overrides the usual toString method for objects in java
    public String toString() {
        return this.color + " " + this.year + " " + this.make + " " + this.model;
    }

}
