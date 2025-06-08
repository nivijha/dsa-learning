package Sort;
import java.util.*;


public class bubble {
    public static void sort(int arr[]){
        int turn=0;
        for(turn=0;turn<arr.length-1;turn++){
            for(int j=0;j<arr.length-1-turn; j++){
                if(arr[j]<arr[j+1]){
                    int temp = arr[turn];
                    arr[j]= arr[j+1];
                    arr[j+1]= temp;
                }
            }
        }
    }

    /* Sort the Array in Descending order
    public static void sort(int arr[]){
        int turn=0;
        for(turn=0;turn<arr.length-1;turn++){
            for(int j=0;j<arr.length-1-turn; j++){
                if(arr[j]<arr[j+1]){
                    int temp = arr[turn];
                    arr[j]= arr[j+1];
                    arr[j+1]= temp;
                }
            }
        }
    } */

    public static void printArr(int arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.println(arr[i]+" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int arr[]={5,4,1,3,2};
        sort(arr);
        printArr(arr);
    }
}
