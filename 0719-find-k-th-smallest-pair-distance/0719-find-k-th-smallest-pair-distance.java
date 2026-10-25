class Solution {
    public int pairs(int[] nums, int d){
        int pairCount = 0;

        int i=0, j=1;
        while(i<j && j<nums.length){
            while(nums[j] - nums[i] > d){
                i++;
            }
            pairCount+=(j-i);
            j++;
        }
        return pairCount;
    }

    public int smallestDistancePair(int[] nums, int k) {
        int n = nums.length;
        Arrays.sort(nums);
        int maxEl = nums[n-1] - nums[0];
        int res = 0;

        int low = 0;
        int high = maxEl;

        while(low<=high){
            int mid = low + (high-low)/2;
            int countPair = pairs(nums, mid);
            if(countPair < k){
                low = mid+1;
            } else {
                res = mid;
                high = mid-1;
            }
        }
        return res;
    }
}