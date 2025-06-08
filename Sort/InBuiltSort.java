package Sort;
import java.util.Arrays;
import java.util.Collections;


public class InBuiltSort {

    public static void printArr(int arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    public static void printArrCollec(Integer arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    
    public static void main(String[] args) {
        int arr[]={5,4,3,2,6,1};
        int arr2[]={5,4,3,2,6,1};
        Integer arr3[]={5,4,3,2,6,1};
        Integer arr4[]={5,4,3,2,6,1};
        System.out.print("Original Array= ");
        //printing the original array.
        printArr(arr);

        //Sorting array in ascending array using inbuilt function.
        Arrays.sort(arr);
        printArr(arr);

        //Sorting array in ascending array by specifying the indices.
        Arrays.sort(arr2,1,4);
        printArr(arr2);

        //Sorting array in descending order using inbuilt Collections Function. This function only takes object as argument.
        Arrays.sort(arr3,Collections.reverseOrder());
        printArrCollec(arr3);

        //Sorting array in descending order by specifying the indices.
        Arrays.sort(arr4,1,4,Collections.reverseOrder());
        printArrCollec(arr4);
    }
}


