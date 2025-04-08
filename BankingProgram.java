import java.util.Scanner;

public class BankingProgram {

    static double Balance = 0;
    
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int userInput;
        double amount;
        boolean isRunning = true;

        while(isRunning) {
            System.out.println("********************");
            System.out.println("BANKING PROGRAM");
            System.out.println("********************");
            System.out.println("1. Show Balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Exit");
            System.out.println("********************");
    
            userInput = scanner.nextInt();
    
            switch(userInput) {
                case 1 -> showBalance();
                case 2 -> {
                    System.out.println("How much would you like to deposit?");
                    amount = scanner.nextDouble();
                    if (amount < 0) {
                        System.out.println("you cannot deposit a negative amount");
                    } else {
                        deposit(amount);

                    }
                }
                case 3 -> {
                    System.out.println("How much would you like to withdraw?");
                    amount = scanner.nextDouble();
                    if (amount < 0) {
                        System.out.println("you cannot withdraw a negative amount");
                    } else if (amount > Balance) {
                        System.out.println("Insufficient funds for that lole");
                    } else {
                        
                        withdraw(amount);
                    }
                }
                case 4 -> isRunning = false;
                default -> System.out.println("Invalid choice of words bub");
            }

        }

        scanner.close();

    }  

    static void showBalance() {
        System.out.printf("Your Balance is: $%.2f\n", Balance);
    }

    static void deposit(double amount) {
        Balance += amount;
        System.out.printf("You have deposited $%.2f\n", amount);
        System.out.println("Your new Balance is: $" + Balance);
    }

    static void withdraw(double amount) {
        Balance -= amount;
        System.out.printf("You have withdrawn $%.2f\n", amount);
        System.out.println("Your new Balance is: $" + Balance);
    }

}
