class Solution {
    int[][] t;
    public int lcs(String t1, String t2, int n, int m){
        if(n==0 || m==0) return 0;
        if(t[n][m] != -1) return t[n][m];
        if(t1.charAt(n-1) == t2.charAt(m-1)){
            return t[n][m] = 1+lcs(t1, t2, n-1, m-1);
        } else {
            return t[n][m] = Math.max(lcs(t1, t2, n-1, m), lcs(t1, t2, n, m-1));
        }
    }
    public int longestCommonSubsequence(String text1, String text2) {
        int n = text1.length();
        int m = text2.length();

        t = new int[n+1][m+1];
        for(int i=0; i<n+1; i++){
            for(int j=0; j<m+1; j++){
                if(i==0 || j==0) t[i][j] = 0;
                else t[i][j] = -1;
            }
        }
        return lcs(text1, text2, text1.length(), text2.length());
    }
}