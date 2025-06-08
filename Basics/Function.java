package Basics;
import java.util.Scanner;

/*public class Function {
    
    public static void sum(int num1, int num2){
        int s=num1+num2;
        System.out.println(s);
    }
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        sum(a,b);
    }
    
}*/


//Funtion overloading
/*public class Function {

    public static int sum(int a, int b){
        return a+b;
    }
    public static float sum(float a,float b){
        return a+b;
    }
    public static int sum(int a,int b,int c){
        return a+b+c;
    }

    public static void main(String[] args) {
        System.out.println(sum(3,4));
        System.out.println(sum(2.9f,3.9f));
        System.out.println(sum(1,2,4));
    }
}*/

//Function to add sum of digits in an integer
public class Function {
    
    public static void sum(int num){
        int n=num;
        int s=0;
        while(num>0){
           int lastdigit=0;
           lastdigit=num%10;
           s= s+lastdigit;

           num=num/10;
        }
        System.out.println("The sum of the digits of "+n+" = "+s);
    }
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number:");
        int a=sc.nextInt();
        sum(a);
        sc.close();
    }
    
}