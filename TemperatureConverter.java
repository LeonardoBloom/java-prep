import java.util.Scanner;

public class TemperatureConverter {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        String choice;
        double temperature;
        double fahrenheit, celcius;
        double result;

        System.out.println("Enter the temperature:");
        temperature = scanner.nextDouble();

        System.out.println("Convert to Celcius or Fahrenheit? (C of F)");
        choice = scanner.next().toUpperCase();

        result = (choice.equals("C")) ? (temperature - 32) * 5/9 : (temperature * 9 / 5) + 32;

        System.out.printf("%.2f %s", result, choice);

        scanner.close();
    }

}
