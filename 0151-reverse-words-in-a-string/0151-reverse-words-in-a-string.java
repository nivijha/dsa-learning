class Solution {
    public String reverseWords(String s) {
        String[] word = (s.trim()).split("\\s+");

        int left = 0;
        int right = word.length-1;

        while(left<right){
            String temp = word[left];
            word[left] = word[right];
            word[right] = temp;
            left++;
            right--;
        }

        String ans = "";
        for(int i=0; i<word.length; i++){
            if(i!=word.length-1) ans = ans+(word[i]+" ");
            else ans+=(word[i]);            
        }
        return ans;
    }
}