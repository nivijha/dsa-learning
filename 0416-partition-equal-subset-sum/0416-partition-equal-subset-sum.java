class Solution {
    Boolean t[][];
    public boolean canPartition(int[] nums) {
        int n = nums.length;
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += nums[i];
        }

        if (sum % 2 != 0) {
            return false;
        }

        t = new Boolean[n + 1][sum / 2 + 1];
        for (int i = 0; i < n + 1; i++) {
            for (int j = 0; j < (sum / 2) + 1; j++) {
                if (i == 0 && j != 0)
                    t[i][j] = false;
                if (j == 0)
                    t[i][j] = true;
            }
        }

        for (int i = 1; i < n + 1; i++) {
            for (int j = 1; j < (sum / 2) + 1; j++) {
                if (j - nums[i - 1] < 0) {
                    t[i][j] = t[i-1][j];
                } else {
                    t[i][j] = t[i-1][j] || t[i-1][j-nums[i-1]];
                }
            }
        }

        return t[n][sum/2];
    }
}