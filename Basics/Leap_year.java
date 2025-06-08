package Basics;
import java.util.*;

public class Leap_year {
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        int year=sc.nextInt();
        if (year%4==0)
        {
            if(year%100==0)
            {
                if(year%400==0)
                {
                    System.out.println("Year is a leap year");
                }
                
                else
                {
                    System.out.println("Year is not a leap year");
                }
            }
            
            else
            {
                System.out.println("Year is leap year");
            }
        }
       
        else
        {
            System.out.println("Year is not a leap year");
        }
        sc.close();
    }
}
