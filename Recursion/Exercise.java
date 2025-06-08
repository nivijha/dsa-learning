public class Exercise {

    public static void Q1occurrences(int arr[],int i, int key){
        if(i == arr.length){
            return ;
        }
        if(arr[i]==key){
            System.out.println(i+" ");
        }
        Q1occurrences(arr, i+1, key);
    }

    public static void  Q2PrintDigits(int n){
        String digits[]={"zero","one","two","three","four","five","six","seven","eight","nine"};
        if(n==0){
            return;
        }

        int lastDigit = n%10;
        Q2PrintDigits(n/10);
        System.out.println(digits[lastDigit]+" ");
    }

    public static int Q3LengthOfString(String str[], int i){
        if(i == str.length){
            return 0;
        }
        return 1 + Q3LengthOfString(str,i+1);
    }

    public static int countSubstrs(String str,int i,int j,int n) {
        if(n==1) {
            return 1;
        }
        if(n<=0) {
            return 0;
        }
        int res=countSubstrs(str ,i+1 ,j ,n-1) + countSubstrs(str ,i ,j-1 ,n-1) - countSubstrs(str ,i+1 ,j-1 ,n-2);
        if(str.charAt(i) == str.charAt(j)) {
            res++;
        }
        return res;
    }

    public static void main(String[] args) {
        int arr[]={1,2,4,3,4,6,4,7};
        Q1occurrences(arr, 0, 4);
        System.out.println();

        Q2PrintDigits(1234);
        System.out.println();

        String str[]={"abc","def","ghi","jkl"};
        Q3LengthOfString(str,0);

        String str1="abcab";
        int n=str1.length();
        System.out.print(countSubstrs(str1,0,n-1,n));
    }
}
