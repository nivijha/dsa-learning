import java.util.Arrays;

class Solution {
    private int maxLen = 0;
    private int[][] memo;

    public int findLength(int[] nums1, int[] nums2) {
        int n = nums1.length;
        int m = nums2.length;

        maxLen = 0;
        memo = new int[n + 1][m + 1];
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= m; j++) {
                if (i == 0 || j == 0) {
                    memo[i][j] = 0;
                }
                else {
                    memo[i][j] = -1;
                }
            }
        }
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                if (nums1[i - 1] == nums2[j - 1]) {
                    memo[i][j] = 1 + memo[i - 1][j - 1];
                    maxLen = Math.max(maxLen, memo[i][j]);
                } else {
                    memo[i][j] = 0;
                }
            }
        }

        return maxLen;
    }
}