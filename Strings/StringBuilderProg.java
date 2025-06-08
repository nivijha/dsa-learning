package Strings;
import java.util.*;

public class StringBuilderProg {
    public static void main(String[] args) {
        StringBuilder sb= new StringBuilder("");
        for(char ch='a'; ch<='z'; ch++){
            sb.append(ch);
        }
        //O(26) in case of using Stringbuilder
        //O(n^2) when we use String kyuki hrr iteration pe ek nayi string bnri hogi
        System.out.println(sb);
    }
    
    
}
