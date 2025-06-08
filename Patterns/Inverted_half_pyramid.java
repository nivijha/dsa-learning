package Patterns;

public class Inverted_half_pyramid {
    public static void pattern(int row){
        int i,j,k=1;
        for(i=1;i<=row;i++){
            for(j=1;j<=row-i+1;j++){
                System.out.print(j+" ");
                k++;
            }
            //for(k=1;k<=i;k++){
            //    System.out.print("*");
            //}
            System.out.println();
        }
    }

    public static void main(String[] args) {
        pattern(5);
    }
}    

