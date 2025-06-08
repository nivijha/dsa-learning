package Basics;
import java.util.*;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
       System.out.print("enter the number:");
        int num=sc.nextInt();
        int fact=1;
        for (int i=1;i<=num;i++)
        {
            fact=fact*i;
        }
        System.out.println("factorial= "+fact);
        sc.close();
        
    }
}
