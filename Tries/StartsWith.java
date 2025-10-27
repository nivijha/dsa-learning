package Tries;

public class StartsWith {
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

    public static void insert(String word){
        Node curr = root;
        for(int level=0; level<word.length(); level++){
            int indx = word.charAt(level)-'a';
            if(curr.children[indx] == null){
                curr.children[indx] = new Node();
            }

            curr = curr.children[indx];
        }
        curr.eow = true;
    } 

    public static boolean startsWith(String prefix){
        Node curr = root;

        for(int i=0; i<prefix.length(); i++){
            int indx = prefix.charAt(i)-'a';
            if(curr.children[indx] == null){
                return false;
            }

            curr = curr.children[indx];
        }

        return true;
    }

    public static void main(String[] args) {
        String findInTrie[] = {"apple", "app", "mango", "man", "woman"};
        String prefix1 = "app";
        String prefix2 = "moon";
        for(int i=0; i<findInTrie.length; i++){
            insert(findInTrie[i]);
        }

        System.out.println(startsWith(prefix1)+"\n"+ startsWith(prefix2));
    }
}
