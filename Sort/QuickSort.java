package Sort;

public class QuickSort {
    
    public static int partition(int arr[],int low, int high){
        int pivot = arr[high];
        int i= low;
        int j=high-1;
        int temp;
        
        do{
            while(i < high && arr[i] <= pivot){
                i++;
            }
            while(j >= low && arr[j] > pivot){
                j--;
            }
            if(i < j){
                //swap
                temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
        }while(i < j);

        //swap pivot with arr[i]
        temp = arr[high];
        arr[high] = arr[i];
        arr[i] = temp;

        return i;
    }

    public static void quickSort(int arr[], int low, int high){
        if(low < high){
            int pIdx = partition(arr, low, high); //pivot ka index after partition
            quickSort(arr, low, pIdx-1);//left side of pivot
            quickSort(arr, pIdx+1, high);//right side of pivot
        }

        
    }

    public static void printArr(int arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int arr[]={6,3,9,8,2,5};
        quickSort(arr, 0, arr.length-1);
        printArr(arr);
    }
}
