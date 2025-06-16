import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

//        ArrayList = a  resizeable array that stores objects (autoboxing).
//                    Arrays are fixed in size, but ArrayLists can change.

        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<String> fruits = new ArrayList<>();

        list.add(3);
        list.add(1);
        list.add(2);

        fruits.add("Apple");
        fruits.add("Orange");
        fruits.add("Banana");
        fruits.add("Coconuts");

//        System.out.println(fruits);

//        fruits.remove(0);
//        fruits.set(1, "Melon");
//        System.out.println(fruits.get(2));
//        System.out.println(fruits.size());

//        Collections.sort(fruits);
//
//        System.out.println(fruits);

        Scanner scanner = new Scanner(System.in);

        ArrayList<String> foods = new ArrayList<>();

        System.out.println("foods: " + foods);
        System.out.println("Enter the # of foods you want:");
        int numOfFoods = scanner.nextInt();
        scanner.nextLine();

        for (int i = 1; i <= numOfFoods; i++) {
            System.out.println("Enter food " + i + ": ");
            foods.add(scanner.nextLine());
        }

        System.out.println("new foods: " + foods);




        scanner.close();

    }
}
