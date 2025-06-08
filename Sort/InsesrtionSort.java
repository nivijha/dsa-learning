package Sort;
import java.util.*;


public class InsesrtionSort {
    public static void sort(int arr[]){
        for(int i=1;i<arr.length;i++){
            int curr=i;
            int prev=i-1;
            //finding out the correct position for insertion
            while (prev>=0 && arr[prev]>curr) {
                arr[prev+1]=arr[prev];
                prev--;
            }
            //inserrting at that position
            arr[prev+1]=curr;
        }
    }

    /* Sorting in Descending Order 
    public static void sort(int arr[]){
        for(int i=1;i<arr.length;i++){
            int curr=i;
            int prev=i-1;
            //finding out the correct position for insertion
            while (prev>=0 && arr[prev]<curr) {
                arr[prev+1]=arr[prev];
                prev--;
            }
            //inserrting at that position
            arr[prev+1]=curr;
        }
    } */


    public static void printArr(int arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }


    public static void main(String[] args) {
        int arr[]={5,4,1,3,2};
        sort(arr);
        printArr(arr);
    }

}
