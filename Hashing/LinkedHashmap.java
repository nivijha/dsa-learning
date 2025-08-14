import java.util.*;
public class LinkedHashmap {
    public static void main(String[] args) {
        LinkedHashMap<String, Integer> lhm = new LinkedHashMap();
        lhm.put("India", 100);
        lhm.put("China", 250);
        lhm.put("US", 200);
        lhm.put("UK", 150);

        HashMap<String, Integer> hm = new LinkedHashMap();
        hm.put("China", 250);
        hm.put("US", 200);
        hm.put("India", 100);
        hm.put("UK", 150);

        System.out.println(hm);
        System.out.println();
        System.out.println(lhm);
    }
    

}
