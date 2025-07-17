package Queue;

import java.util.*;

public class DequeQ {
    public static void main(String[] args) {
        Deque<Integer> deque = new LinkedList<>();

        deque.add(1);
        deque.addFirst(2);
        deque.addLast(3);
        System.out.println(deque);
        deque.remove();
        System.out.println(deque);
        deque.removeLast();
        System.out.println(deque);
        deque.removeFirst();
        System.out.println(deque);
    }
}
