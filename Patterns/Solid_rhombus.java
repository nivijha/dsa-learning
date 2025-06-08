package Patterns;

public class Solid_rhombus {
    
    public static void pattern(int row){
        int i,j;

        for(i=1;i<=row;i++){
            //spaces = (row-i)
            for(j=1;j<=(row-i);j++){
                System.out.print(" ");
            }
            //stars = 5
            for(j=1;j<=5;j++){
                if(i==1 || i==row || j==1 || j==row){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        pattern(5);
    }
    
}
