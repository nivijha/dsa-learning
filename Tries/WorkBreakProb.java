package Tries;

public class WorkBreakProb {
    static class Node {
        Node children[] = new Node[26];
        boolean eow = false;

        Node(){
            for(int i=0; i<26; i++){
                children[i] = null;
            }
        }
        
    }

    public static Node root = new Node();

    public static void insert(String word){ // O(L) -- L = length of the largest word
        Node curr = root;
        for(int level = 0; level<word.length(); level++){
            int indx = word.charAt(level)-'a';
            if(curr.children[indx] == null){
                curr.children[indx] = new Node();
            }
            curr = curr.children[indx];
        }

        curr.eow = true;
    }

    public static boolean search(String word){ // O(L)
        Node curr = root;
        for(int level = 0; level<word.length(); level++){
            int indx = word.charAt(level)-'a';
            if(curr.children[indx] == null){
                return false;
            }
            curr = curr.children[indx];
        }

        return curr.eow == true;
    }

    public static boolean wordBreak(String key){ // Word Break Problem
        if(key.length() == 0){
            return true;
        }

        for(int i=1; i<=key.length(); i++){
            String firstPart = key.substring(0, i);
            String secondPart = key.substring(i);

            if(search(firstPart) && wordBreak(secondPart)){
                return true;
            }

        }
        return false;
    }
    public static void main(String[] args) {

        String findInTrie[] = {"i", "like", "sam", "samsung", "mobile"};
        String toFind = "ilikesamsung";
        for(int i=0; i<findInTrie.length; i++){
            insert(findInTrie[i]);
        }

        System.out.println(wordBreak(toFind));
    }
}

