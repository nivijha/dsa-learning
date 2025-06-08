package Strings;

public class UpperCase {
    public static String touppercase(String str){
        StringBuilder sb= new StringBuilder("");

        char ch= Character.toUpperCase(str.charAt(0));
        sb.append(ch);

        for(int i=1; i<str.length();i++){
            if(str.charAt(i) == ' ' && i<str.length()-1){
                sb.append(str.charAt(i));//empty space ko string my copy krdo
                i++;
                sb.append(Character.toUpperCase(str.charAt(i)));//uppercase mei character ko copy krdo string mei
            }
            else{
                sb.append(str.charAt(i));
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        String str= "hello WORLD";
        System.out.println(touppercase(str));
    }
}
