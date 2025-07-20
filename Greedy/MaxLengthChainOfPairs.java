package Greedy;

import java.util.Arrays;
import java.util.Comparator;

public class MaxLengthChainOfPairs {
    // O(nlogn)
    public static int maxLengthChain(int pair[][]){ 
        int maxChain = 1;

        //Array sort in asc order
        Arrays.sort(pair, Comparator.comparingDouble(o -> o[1]));
        int lastEnd = pair[0][1];
        for(int i=1; i<pair.length; i++){
            if(pair[i][0]>= lastEnd){
                maxChain++;
                lastEnd = pair[i][1];
            }
        }
        return maxChain;
    }
    public static void main(String[] args) {
        int pair[][] ={{5,24}, {41,60}, {5,28}, {27,40}, {60,90}};

        System.out.println(maxLengthChain(pair));
    }
}
