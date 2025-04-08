import java.util.Arrays;


public class ArraysLesson {
    
    public static void main(String[] args) {

        String[] fruits = {"apple", "orange", "banana", "coconut"};

        // fruits[0] = "cherry";
        int numOfFruits = fruits.length;

        // Arrays methods
        Arrays.sort(fruits);
        Arrays.fill(fruits, "pineapple");

        // System.out.println(numOfFruits);
        for (String fruit : fruits) {
            System.out.println(fruit);
        }

    }

}
