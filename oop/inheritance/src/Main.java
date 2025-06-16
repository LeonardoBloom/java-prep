public class Main {

    public static void main(String[] args) {

        /*
        *   Inheritance = one class inherits the attributes and methods
        *                   from another class.
        *                   Child <- Parent <-- Grandparent
        * */

        Dog dog = new Dog();
        Cat cat = new Cat();
        Plant plant = new Plant();

        System.out.println(dog.isAlive);
        System.out.println(cat.isAlive);

        dog.eat();
        cat.eat();

        System.out.println(dog.lives);
        System.out.println(cat.lives);

        dog.speak();
        cat.speak();

        plant.photosynthesize();

    }
}
