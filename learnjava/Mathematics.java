package learnjava;
// import java.math.*;

public class Mathematics {

    public static void main(String[] args) {

        // Math class methods

        double result;

        result = Math.pow(2, 5);
        result = Math.abs(-5);
        result = Math.sqrt(9);
        result = Math.round(3.14);
        result = Math.ceil(4.14);
        result = Math.floor(3.89);
        result = Math.max(10,20);

        System.out.println("result with Math. methods: " + result);
        
        
        int peak = 2;
        String output = "";

        for (int i = peak; Math.abs(i) <= peak; i-- ) {
            for (int x = 0; x <= peak - Math.abs(i); x++) {
                output += "*";
            }
            System.out.println(output);
            output = "";
        }
        

       
    }
    
}
