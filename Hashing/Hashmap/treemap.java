package Hashmap;
import java.util.HashMap;
import java.util.TreeMap;

public class treemap {
    public static void main(String[] args) {
        TreeMap<String, Integer> tm = new TreeMap<>();
        tm.put("India", 100);
        tm.put("China", 150);
        tm.put("US", 50);

        HashMap<String, Integer> hm = new HashMap<>();
        hm.put("India", 100);
        hm.put("China", 150);
        hm.put("US", 50);

        System.out.println(hm); // this prints in random order
        System.out.println();
        System.out.println(tm); // this prints in the ascending order

    }
}
