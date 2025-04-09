package learnjava;
import java.util.Scanner;

public class WeightConversion {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // declare variables
        int choice;
        double lbs;
        double kgs;
        double result;

        //welcome message
        System.out.println("Weight Conversion Programmer");
        System.out.println("1: Convert lbs to  kgs");
        System.out.println("2: Convert kgs to lbs");

        // prompt for choice
        System.out.println("Choose an option:");
        choice = scanner.nextInt();

        // option 1 choice: lbs -> kgs
        if (choice == 1) {
            System.out.println("How many lbs would you like to convert to kgs?");
            lbs = scanner.nextDouble();

            result = lbs * 0.453592;

            System.out.printf("%.2f lbs is equivalent to %.2f kg", lbs, result);


        } 
        // choice 2: convert kgs -> lbs
        else if (choice == 2) {
            System.out.println("How many kg would you like to convert to lbs?");
            kgs = scanner.nextDouble();

            result = kgs * 2.20462;

            System.out.printf("%.2f kgs is equivalent to %.2f lbs", kgs, result);
            
        } 
        // no valid choice made
        else {
            System.out.println("Yeah error my guy");
        }

        scanner.close();


    }
    
}
