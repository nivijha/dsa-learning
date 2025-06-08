package Strings;

public class StringComparison {
    public static boolean main(String[] args) {
        String s1="Tony";
        String s2="Tony";
        String s3= new String("Tony");

        if(s1==s2){
            return true;
        }
        if(s1==s3){
            return true;
        }
        if(s3==s2){
            return true;
        }
        //s1 and s2 are pointing to the same Tony but s3 is pointing to a Tony that is stored at different address
        // to compare just the string irrespective of what the variable is pointing at we use ".equal function"
        if(s1.equals(s3)){//just comparing hte string of s1 with s3
            return true;
        }
        return false;
    }
}
