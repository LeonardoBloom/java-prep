import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;

public class Main {
    public static void main(String[] args) {

        // java countdown Timer program

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter # of seconds to count down from: ");
        int response = scanner.nextInt();

        Timer timer = new Timer();
        TimerTask task = new TimerTask() {

            int count = response;

            @Override
            public void run() {
                System.out.println(count);
                count--;
                if (count < 0) {
                    System.out.println("Happy nEW YEAR");
                    timer.cancel();
                }
            }
        };

        timer.schedule(task, 0, 1000);

    }
}
