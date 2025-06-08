package Strings;
import java.util.*;

public class Q2anagram {
    public static void main(String[] args) {
        //conver string to lowercase so that we dont have to check seperately for lower & uppercase.
        String str1="earth";
        str1=str1.toLowerCase();
        String str2="heart";
        str2=str2.toLowerCase();

        //first check the length of strings
        if(str1.length()==str2.length()){
            //convert strings into chr array
            char str1charArray[]= str1.toCharArray();
            char str2charArray[]= str2.toCharArray();

            //sort the char array
            Arrays.sort(str1charArray);
            Arrays.sort(str2charArray);

            //if the sorted arrays are same or identical then the strings are anagram

            boolean result= Arrays.equals(str1charArray,str2charArray);
            if(result){
                System.out.println(str1+"and"+str2+"are anagrams of each other");
            }
            else{
                System.out.println(str1+"and"+str2+"are not anagrams of eo");
            }
        }
        else{
            System.out.println(str1+"and"+str2+"are not anagrams of eo");
        }

    }
    
}
