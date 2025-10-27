import java.util.*;
import java.util.LinkedList;

public class LL_framework {
    public static void main(String[] args) {
        LinkedList<Integer> ll= new LinkedList<>();

        ll.add(1);
        ll.add(5);
        ll.add(7);
        ll.addLast(3);
        ll.addFirst(9);

        System.out.println(ll);

        ll.removeLast();
        System.out.println(ll);

        ll.remove(); //removes first
        System.out.println(ll);

        ll.removeFirst();
        System.out.println(ll) ;

        // Node<Integer> newLL= new Node<>(-1);

    }
}
