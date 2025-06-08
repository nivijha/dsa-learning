package Backtracking;

public class FindPermutation {
    public static void findPermutation(String str, String ans){
        //base case
        if(str.length()==0){
            System.out.println(ans);
            return;
        }

        //recursion
        for(int i=0; i<str.length(); i++){
            char curr = str.charAt(i);
            //"abcde" = "ab" + "de" = "abde"
            String Newstr = str.substring(0, i) + str.substring(i+1); //substring is inbuilt string fucntion that returns substring of the given string  --> substring(start indx, end indx) by default the upper limit is not inducluded for example- str.substring(1,4) the subtring will be calc from 1 to 3 index. And we dont give any end indx then by default it runs till the string length.
            findPermutation(Newstr, ans+curr);
        }
    }

    public static void main(String[] args) {
        String str = "abc";
        findPermutation(str, "");
    }
}
