public class Multidimensional {

    public static void main(String[] args) {
        
        // String[] fruits = {"apple", "orange", "banana"};
        // String[] vegetables = {"potato", "onion", "carrot"};
        // String[] meats = {"chicken", "pork", "beef", "fish"};

        String[][] groceries = {{"apple", "orange", "banana"},
                                {"potato", "onion", "carrot"},
                                {"chicken", "pork", "beef", "fish"}};

        groceries[2][1] = "eggs";

        System.out.println("\n");
        for(String[] foods: groceries) {
            for(String food: foods) {
                System.out.print(food + " ");
            }           
            System.out.println("");
        }

    }
    
}
