package learnjava;
import java.util.Random;

public class RandomNumbers {
    public static void main(String[] args) {

        Random random = new Random();

        Double number1;
        int number2;
        int number3;

        boolean isHeads;
        
        // generates a number between 0 and 1
        number1 = random.nextDouble();
        
        number2 = random.nextInt(1, 7);
        number3 = random.nextInt(1, 101);

        isHeads = random.nextBoolean();


        System.out.println(number1);
        System.out.println(number2);
        System.out.println(number3);

        if(isHeads) {
            System.out.println("HEADS");
        } else {
            System.out.println("TAILS");
        }
        
    }
}