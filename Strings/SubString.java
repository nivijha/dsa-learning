package Strings;


public class SubString {
    public static String sstring(String str, int si, int ei){
        String substr="";
        for(int i=si; i<ei;i++){
            substr+=str.charAt(i);
        }
        return substr;
    }
    public static void main(String[] args) {
        String str="Helloworld";
        System.out.println(sstring(str, 0, 5));
        System.out.println(str.substring(0, 5));//inbuilt function
    }
}
