package learnjava;
import java.util.Scanner;

public class EX_Compound {

    public static void main(String[] args) {

        // Compound Interest Calc

        Scanner scanner = new Scanner(System.in);

        double principal;
        double interest;
        int timesCompounded;
        int years;

        double amount;

        System.out.print("input Principal: ");
        principal = scanner.nextDouble();
        System.out.print("input interest: ");
        interest = scanner.nextDouble() / 100;
        System.out.print("input compounded: ");
        timesCompounded = scanner.nextInt();
        System.out.print("input time: ");
        years = scanner.nextInt();

        amount = principal * Math.pow((1 + (interest/timesCompounded)), (years*timesCompounded));

        System.out.printf("The amount after %d year is %.2f", years, amount);

        scanner.close();

    }


}