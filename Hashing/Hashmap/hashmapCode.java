package Hashmap;

import java.util.*;

public class hashmapCode {
    static class HashMap<K, V> { // generics or parametrise
        private class Node{
            K key;
            V value;

            public Node(K key, V value) {
                this.key = key;
                this.value = value;
            }
        }
            private int n; // LL size
            private int N; // bucket size
            private LinkedList<Node> buckets[];

            // @SuppressWarnings("unchecked");
            public HashMap(){
                this.N = 4;
                this.buckets = new LinkedList[4];
                for(int i=0; i<4; i++){
                    this.buckets[i] = new LinkedList<>();
                }
            }

            private int hashFunction(K key){
                int hc = key.hashCode();
                return Math.abs(hc)%buckets.length;
            }

            public int SearchInLL(K key, int bi){
                LinkedList<Node> ll = buckets[bi];
                int di =0;

                for(int i=0; i<ll.size(); i++){
                    Node node = ll.get(i);
                    if(node.key == key){
                        return di;
                    }
                    di++;
                }
                return -1;
            }

            private void rehash(){
                // current bucket ko ek variable mei store krdia
                LinkedList<Node> oldBucket[] = buckets;
                // hashmap ko naye size se initialise krdia
                buckets = new LinkedList[N*2];
                N = 2*N;
                for(int i =0; i<buckets.length; i++){
                    // saare index ko khai ll se initialise krdia
                    buckets[i] = new LinkedList<>();
                }

                // nodes -> add in buckets
                for(int i=0; i<oldBucket.length; i++){
                    //purani bucket se saare node nikaale
                    LinkedList<Node> ll = oldBucket[i];
                    for(int j=0; j<ll.size(); j++){
                        //naye bucket mei store krdia
                        Node node = ll.get(j);
                        put(node.key, node.value);
                    }
                }
            }

            public void put(K key, V value){
                int bi = hashFunction(key); // bucket index returned
                int di = SearchInLL(key, bi); // data index --- valid or -1

                if(di != -1){
                    Node node = buckets[bi].get(di);
                    node.value = value;
                } else{
                    buckets[bi].add(new Node(key, value));
                    n++;
                }

                double lamda = n/N;

                if(lamda>2.0){
                    rehash();
                }
            }

            public boolean containsKey(K key, V value){
                int bi = hashFunction(key); // bucket index returned
                int di = SearchInLL(key, bi); // data index --- valid or -1

                if(di != -1){
                    return true;
                }

                return false;
            }

            public V remove(K key){ // O(lamda) -> O(1)
                int bi = hashFunction(key); // bucket index returned
                int di = SearchInLL(key, bi); // data index --- valid or -1

                if(di != -1){
                    Node node = buckets[bi].remove(di);
                    return node.value;
                }

                return null;
            }

            public V get(K key){
                int bi = hashFunction(key); // bucket index returned
                int di = SearchInLL(key, bi); // data index --- valid or -1

                if(di != -1){
                    Node node = buckets[bi].get(di);
                    return node.value;
                } else{
                    return null;
                }
            }

            public ArrayList<K> keysets(){
                ArrayList<K> keys = new ArrayList<>();

                for(int i=0; i<buckets.length; i++){
                    LinkedList<Node> ll = buckets[i];
                    for(Node node : ll){
                        keys.add(node.key);
                    }
                }
                return keys;
            }

            public boolean isEmpty(){
                return n == 0;
            }
        }

    public static void main(String[] args) {
        HashMap<String, Integer> hm= new HashMap<>();
        hm.put("India", 250);
        hm.put("china", 150);
        hm.put("Japan", 50);
        hm.put("UK", 50);

        ArrayList<String> keys = hm.keysets();
        for(String key :keys){
            System.out.println(key);
        }

        System.out.println();
        System.out.println(hm.get("India"));
        System.out.println(hm.remove("china"));
    }
}
