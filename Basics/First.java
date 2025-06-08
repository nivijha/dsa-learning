package Basics;
import java.util.*;

public class First 
{
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        int avg=(a+b+c)/3;
        System.out.println("The average os 3 number is= "+ avg);
        int pen=sc.nextInt();
        int pencil=sc.nextInt();
        int eraser=sc.nextInt();
        float sum=pencil+pen+eraser;
        float t_sum=sum+(0.18f);
        //agr kisi decimal number ke sath 'f' ni lgya toh uska data type double consider hota h 3.14 is double and 3.14f is float
        System.out.println(t_sum);
        sc.close();
        

    }
}

/*public class First 
{
    public static void main(String[] args)
    {
        int x = 9, y = 12;
        int a = 2, b = 4, c = 6;
        int exp = 4/3 * (x + 34) + 9 * (a + b * c) + (3 + y * (2 + a)) / (a + b*y);
        System.out.println(exp);
    }
}*/


