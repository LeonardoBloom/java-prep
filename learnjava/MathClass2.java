package learnjava;
import java.util.Scanner;

public class MathClass2 {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        double radius, circumference, area, volume;
        

        System.out.println("Enter radius");
        radius = scanner.nextDouble();

        circumference = 2 * Math.PI * radius;
        area = Math.PI * Math.pow(radius, 2);
        volume = (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);

        System.out.printf("%.1fcm\n", circumference);
        System.out.printf("%.1fcm square\n", area);
        System.out.printf("%.1fcm cube\n", volume);
        
        // System.out.println(volume);

        scanner.close();
    }

}
