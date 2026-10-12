
import java.util.*;

public class Solution {
    public int minCut(String A) {
        int n = A.length();
        if (n <= 1) return 0;

        boolean[][] pal = new boolean[n][n];
        int[] dp = new int[n];

        // Precompute palindromes
        for (int i = n - 1; i >= 0; i--) {
            for (int j = i; j < n; j++) {
                if (A.charAt(i) == A.charAt(j)) {
                    pal[i][j] = (j - i <= 2) || pal[i + 1][j - 1];
                }
            }
        }

        // Minimum cuts for every prefix A[0...i]
        for (int i = 0; i < n; i++) {
            if (pal[0][i]) {
                dp[i] = 0;
            } else {
                dp[i] = i;

                for (int j = 1; j <= i; j++) {
                    if (pal[j][i]) {
                        dp[i] = Math.min(dp[i], dp[j - 1] + 1);
                    }
                }
            }
        }

        return dp[n - 1];
    }
}
