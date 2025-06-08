package Patterns;

public class Half_pyramid {
    
    public static void pattern(int row){
        int i,j,k;
        for(i=1;i<=row;i++){
            for(j=1;j<=row-i;j++){
                System.out.print(" ");
            }
            for(k=1;k<=i;k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        pattern(4);
    }
}
