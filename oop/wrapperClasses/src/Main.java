public class Main {

    public static void main(String[] args) {
        /*
        Wrapper Classes =  allows primitive types (int, char, double, boolean)
                           to be used as objects. "Wrap them in an object".
                           Generally, don't wrap primitives unless you need an object.
                           Allows use of Collections Framework and static utility Methods.
         */

        // autoboxing
        /*
        Integer a = 123;
        Double b = 3.14;
        Character c = '$';
        Boolean d = true;


        // unboxing
        boolean x = d;
        */

//        String a  = Integer.toString(123);
//        String b = Double.toString(3.142);
//        String c = Character.toString('@');
//        String d = Boolean.toString(false);
//
//        int e = Integer.parseInt("123");
//        double f = Double.parseDouble("3.142");
//        char g = "Pizza".charAt(0);
//        boolean h = Boolean.parseBoolean("true");
//
//        String x = e + f + g + h;
//
//        System.out.println(x);

        char letter = '$';

        System.out.println(Character.isLetter(letter));



    }
}
