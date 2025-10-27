package Tries;

public class PrefixProb {
    static class Node {
        Node children[] = new Node[26];
        boolean eow = false;
        int freq;

        Node(){
            for(int i=0; i<26; i++){
                children[i] = null;
            }
            freq = 1;
        }
        
    }

    public static Node root = new Node();

    public static void insert(String word){ // O(L) -- L = length of the largest word
        Node curr = root;
        for(int level = 0; level<word.length(); level++){
            int indx = word.charAt(level)-'a';
            if(curr.children[indx] == null){
                curr.children[indx] = new Node();
            } else{
               curr.children[indx].freq++;     
            }
            curr = curr.children[indx];
        }

        curr.eow = true;
    }

    public static void findPrefix(Node root, String ans){
        if(root == null){
            return;
        }

        if(root.freq == 1){
            System.out.println(ans);
            return;
        }
        for(int i = 0; i<root.children.length; i++){
            if(root.children[i] != null){
                findPrefix(root.children[i], ans+(char)(i+'a'));
            }
        }

    }

    public static void main(String[] args) {
        String words[] = {"zebra", "dog", "duck", "dove"};

        for(int i=0; i<words.length; i++){
            insert(words[i]);
        }

        root.freq = -1;
        findPrefix(root, "");
    }
}
