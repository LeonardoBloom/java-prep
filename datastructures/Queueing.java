import java.util.Queue;
import java.util.LinkedList;

public class Queueing {
    
    public static void main(String[] args) {

        Queue<String> queue = new LinkedList<String>();

        System.out.println(queue.isEmpty());

        queue.offer("Karen");
        queue.offer("Chad");
        queue.offer("Steve");
        queue.offer("Harold");

        System.out.println(queue.isEmpty());
        System.out.println(queue.size());

        queue.poll();
        queue.poll();
        queue.poll();
        queue.poll();
        queue.poll();
        
        System.out.println(queue.peek());

    }

}
