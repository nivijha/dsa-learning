package Patterns;

public class Floyd_triangle {
    public static void pattern(int row){
        int i,j,k=1;
        for(i=1;i<=row;i++){
            for(j=1;j<=i;j++){
                System.out.print(k+" ");
                k++;
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        pattern(5);
    }
}

