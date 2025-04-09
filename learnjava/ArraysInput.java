package learnjava;
import java.util.Scanner;

public class ArraysInput {
    
public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);


    
    String[] foods;
    int size;
    // foods[0] = "apple" not allowed if array not "initialized"
    // foods[0] = "pizza";
    // foods[1] = "taco";
    // foods[2] = "hamburger";

    System.out.println("how much food?");
    size = scanner.nextInt();

    scanner.nextLine();

    foods = new String[size];

    for (int i = 0; i < foods.length; i++) {
        System.out.println("Enter a food");
        foods[i] = scanner.nextLine();
    }

    for(String food: foods) {
        System.out.println(food);
    }

    System.out.println(foods.length);

    scanner.close();


}


}
