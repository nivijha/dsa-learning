class Solution {
    public int isSubset(int[] nums, int sum, int n) {
        if (n == 0) {
            return sum == 0 ? 1 : 0;
        }

        if (sum - nums[n - 1] < 0) {
            return isSubset(nums, sum, n - 1);
        } else {
            return isSubset(nums, sum, n - 1) + isSubset(nums, sum - nums[n - 1], n - 1);
        }
    }

    public int findTargetSumWays(int[] nums, int target) {
        int totalSum = 0;
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            totalSum += nums[i];
        }

        if ((totalSum - target) % 2 != 0)
            return 0;

        return isSubset(nums, (totalSum - target) / 2, n);
    }
}