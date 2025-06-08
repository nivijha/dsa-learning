package Arrays;

public class Subarray {
    public static void printSubarrays (int num[]){
        int sum;
        int maxsum =Integer.MIN_VALUE;
        for(int i=0; i<num.length;i++){
            int start = i;
            for(int j=i; j<num.length;j++){
                int end=j;
                sum=0;
                for(int k=start; k<=end; k++){
                    System.out.print(num[k]+" ");
                    sum=sum+num[k];
                }
                System.out.println("Sum of subarray= "+sum);
                if (maxsum<sum){
                    maxsum=sum;
                }
                System.out.println();
                
            }
            System.out.println();
        }
        System.out.println("Max sum of subarrays= "+ maxsum);
    }

    public static void main(String[] args) {
        int num[]={2,4,6,8,10};
        printSubarrays(num);
    }
}
