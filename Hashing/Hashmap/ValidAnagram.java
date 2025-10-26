package Hashmap;

import java.util.HashMap;

public class ValidAnagram {
    public static boolean isAnagram(String s, String t){
        HashMap<Character, Integer> hm= new HashMap<>();
        for(int i=0; i<s.length(); i++){
            hm.put(s.charAt(i), hm.getOrDefault(s.charAt(i), 0) + 1);
        }

        for(int i=0; i<t.length(); i++){
            if((!hm.containsKey(t.charAt(i))) || ( hm.containsKey(t.charAt(i)) && hm.get(t.charAt(i))==0 )){
                return false;
            } else if(hm.containsKey(t.charAt(i))){
                hm.put(t.charAt(i), hm.get(t.charAt(i))-1);
            }
        }
        return true;
    }
    public static void main(String[] args) {
        String s1 = "tulip";
        String s2 = "lipid";
        System.out.println(isAnagram(s1, s2));
        System.out.println(isAnagram("race", "care"));
    }
}
