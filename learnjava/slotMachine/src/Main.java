import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        // JAVA SLOT MACHINE

        // declare vars
        /*
        * display welcome
        * play if balance > 0
        * enter bet amount
        *       verify if bet > balance
        *       verify if bet > 0
        *       subtract bet from balance
        * spin row
        * print row
        * get payout
        * ask to play again
        * display exit message
        * */

        Scanner scanner = new Scanner(System.in);

        int balance = 100;
        int bet;
        int payout;
        String playAgain;

        String[] row = {};

        System.out.println("*****************************");
        System.out.println("Welcome to the Slot Machine");
        System.out.println("Symbols: 🍒 🍉 🍋 🔔 ⭐ ");
        System.out.println("*****************************");

        while (balance > 0) {

            System.out.println("Current Balance: $" + balance);
            System.out.print("Place your bet amount: ");
            bet = scanner.nextInt();
            scanner.nextLine();

            if (bet > balance) {
                System.out.println("Insufficient Funds");
                continue;
            } else if (bet <= 0) {
                System.out.println("Bet must be greater than 0");
            } else {
                balance -= bet;
            }

            System.out.println("Spinning...");
            row = spinRow();
            printRow(row);
            payout = getPayout(row, bet);

            if(payout > 0) {
                System.out.println("You WON $" + payout);
                balance += payout;
            } else {
                System.out.println("tough luck bud");
            }
            System.out.println("Do you want to play again? (y/n): ");
            playAgain = scanner.nextLine().toLowerCase();

            if(!playAgain.equals("y")) {
                break;
            }
        }

        System.out.println("Going out!!");
        System.out.println("YOU CASHED OUT: $" + balance);


        scanner.close();

    }

    static String[] spinRow() {

        String[] symbols = {"🍒",  "🍉", "🍋", "🔔", "⭐"};
        String[] row = new String[3];

        Random random = new Random();

        for(int i = 0; i < 3; i++) {
            row[i] = symbols[random.nextInt(5)];
        }

        return row;
    }

    static void printRow(String[] row) {
        System.out.println("********************");
        System.out.println(" " + String.join(" | ", row) + " ");
        System.out.println("********************");

    }

    static int getPayout(String[] row, int bet) {

        if(row[0].equals(row[1]) && row[1].equals(row[2])) {
            return switch(row[0]) {
                case "🍒" -> bet * 3;
                case "🍉" -> bet * 4;
                case "🍋" -> bet * 5;
                case "🔔" -> bet * 10;
                case "⭐" -> bet * 20;
                default -> 0;
            };
        } else if(row[0].equals(row[1])) {
            return switch(row[0]) {
                case "🍒" -> bet * 2;
                case "🍉" -> bet * 3;
                case "🍋" -> bet * 4;
                case "🔔" -> bet * 5;
                case "⭐" -> bet * 10;
                default -> 0;
            };
        } else if(row[1].equals(row[2])) {
            return switch(row[0]) {
                case "🍒" -> bet * 2;
                case "🍉" -> bet * 3;
                case "🍋" -> bet * 4;
                case "🔔" -> bet * 5;
                case "⭐" -> bet * 10;
                default -> 0;
            };
        }
        return 0;
    }
}