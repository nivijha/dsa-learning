package Greedy;

import java.util.Arrays;

public class MinAbsoluteDiff {
    public static int minAbsDiff(int[] A, int[] B){
        // Sort the arrays
        Arrays.sort(A);
        Arrays.sort(B);

        int minDiff=0;

        for(int i=0; i<A.length; i++){
            minDiff += Math.abs(A[i] - B[i]);
        }

        return minDiff;
    }
    public static void main(String[] args) {
        int A[] = { 4, 1, 8, 7 };
        int B[] = { 2, 3, 6, 5 };

        System.out.println(minAbsDiff(A, B));

    }

}
