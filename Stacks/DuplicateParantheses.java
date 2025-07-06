package Stacks;
import java.util.*;

public class DuplicateParantheses {
    public static boolean isDuplicateParanthesis(String str){
        Stack<Character> s= new Stack<>();

        for(int i=0; i<str.length(); i++){
            char ch = str.charAt(i);
            int count=0;

            //closing
            if(ch == ')'){ 
                while(s.peek() != '('){
                    s.pop();
                    count++;
                }
                if(count<1){
                    return true;
                }else{
                    s.pop();
                }
            }
            else{ //opening
                s.push(ch);
            }
        }
        return false;
    }
    public static void main(String[] args) {
        //assuming the string is a valid string.
        String str= "((a+b))";
        String str1 = "((a+b)+(c+d))";
        System.out.println(str + isDuplicateParanthesis(str));
        System.out.println(str1 + isDuplicateParanthesis(str1));
    }
    
}