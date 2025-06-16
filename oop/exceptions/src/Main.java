import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        // using scanner here closes the scanner once it is done
        try (Scanner scanner = new Scanner(System.in);) {
            System.out.println("Enter a number");
            int number = scanner.nextInt();
            System.out.println(number);
        }
        catch(InputMismatchException e) {
            System.out.println("That shi is not a numbar my nigga");
        }
        catch (ArithmeticException e) {
            System.out.println("you cannot do that");
        }
        catch (Exception e) {
            // safety net
            System.out.println("something went wrong");
        }
        finally {
            System.out.println("This always exeecutes");
        }


    }
}
