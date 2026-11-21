
public class Solution {
    int[][] t;
    boolean[][] isPal;

    public int solve(String A, int i, int j) {

        if(i >= j || isPal[i][j]) {
            return 0;
        }

        if(t[i][j] != -1) {
            return t[i][j];
        }

        int min = Integer.MAX_VALUE;

        for(int k = i; k < j; k++) {

            if(isPal[i][k]) {
                int right = solve(A, k+1, j);
                min = Math.min(min, 1 + right);
            }
        }

        return t[i][j] = min;
    }

    public int minCut(String A) {

        int n = A.length();

        t = new int[n][n];
        isPal = new boolean[n][n];

        for(int i = 0; i < n; i++) {
            Arrays.fill(t[i], -1);
        }

        for(int i = n-1; i >= 0; i--) {
            for(int j = i; j < n; j++) {

                if(A.charAt(i) == A.charAt(j)) {
                    if(j-i <= 2 || isPal[i+1][j-1]) {
                        isPal[i][j] = true;
                    }
                }
            }
        }

        return solve(A, 0, n-1);
    }
}
