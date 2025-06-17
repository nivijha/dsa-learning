package Stacks;
import java.util.ArrayList;

public class StackUsingArrayList {
    static class Stack {
        static ArrayList<Integer> list = new ArrayList<>();

        //check if it's empty
        public static boolean isEmpty(){
            return list.size() == 0;
        }

        //push
        public static void push(int data){
            list.add(data);
        }

        //pop
        public static int pop(){
            int ele= list.get(list.size()-1);
            list.remove(list.size()-1);
            return ele;
        }

        //peek or top
        public static int peek(){
            return list.get(list.size()-1);
        }
        
    }

    public static void main(String[] args) {
        Stack s= new Stack();
        s.push(1);
        s.push(3);
        s.push(2);

        while (!s.isEmpty()) {
            System.out.println(s.peek());
            s.pop();
        }
    }
}
