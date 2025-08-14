package Queue; 

import java.util.Comparator;
import java.util.PriorityQueue;

public class Priorityqueue {
    static class Student implements Comparable<Student>{
        String name;
        int rank;

        Student(String name, int rank){
            this.name = name;
            this.rank = rank;
        }
        
        @Override
        public int compareTo(Student s2){
            return this.rank - s2.rank ;
        }
    }
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());

        pq.add(3); //O(logn)
        pq.add(4);
        pq.add(1);
        pq.add(9);

        while (!pq.isEmpty()) {
            System.out.print(pq.peek()); //O(1)
            pq.remove();//O(logn)
        }
    }
     
}