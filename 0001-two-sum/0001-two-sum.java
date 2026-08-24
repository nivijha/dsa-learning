class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        hm.put(nums[0], 0);
        for(int i=1; i<nums.length; i++){
            int x = target-nums[i];

            if(hm.containsKey(x)){
                return new int[] {i, hm.get(x)};
            }

            hm.put(nums[i], i);
        }
        return new int[] {-1, -1};
    }
}