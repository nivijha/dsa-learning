package Basics;
import java.util.*;

public class Prime_no {
    public static void main(String rgs[])
    {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();

        if(n==2){
            System.out.print("n is a prime number");
        }
        else{
            boolean isPrime=true;
            for(int i=2;i<=n-1;i++)//for bigger number (i<=Math.sqrt(n)) instead of i<=n-1
            {
                if(n%i==0){
                    isPrime=false;
                }
            }
            if (isPrime==true)
            {
                System.out.println("n is prime");
            }
            else{
                System.out.println("n is not prime num");
            }
        }
        sc.close();
    }
}


 