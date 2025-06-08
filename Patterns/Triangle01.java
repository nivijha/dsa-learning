package Patterns;

public class Triangle01 {

    public static void pattern(int row){
        int i,j,k=1;
        for(i=1;i<=row;i++){
            for(j=1;j<=i;j++){
                if((i+j)%2==0){
                    System.out.print(1);
                }
                else{
                    System.out.print(0);
                }


            }
            System.out.println();
        }
    }
    
    public static void main(String[] args) {
        pattern(5);
    }
    
}
