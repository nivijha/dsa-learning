package Hashset;
import java.util.*;

import Hashset.hashset;

public class hashset {
    public static void main(String[] args) {
        HashSet<String> hs = new HashSet<>();
        hs.add("Delhi");
        hs.add("Noida");
        hs.add("Ghaziabad");
        hs.add("Gurgaon");
        System.out.println("HashSet prints in random order");
        System.out.println(hs);
        System.out.println();

        //Iterator --
        // Iterator it = hs.iterator();
        // while(it.hasNext()){
        //     System.out.println(it.next());
        // }

        //Advance Functions -- 
        // for(String city: hs){
        //     System.out.println(city);
        // }

        LinkedHashSet<String> lhs = new LinkedHashSet<>();
        lhs.add("Delhi");
        lhs.add("Noida");
        lhs.add("Ghaziabad");
        lhs.add("Gurgaon");
        System.out.println("Linked HashSet prints in the order of insertion");
        System.out.println(lhs);
        System.out.println();

        TreeSet<String> ts = new TreeSet<>();
        ts.add("Delhi");
        ts.add("Noida");
        ts.add("Ghaziabad");
        ts.add("Gurgaon");
        System.out.println("TreeSet prints in the Ascending order of elements");
        System.out.println(ts);
        System.out.println();
    }
}
