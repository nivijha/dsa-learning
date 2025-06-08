
public class RecursionBasisc {
    public static void printDec(int n){
        if(n==1){
            System.out.println(n);
            return;
        }
        System.out.println(n+" ");
        printDec(n-1);
    }

    public static void printInc(int n){
        if(n==1){
            System.out.println(1);
            return;
        }
        printInc(n-1);
        System.out.println(n+" ");
    }

    public static int  fact(int n){
        if(n==0){
            return 1;
        }
        int fnm1= fact(n-1);
        int f= n * fact(n-1);
        return f;
    }

    public static int Sum(int n){
        if(n == 1){
            return 1;
        }
        int sum= n + Sum(n-1);
        return sum;
    }

    public static int fibonacci(int n){
        if(n==1 || n==0){
            return n;
        } 
        int fibn= fibonacci(n-1) + fibonacci(n-2);
        return fibn;
    }

    public static boolean isSorted(int arr[], int i){
        if(i==arr.length-1){
            return true;
        }
        if(arr[i]>arr[i+1]){
            return false;
        }
        return isSorted(arr, i+1);
    }

    public static int FirstOccurence(int arr[],int i, int key){
        if(i==arr.length){
            System.out.println("element not found");
        }
        if(arr[i]==key){
            return i;
        }
        return FirstOccurence(arr,i+1,key);
    }

    public static int lastOccurence(int arr[],int i, int key){
        if(i==arr.length){
            return -1;
        }
        int isFound = lastOccurence(arr,i+1,key);
        if(isFound == -1 && arr[i] == key){
            return i;
        }
        return isFound;
    }

    public static int power(int x,int n){
        //Time Complexity O(n)
        if(n==0){
            return 1;
        }
        int pow= x * power(x, n-1);
        return pow;
    }

    public static int otimizedPower(int x, int n){
        //Time Complexity O(log n)
        if(n==0){
            return 1;
        }
        int halfPower= otimizedPower(x, n/2);
        int halfPowerSq = halfPower * halfPower;
         
        if(n % 2 != 0){
            halfPowerSq = x * halfPowerSq;
        }

        return halfPowerSq;
    }

     public static void main(String[] args) {
        int n=10;
        printDec(n);
        printInc(n);
        fact(n);
        Sum(n);
        fibonacci(n);
        int arr[]={1,5,7,9,5,2,6,5};
        isSorted(arr, 0);
        FirstOccurence(arr,0,5);
        power(2, 3);
    }
}
