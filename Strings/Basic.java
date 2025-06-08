package Strings;
import java.util.*;

public class Basic {
    public static void main(String[] args) {
        char arr[]={'a','b','c','d'};
        String str="abcd";
        String str2= new String("xyz");
        
        //Strings are IMMUTABLE
/* 
        Scanner sc= new Scanner(System.in);
        String name;
        name = sc.next() *///input Tony stark
        /* System.out.println(name); *///will print only "Tony"
        /* name=sc.nextLine() *///input Tony Strack
        /* System.out.println(name); *///will print "Tony Stark"

        String fullname= "Tony Stark";
        System.out.println(fullname.length());

        //concatenation -- basically join two things together
        String firstName = "Shradha";
        String lastName = "Khapra";
        String fullName = firstName + " " + lastName;
        System.out.println(fullName + " is this"); // is also concatenation doo cheezon ko combine krke print krwa rahe h
    }
}