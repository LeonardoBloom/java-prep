public class Main {

    public static void main(String[] args) {
        /*
        *   Super = refers to the parent class (subclass <- superclass)
        *           used in constructors and method overriding
        *           Calls the parent constructor to initialize attributes.
        *  */

        Person person = new Person("John", "Appleseed");
        Student student = new Student("Amy", "Hennig", 3.8);
        Employee employee = new Employee("Mark", "Cuban", 300_000);

        person.showName();
        student.showName();
        student.showGPA();

        employee.showSalary();
    }
}
