package Arrays;

public class Pairs_in_arr {
    public static int pairs(int num[]){
        int i,j;
        for(i=0;i<num.length;i++){
            int curr=num[i];

            for(j=i+1;j<num.length;j++){
                System.out.print("("+curr+","+num[j]+") ");
            }
            System.out.println();
        }
        return 0;
    }

    public static void main(String[] args) {
        int num[]={2,4,6,8,10};
        pairs(num);

    }
}
