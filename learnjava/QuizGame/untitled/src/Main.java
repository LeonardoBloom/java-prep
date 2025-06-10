import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // QUESTIONS array []
        // OPTIONS array [][]
        /*
        * DECLARE VARIABLES
        * WELCOME MESSAGE
        * QUESTION (loop)
        *   options
        *   get guess from user
        *   check your guess
        *
        *  DISPLAY FINAL SCORE
        *
        * */



        String[] questions = {"What is the main function of a router?",
                                "Which part of the computer is considered the brain?",
                                "What year was FaceBook launched?",
                                "Who is the father of computers?",
                                "What was the first programming language?"};

        String[][] options = {{"1. Storing Files", "2. Encrypting Data", "3. Directing Internet traffic"},
                              {"1. CPU","2. Hard Drive","3. RAM","4. GPU"},
                              {"1. 2000","2. 2004","3. 2006","4. 2008"},
                              {"1. Steve Jobs","2. Bill Gates","3. Alan Turing","4. Charles Babbage"},
                              {"1. COBOL","2. C","3. Fortran","4. Assembly"}};

        int[] answers = {3, 1, 2, 4, 3};
        int score = 0;
        int guess;

        Scanner scanner = new Scanner(System.in);

        System.out.println("************************************************");
        System.out.println("Welcome to Java Quiz ! !");
        System.out.println("************************************************");

        for (int i = 0; i < questions.length; i++) {
            System.out.println(questions[i]);

            for(String option: options[i]) {
                System.out.println(option);
            }

            guess = scanner.nextInt();

            if (guess == answers[i]) {
                System.out.println("*********");
                System.out.println("! CORRECT !");
                System.out.println("*********");
                score++;

            } else {
                System.out.println("*********");
                System.out.println("X WRONG X");
                System.out.println("*********");
            }

        }

        System.out.println("Your final score is: " + score + " out of " + questions.length);

        scanner.close();

    }


}

