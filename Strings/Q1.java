package Strings;

import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String str= sc.next();
        int count=0;

        for(int i=0; i<str.length(); i++){
            char ch= str.charAt(i);
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
                count++;
            }
        }
        System.out.println("number of time a vowel ocurred in lowercase"+count);
    }
}
