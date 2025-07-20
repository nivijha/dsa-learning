package Greedy;

import java.util.Arrays;
import java.util.Collections;

public class ChocolaProb {
    public static int minCost(Integer[] vertCost, Integer[] horizCost, int n, int m){
        // sort in desc order
        Arrays.sort(horizCost, Collections.reverseOrder());
        Arrays.sort(vertCost, Collections.reverseOrder());

        int h= 0, v =0;
        int hp=1, vp = 1;
        int cost =0;

        while (h<horizCost.length && v<vertCost.length ) {
            if(vertCost[v] <=horizCost[h]){ //horizontal cut 
                cost += (horizCost[h]*vp);
                hp++;
                h++;
            }
            else{ // vertical cut
                cost += (vertCost[v]*hp);
                vp++;
                v++;
            }
        }

        while (h < horizCost.length) { // remaining horizontal cut
            cost += (horizCost[h]*vp);
            hp++;
            h++;
        }
        while (v < vertCost.length) { // remaining vertical cut
            cost += (vertCost[v]*hp);
            vp++;
            v++;
        }

        return cost;
    }

    public static void main(String[] args) {
        Integer vertCost[] = {2, 1, 3, 1, 4};
        Integer horizCost[] ={4, 1, 2};

        int n= vertCost.length+1;
        int m=horizCost.length+1;
        System.out.println("Min Cost of Cutting Chocolate = "+minCost(vertCost, horizCost, n, m));
    }
}