
import java.util.*;

class Solution {

    void generate(int[] nums, int idx, int end,
                  int sum, int count,
                  List<List<Integer>> res) {

        if (idx == end) {
            res.get(count).add(sum);
            return;
        }

        // Don't take current element
        generate(nums, idx + 1, end, sum, count, res);

        // Take current element
        generate(nums, idx + 1, end,
                 sum + nums[idx], count + 1, res);
    }

    int lowerBound(List<Integer> arr, double target) {

        int low = 0;
        int high = arr.size();

        while (low < high) {
            int mid = low + (high - low) / 2;

            if (arr.get(mid) < target) {
                low = mid + 1;
            } else {
                high = mid;
            }
        }

        return low;
    }

    public int minimumDifference(int[] nums) {

        int n = nums.length / 2;

        int totalSum = 0;
        for (int num : nums) {
            totalSum += num;
        }

        List<List<Integer>> left = new ArrayList<>();
        List<List<Integer>> right = new ArrayList<>();

        for (int i = 0; i <= n; i++) {
            left.add(new ArrayList<>());
            right.add(new ArrayList<>());
        }

        // Generate subset sums for both halves
        generate(nums, 0, n, 0, 0, left);
        generate(nums, n, nums.length, 0, 0, right);

        int minDiff = Integer.MAX_VALUE;

        // Sort right-side subset sums
        for (List<Integer> list : right) {
            Collections.sort(list);
        }

        // Combine left and right subset sums
        for (int k = 0; k <= n; k++) {

            List<Integer> rightSums = right.get(n - k);

            for (int leftSum : left.get(k)) {

                double target = totalSum / 2.0 - leftSum;

                int idx = lowerBound(rightSums, target);

                // Check the element at idx
                if (idx < rightSums.size()) {
                    long sum = (long) leftSum + rightSums.get(idx);
                    long diff = Math.abs((long) totalSum - 2 * sum);

                    minDiff = (int) Math.min(minDiff, diff);
                }

                // Check the previous element
                if (idx > 0) {
                    long sum = (long) leftSum + rightSums.get(idx - 1);
                    long diff = Math.abs((long) totalSum - 2 * sum);

                    minDiff = (int) Math.min(minDiff, diff);
                }
            }
        }

        return minDiff;
    }
}
