package learnjava;
import java.util.Scanner;

public class MathClass {

    public static void main(String[] args) {
        
        double a, b, c;

        Scanner scanner = new Scanner(System.in);

        System.out.print("input the value for a: ");
        a = scanner.nextDouble();
        System.out.print("input the value for b: ");
        b = scanner.nextDouble();

        c = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));

        System.out.println("the result for the hypotenuse is: " + c);

        scanner.close();

    }
    
}
