package learnjava;
public class VariableArguments {

    public static void main(String[] args) {
        
        // System.out.println(add(1,2,3,4));

        System.out.println("\n" + average());


    }

    static double average(double... numbers) {

        double sum = 0;

        if (numbers.length == 0) {
            return 0;
        } else {
            for(double number: numbers) {
                sum += number;
            }
    
            return sum / numbers.length;
        }


    }

    // static int add(int... numbers) {
    //     int sum = 0;
    //     for (int number: numbers) {
    //         sum += number;
    //     }

    //     return sum;
    // }


    
}
