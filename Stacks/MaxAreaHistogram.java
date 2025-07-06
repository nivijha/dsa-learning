package Stacks;

import java.util.Stack;

public class MaxAreaHistogram {
    public static int maxArea(int height[]){
        int nextSmallerLeft[]= new int[height.length];
        int nextSmallerRight[]= new int[height.length];
        int maxArea= 0;

        Stack<Integer> s= new Stack<>();

        //Next Smaller Right -- O(n)
        for(int i=height.length-1; i>=0; i--){
            while (!s.isEmpty() && height[s.peek()] >= height[i]) {
                s.pop();
            }
            if(s.isEmpty()){
                nextSmallerRight[i] = height.length;
            }else{
                nextSmallerRight[i] = s.peek();
            }
            s.push(i);
        }

        //Empty stack for nsl
        s = new Stack<>();

        // Next Smaller Left -- O(n)
        for(int j=0; j<height.length; j++){
            while (!s.isEmpty() && height[s.peek()] >= height[j]) {
                s.pop();
            }
            if(s.isEmpty()){
                nextSmallerLeft[j] = -1;
            }else{
                nextSmallerLeft[j] = s.peek();
            }
            s.push(j);
        }

        //Finding area -- O(n)
        int width =0;
        for(int i=0; i<height.length; i++){
            width = nextSmallerRight[i]-nextSmallerLeft[i]-1;
            int a = height[i] * width;
            maxArea = Math.max(maxArea, a);        
        }
        return maxArea;
    }
    public static void main(String[] args) {
        int height[]= {2, 1, 5, 6, 2, 3};

        System.out.println(maxArea(height));
    }
}
