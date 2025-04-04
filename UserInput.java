import java.util.Scanner;

// how to get user input

public class UserInput {

    public static void main(String[] args) {

        // create a scanner object
        Scanner scanner = new Scanner(System.in);

        System.out.println("Hey, can you enter a name????");
        // .print will maintain the line, without jumping
        String myName = scanner.nextLine();

        System.out.println("the name is: " + myName);

        System.out.println("Now enter your age");
        int age = scanner.nextInt();

        // after inputting int, before next line, the scanner.nextLine() will read the next string; this being "\n" after hitting ENTER
        // thus, we must use scanner.nextLine(); on its own before taking the statement:
        scanner.nextLine();

        System.out.println("what do you like to do?");
        String act = scanner.nextLine();

        System.out.println(act);

        System.out.println("your age is: " + age);

        System.out.println("what is ur gpa bro hehe");
        double gpa = scanner.nextDouble();

        System.out.println("ur gpa is " + gpa);
        if (gpa < 3.0) {
            System.out.println("yeah bro just give up atp");
        } else {
            System.out.println("you are rolling my guy hehe");
        }

        scanner.close();
        // if we dont close scanner it causes some problems :P

    }
    
}
