import java.util.HashMap;
import java.util.Set;

public class hashmap {
    public static void main(String[] args) {

        //Create
        HashMap<String, Integer> hm = new HashMap<>();

        //Insert - O(1)
        hm.put("India", 100);
        hm.put("China", 150);
        hm.put("US", 200);
        hm.put("UK", 150);
        hm.put("Russia", 50);

        System.out.println(hm);
        System.out.println();

        //Get - O(1)
        System.out.println(hm.get("Russia"));
        System.out.println(hm.get("France"));
        System.out.println();

        //Contains - O(1)
        System.out.println(hm.containsKey("India"));
        System.out.println(hm.containsKey("France"));
        System.out.println();
        
        //Remove - O(1)
        System.out.println(hm.remove("India"));
        System.out.println(hm.remove ("France"));
        System.out.println();

        //Insert - O(1)
        System.out.println(hm.put("India", 200));
        System.out.println(hm.put("France", 250));
        System.out.println();

        //Size
        System.out.println(hm.size());
        System.out.println();

        //Is Empty
        // System.out.println(hm.isEmpty());
        // hm.clear();
        // System.out.println(hm.isEmpty());
       
       //Iteration in maps using sets
       Set<String> keys = hm.keySet();
       System.out.println(keys); 
       System.out.println();

       for (String key : keys) {
            System.out.println("key: "+ key + ", value: "+ hm.get(key));
       }
    }
}
