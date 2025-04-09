package learnjava;
public class StringMethods {

    public static void main(String[] args) {
        
        String name = "Password";

        // different string methods:

        int length = name.length();
        // length of a string

        char letter = name.charAt(0);
        // character at index i

        int index = name.indexOf("o");
        // index of specified character

        int lastIndex = name.lastIndexOf("o");
        // last index of a character

        //name = name.toUpperCase();
        //name = name.toLowerCase();
        // uppercase all characters in a string

        name = name.trim();
        // remove whitespaces before and after string

        //name = name.replace("o", "a");
        // [StringName].replace(replace this, with this)

        //name = name.isEmpty();
        // check if string is empty:
        // if (name.isEmpty()) {
        //     System.out.println("name is empty");
        // } else {
        //     System.out.println("name is not empty, hello " + name);
        // }

        // check if string contains a string:
        /* if (name.contains(" ")) {
            System.out.println("name includes space(s)");
        } else {
            System.out.println("name does not include ' ' ");
        }
        */

        // check if strings equal

        // name.equals() returns boolean value 
        if (name.equalsIgnoreCase("password")) {
            System.out.println("ur name cannot be passwordo");
        } else {
            System.out.println("heyyyy " + name);
        }


        System.out.println("length of name: " + name);

    }
    
}
