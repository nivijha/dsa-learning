package Basics;
import java.util.*;

public class Javabasics
{
    public static void main(String args[])
    {
        System.out.println("1 2 3 4 5");//println se line ka space add ho jata h
        System.out.print("Hello world\n");//"\n"= new line.
        System.out.print("Hello world\n");
        Scanner sc = new Scanner(System.in);//'sc' is a scanner object. iska kaam hota h diff diff data types ko capture krke usko kisi variable mei store krana 
       // String s= sc.next();//this 'next()' only considers inputs before space
       //System.out.print(s); 
       //String r=sc.nextLine();
       //System.out.print(r);
       //float a=25.12f;
       //int b=(int)a;
       //System.out.print(b);
       int a=10;
       float b=20.25f;
       long c=25;
       double d=30;
       double ans=a+b+c+d;
       float n=sc.nextFloat();
       System.out.println(n);
       System.out.println(ans);
       sc.close();//closing the scanner object 
    }
}   //this is a code we have to write everytime and this is called boilerplate code.

/*byte-- 1byte [-128 to 127]
 * short-- 2bytes
 * char-- 2bytes ['a' to 'z' 'A' to 'Z' '@' '%' ',']
 * boolean-- 1byte [true, false]
 * int-- 4bytes [-2B to +2B]
 * long-- 8bytes
 * float-- 4bytes
 * double-- 8bytes
 */

/*Identifier starts with alphabet or '_' or '$' */

/*Input Functions--
 * next
 * nextLine
 * nextInt
 * nextByte
 * nextFloat
 * nextDouble
 * nextBoolean
 * nextShort
 * nextLong 
 */

/*Type Conversion(widening or implicit)--
 * type compatible
 * destination type>source type
 * byte->short->int->float->long->double
 */
  
/*Type Casting(narrowing or explicit)
 * float a=25.12f;
   int b=(int)a;
   System.out.print(b);
 */

/*Type Promotion in Expressions
 * 1) Java automatically promotes each byte, short, or char operand to int when evaluating an expression
 * 2) if one operand is long,float or double the whole expression is promoted to long, float or double respectively.
 */