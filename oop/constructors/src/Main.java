public class Main {

    public static void main(String[] args) {

        /*
        *   Constructor = a special method to initialize objects
        *                   you can pass arguments to a constructor
        *                   and set up initial values
        *
        *   Overloaded Constructors = Allow a class to have multiple constructors
        *                               with different parameter lists.
        *                               Enable objects to be initialized in various ways.
        *
        * */

        Student student1 = new Student("Bobers", 30, 3.2);
        Student student2 = new Student("Patty", 34, 1.5);

        // overloaded constructor
        Student student3 = new Student(false);

        System.out.println(student1.name);
        System.out.println(student1.age);
        System.out.println(student1.gpa);
        System.out.println(student1.isEnrolled);
        student1.study();
        
        System.out.println(student2.name);
        System.out.println(student2.age);
        System.out.println(student2.gpa);
        System.out.println(student2.isEnrolled);
        student2.study();

        System.out.println("A student3 " + student3.studies);

    }

}
