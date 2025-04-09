import java.util.*;

public class PriorityQueues {
    
    public static void main(String[] args) {
        
        Queue<String> queue = new PriorityQueue<>(Collections.reverseOrder());

        queue.offer("B");
        queue.offer("C");
        queue.offer("A");
        queue.offer("F");
        queue.offer("D");

        System.out.println(queue);

        while(!queue.isEmpty()) {
            System.out.println(queue.poll());
        }

        System.out.println((queue.isEmpty()));

    }

}
