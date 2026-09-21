class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length==0) return 0;
        Arrays.sort(nums);
        int low = 0, high = 1;
        int ans = 1;
        int count = 1;
        while(high<nums.length){
            int diff = nums[high]-nums[high-1];
            if(diff==1){
                count++;
            } else if (diff!=1 && diff!=0){
                low = high;
                count = 1;
            }
            ans = Math.max(ans, count);
            high++;
        }
        return ans;
    }
}