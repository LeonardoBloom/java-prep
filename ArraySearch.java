import java.util.Scanner;

public class ArraySearch {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int[] numbers = {1, 9, 2, 8, 3, 5, 4};
        String[] fruits = {"apple", "orange", "banana"};
        boolean isFound = false;
        String target;

        System.out.println("Enter a fruit to search for: ");
        target = scanner.nextLine();

        
        for(int i = 0; i < fruits.length; i++) {
            if(fruits[i].equals(target)) {
                System.out.println("\nElement found at index " + i);
                isFound = true;
                break;
            }
        }

        if(!isFound) {
            System.out.println("\ntarget not found bruh");
        }

        scanner.close();

    }
    
}
