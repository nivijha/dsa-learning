package Patterns;

//import java.util.Scanner;

public class Hollow_rectangle {
    
    public static void pattern(int row, int col){
        int i,j;
        for(i=1;i<=row;i++){
            for(j=1;j<=col;j++){
                if(i==1 || i==row || j==1 || j==col){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }System.out.println();
        }

        /*  Pattern-
            *
            **
            ***
            **** 
        */
    }
    public static void main(String[] args) {
        //Scanner sc=new Scanner(System.in);
        //System.out.println("Enter a number of rows:");
        //int a=sc.nextInt();
        //System.out.println("Enter a number of cols:");
        //int b=sc.nextInt();
        pattern(4, 5);

    }
}
