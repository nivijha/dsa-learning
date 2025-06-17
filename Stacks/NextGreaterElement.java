package Stacks;
import java.util.*;

public class NextGreaterElement {
    public static void main(String args[]){
        int arr[] = {9, 4, 7, 3, 8};
        int nextGreater[]= new int[arr.length];
        Stack<Integer> s = new Stack<>();
        
        for(int i=arr.length-1; i>=0; i--){
            //1st while
            while (!s.empty() && arr[s.peek()]<=arr[i]) {
                s.pop();
            }

            //2nd if-else
            if(s.empty()){
                nextGreater[i] = -1;
            } else{
                nextGreater[i] = arr[s.peek()]; 
            }

            //3rd push in s
            s.push(i);
        }

        for(int i=0; i<nextGreater.length; i++){
            System.out.println(nextGreater[i]+" ");
        }
        System.out.println();
    }
}
