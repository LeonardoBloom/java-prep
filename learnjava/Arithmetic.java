package learnjava;
import java.util.Scanner;

public class Arithmetic {
    
    public static void main(String[] args) {
        double x = 10;
        double y = 3;

        double z = y / x;

        System.out.println("z is: " + z);

        Scanner scanner = new Scanner(System.in);

        String item;
        Double price;
        int quantity ;
        char currency = '€';
        double total;

        System.out.print("what are u buying ma nigga? ");
        item = scanner.nextLine();

        System.out.print("what is the price for it ma nigga? ");
        price = scanner.nextDouble();

        System.out.print("how many " + item + "s would you like? ");
        quantity = scanner.nextInt();

        total = quantity * price;
        System.out.println("okay it's " + currency + total);

        scanner.close();

    }

}
