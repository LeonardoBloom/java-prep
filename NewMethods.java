

public class NewMethods {

    
        public static void main(String[] args) {

                String name = "Bro";
                int age = 25;

                happyBirthday(name);

                System.out.println(getFullName("John", "Appleseed"));

                System.out.println(getFullName("John", "A.", "Appleseed"));

    
        }

        static void happyBirthday(String name) {

                System.out.printf("\nHappy birthday to: %s \n", name);

        }

        static String getFullName(String first, String last) {
                return first + " " + last;
        }

        static String getFullName(String first, String middle, String last) {
                return first + " " + middle + " " + last;
        }

}


