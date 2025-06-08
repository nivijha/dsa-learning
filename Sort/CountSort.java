package Sort;
import java.util.*;

public class CountSort{
    public static void countsort(int arr[]){
        int largest=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            largest=Math.max(largest,arr[i]);
        }
        
        int count[]=new int[largest+1];
        for(int i=0;i<arr.length;i++){
            /*array ke numbers ko hum index ki tarah treat krenge and then jaise 1 index of 
            count array will get value 2.*/
            count[arr[i]]++;
        }
        
        //sorting
        int j=0;
        for(int i=0;i<count.length;i++){
            while(count[i]>0){
                arr[j]=i;
                j++;
                count[i]--;
            }
        }

        /* For sorting in descending order
        int j=0;
        int n=count.length;
        for(int i=n-1;i>=0;i--){
            while(count[i]>0){
                arr[j]=i;
                j++;
                count[i]--;
            }
        } */
    }

    public static void printArr(int arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    
    public static void main(String[] args) {
        int arr[]={1,4,1,3,2,4,3,7};
        countsort(arr);
        printArr(arr);
    }
}

