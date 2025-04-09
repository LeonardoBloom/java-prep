package learnjava;
import java.util.Scanner;

public class UserInput2 {
    
public static void main(String[] args) {
    // area of triangelle

    double width = 0;
    double height = 0;
    double area = 0;

    Scanner scanner = new Scanner(System.in);

    System.out.print("enter the width ");
    width = scanner.nextDouble();

    System.out.print("enter the height ");
    height = scanner.nextDouble();



    area = height * width;
    System.out.println("area is " + area);


    scanner.close();
}

}
