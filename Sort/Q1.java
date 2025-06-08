package Sort;

/* Question 1 : Apply Merge sort to sort an array of Strings. (Assume that all the characters in all the Strings are in lowercase).
Sample Input 1: arr = { "sun", "earth", "mars", "mercury"}
Sample Output 1: arr = { "earth", "mars", "mercury","sun"}
*/
public class Q1 {
    public static String[] mergeSort(String arr[], int low, int high){
        if( low == high){
            String[] A= { arr[low] };
            return A;
        }
        int mid = low + (high-low)/2;
        String arr1[] = mergeSort(arr, low, mid);//leftarray
        String arr2[] = mergeSort(arr, mid+1, high);//rightarray

        //applying the algo and copying it into arr3.
        String arr3[] = merge(arr1, arr2);
        return arr3;
    }

    public static boolean isAlphabeticallySmaller(String str1, String str2){
        if(str1.compareTo(str2)<0){
            return true;
        }
        return false;
    }

    //merge method to merge the sorted parts
    public static String[] merge(String arr1[], String arr2[]){
        int m = arr1.length;
        int n = arr2.length;
        
        String arr3[] = new String[m+n];

        int indx=0;

        int i=0; 
        int j=0;

        while(i < m && j < n){
            if(isAlphabeticallySmaller(arr1[i],arr2[j])){
                arr3[indx]= arr1[i];
                i++;
            }
            else{
                arr3[indx]=arr2[j];
                j++;
            }
            indx++;
        }

        //leftover elements in left part
        while(i < m){
            arr3[indx++]=arr1[i++];
        }

        //leftover elements in right part
        while(j<n){
            arr3[indx++]=arr2[j++];
        }
        return arr3;

    }

    

    public static void printArr(String arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }


    public static void main(String[] args) {
        String arr[]={"sun","earth","mars","mercury"};
        String[] a=mergeSort(arr, 0, arr.length-1);
        printArr(a);
    }
}
