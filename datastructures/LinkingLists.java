import java.util.*;

public class LinkingLists {

    public static void main(String[] args) {
        
        LinkedList<String> linkedlist = new LinkedList<String>();

        linkedlist.offer("A");
        linkedlist.offer("B");
        linkedlist.offer("C");
        linkedlist.offer("D");
        linkedlist.offer("F");
        
        //linkedlist.poll();

        linkedlist.add(4, "E");

        System.out.println(linkedlist);

        linkedlist.remove("E");
        System.out.println(linkedlist.indexOf("F"));

        System.out.println(linkedlist.peekFirst());
        System.out.println(linkedlist.peekLast());

        linkedlist.addFirst("0");
        linkedlist.addLast("G");

        System.out.println(linkedlist);

        String first = linkedlist.removeFirst();
        String last = linkedlist.removeLast();

        System.out.println(first);
        System.out.println(last);

    
    }
    
}
