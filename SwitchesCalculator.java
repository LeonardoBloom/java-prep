import java.util.Scanner;

public class SwitchesCalculator {
    
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

    double input1;
    double input2;
    double result = 0;

    char operator;

    boolean validOperation = true;

    System.out.print("Enter the first number: ");
    input1 = scanner.nextDouble();

    System.out.print("Enter an operator (+, -, *, /, ^): ");
    operator = scanner.next().charAt(0);

    System.out.print("Enter the second number: ");
    input2 = scanner.nextDouble();

    switch(operator) {
        case '+' -> result = input1 + input2 ;
        case '-' -> result = input1 - input2 ;
        case '*' -> result = input1 * input2 ;
        case '/' -> { if(input2 == 0) {
             System.out.println("cannot divide by 0");
             validOperation = false;
            } else {
            result = input1 / input2 ;
             } 
            }
        case '^' -> result = Math.pow(input1, input2) ;

        default -> {
            System.out.println("Invalid Operator!");
            validOperation = false;
        }
    }

    if (validOperation) {
        System.out.println("The result is: " + result);

    }


    scanner.close();
    }


}
