package Greedy;

import java.util.ArrayList;
import java.util.Arrays;

public class IndianCoins {
    public static int minCoins(int V){
        int coins[] = {1,2,5,10,20,50,100,200,500,2000};
        int numCoins =0;
        // assuming array is not sorted then sort in asc order.
        Arrays.sort(coins);
        ArrayList<Integer> ans = new ArrayList<>();

        for(int i=coins.length-1; i>=0 ; i--){
            if (V>=coins[i]) {
                while(coins[i]<=V){
                    V -= coins[i];
                    numCoins++;
                    ans.add(coins[i]);
                }
                
            } 
            
        }

        System.out.print("Coins used are : ");
        for(int i=0; i<ans.size(); i++){
            System.out.print(ans.get(i)+ " ");
        }
        System.out.println();
        return numCoins;
    }
    public static void main(String[] args) {
        int V = 590;

        System.out.println("Nos. of coins : "+ minCoins(V));
    }
}
