package learnjava;
import java.util.Scanner;

public class Switches {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String day;

        System.out.println("What day do ya want?");
        day = scanner.nextLine();


        switch(day) {
            case "Monday", "Tuesday", "Wednesday", "Thursday", "Friday" -> System.out.println("Weekday bruh");
            case "Saturday", "Sunday" -> System.out.println("Weekend yayyy");
            default -> System.out.println("does not exist");
        }



    }
}