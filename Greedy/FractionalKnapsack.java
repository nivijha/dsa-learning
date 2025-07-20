package Greedy;

import java.util.Arrays;
import java.util.Comparator;

public class FractionalKnapsack {
    public static int profitCalc(int[] value, int[] weight, int W){
        double ratio[][] = new double[value.length][2];
        // 1st col = index  2nd col = ratio

        for(int i=0; i<value.length; i++){
            ratio[i][0] = i;
            ratio[i][1] = value[i]/weight[i];
        }

        // sort in asc order
        Arrays.sort(ratio, Comparator.comparingDouble(o -> o[1]));

        int capacity = W;
        int profit = 0;
        for(int i=ratio.length-1; i>=0; i--){
            int indx = (int)ratio[i][0];
            if(capacity>=weight[indx]){
                profit += value[indx];
                capacity -= weight[indx];
            } else{
                profit += (value[indx]/weight[indx])*capacity;
                capacity = 0;
                break;
            }
        }

        return profit;
    }
    public static void main(String[] args) {
        int value[] = {60, 100, 120};
        int weight[] = {10, 20,30};
        int W = 50;

        System.out.print(profitCalc(value, weight, W));        
    }
}
