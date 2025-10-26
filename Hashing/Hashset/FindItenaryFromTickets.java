package Hashset;

import java.util.HashMap;

public class FindItenaryFromTickets {
    // Approach find the starting point
    // one map has from - to data
    // another map has to - from data
    // match the keys of 1st and 2nd map the one that doesnt exists is the Starting point

    public static String getStart(HashMap<String, String> tickets){
        HashMap<String, String> revTickets = new HashMap<>();
        for(HashMap.Entry<String, String> ticket : tickets.entrySet()){
            revTickets.put(ticket.getValue(), ticket.getKey());
        }

        for(String key : tickets.keySet()){
            if(!revTickets.containsKey(key)){
                return key;
            }
        }

        return null;
    }
    public static void main(String[] args) {
        HashMap<String, String> tickets = new HashMap<>();
        tickets.put("Chennai", "Bengaluru");
        tickets.put("Mumbai", "Delhi");
        tickets.put("Goa", "Chennai");
        tickets.put("Delhi", "Goa");

        String start = getStart(tickets);
        System.out.print(start);
        for(String key : tickets.keySet()){
            System.out.print(" -> " + tickets.get(start));
            start = tickets.get(start);
        }

    }
}
