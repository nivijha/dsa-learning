class Solution {
    public int[] successfulPairs(int[] spells, int[] potions, long success) {
        int s = spells.length;
        int p = potions.length;
        int[] ans = new int[s];

        Arrays.sort(potions);

        for(int i=0; i<s; i++){
            int low = 0;
            int high = p-1;
            int count = 0;

            while(low<=high){
                int mid = low + (high-low)/2;
                if((long)potions[mid]*spells[i] < success){
                    low = mid+1;
                } else {
                    high = mid-1;
                }
            }
            ans[i] = p-low;
        }

        return ans;
    }
}