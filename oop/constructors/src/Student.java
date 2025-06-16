public class Student {

    String name;
    int age;
    double gpa;
    boolean isEnrolled;
    boolean studies;

    Student(String name, int age, double gpa) {
        this.name = name;
        this.age = age;
        this.gpa = gpa;
        this.isEnrolled = true;
    }

    Student(boolean studies) {
        this.studies = studies;
    }

    void study() {
        System.out.println(this.name + " is Studying...");
    }


}
