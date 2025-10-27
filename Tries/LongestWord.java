package Tries;

public class LongestWord {
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

    public static String ans = "";
    public static void longestWord(Node root, StringBuilder temp){
        if(root == null){
            return;
        }

        int count = 0;
        for(int i=0; i<26; i++){
            if(root.children[i] != null && root.children[i].eow == true){
                char ch = (char)(i+'a');
                temp.append(ch);
                if(temp.length() > ans.length()){
                    ans = temp.toString();
                }
                longestWord(root.children[i], temp);
                temp.deleteCharAt(temp.length()-1);
            }
        }
    }

    public static void main(String[] args) {
        String findInTrie[] = {"a", "banana", "appl", "ap", "apply", "apple", "app"};
    
        for(int i=0; i<findInTrie.length; i++){
            insert(findInTrie[i]);
        }

        longestWord(root, new StringBuilder(""));
        System.out.println(ans);
    }
}

