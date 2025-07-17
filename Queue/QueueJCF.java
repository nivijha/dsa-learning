package Queue;
import java.util.*;

public class QueueJCF {
    public static void main(String[] args) {
        // Queue q = new Queue();
        // Queue<Integer> q= new LinkedList<>();
        Queue<Integer> q= new ArrayDeque<>();
        q.add(1);
        q.add(2);
        q.add(3);
        System.out.println(q.remove());
        q.add(4);
        System.out.println(q.remove());
    }
}
