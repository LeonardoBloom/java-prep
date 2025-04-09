import java.util.*;

// Methods:
// .pop()

/* Methods:
 * .push()
 * .pop()
 * .peek()
 * .empty()
 * .search()
*/


public class Stacks {
    
    public static void main(String[] args) {
        
        Stack<String> stack = new Stack<String>();

        stack.push("Minecraft");
        stack.push("Skyrim");
        stack.push("DOOM");
        stack.push("Borderlands");
        stack.push("FFVII");

        stack.pop();

        String myFavorite = stack.pop();
        

        // System.out.println(stack);
        // System.out.println(myFavorite);
        // System.out.println(stack.peek());
        // System.out.println(stack);

        System.out.println(stack.search("DOOM"));

        for(int i = 0; i < 10; i++) {
            stack.push("Fallout76");
        }

        System.out.println(stack );


    }

}
