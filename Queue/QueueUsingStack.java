package Queue;
import java.util.*;

public class QueueUsingStack {
    static class Queue {
        static Stack<Integer> s1 = new Stack<>();
        static Stack<Integer> s2 = new Stack<>();
        
        public static boolean isEmpty(){
            return s1.isEmpty();
        }

        // O(n)
        public static void add(int data){
            while (!s1.isEmpty()) {
                s2.push(s1.pop());
            }

            s1.push(data);

            while (!s2.isEmpty()) {
                s1.push(s2.pop());
            }
        }

        // O(1)
        public static int remove(){
            if(s1.isEmpty()){
                System.out.println("queue empty");
                return -1;
            }
            return s1.pop();
        }

        // O(1)
        public static int peek(){
            if(s1.isEmpty()){
                System.out.println("queue empty");
                return -1;
            }
            return s1.peek();
        }      
        
        public static void print(){
            Stack<Integer> temp = new Stack<>();
            temp.addAll(s1);
            while (!temp.isEmpty()) {
                System.out.println(temp.pop()); 
            }
            temp.clear();
        }
    }    

    public static void main(String[] args) {
        Queue q1 = new Queue();
        q1.add(1);
        q1.add(2);
        q1.add(3);
        q1.add(4);
        q1.add(5);
        q1.add(6);
        q1.print();
        System.out.println();
        System.out.println(q1.remove());
        System.out.println();
        q1.print();
        System.out.println();
        System.out.println(q1.remove()); 
        System.out.println();
        q1.print();
        System.out.println();
        System.out.println(q1.peek()); 
        System.out.println(q1.remove()); 
        System.out.println(q1.remove()); 
        System.out.println(q1.remove()); 
        System.out.println(q1.remove()); 
        System.out.println(q1.remove()); 
        System.out.println(q1.remove()); 
        
    }
}
