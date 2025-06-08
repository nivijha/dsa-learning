package Basics;
import java.util.Scanner;

public class Reverse 
{
    public static void main(String args[])
    {
        Scanner s= new Scanner(System.in);
        int n=s.nextInt();
        int rev=0;
        int ld=0;
        while(n>0)
        {
            ld=n%10;
            rev=(rev*10)+ld;
            n=n/10;
        }
        System.err.println(rev);
        s.close();
        
    }
}



/* Get the Last digit  (num%10)
   Remove the last digit  (num/10)
*/