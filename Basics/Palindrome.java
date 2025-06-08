package Basics;
import java.util.*;
public class Palindrome {
    
    public static void palindrome(int num){
        int n= num;
        int newnum=0;
        while(num!=0){
            int lastdigit=num%10;
            newnum=newnum*10+lastdigit;
            num=num/10;
        }
        if(newnum==n){
            System.out.println(newnum+" == "+n+" The number is Palindrome");
        }
        else{
            System.out.println(newnum+" != "+n+" Not a Palindrome");
        }
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num=sc.nextInt();
        palindrome(num);
        sc.close();
        
    }
}
