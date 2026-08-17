class Solution {
    public long totalHrs(int[] piles, int k){
        long hr = 0;
        for(int i=0; i<piles.length; i++){
            hr += (piles[i]/k);
            if(piles[i]%k!=0) hr++;
        }
        return hr;
    }
    public int findMax(int[] piles){
        int max = Integer.MIN_VALUE;
        int n = piles.length;
        for(int i=0; i<n; i++){
            max = Math.max(max, piles[i]);
        }
        return max;
    }
    public int minEatingSpeed(int[] piles, int h) {
        int low = 1;
        int high = findMax(piles);
        int ans = 0;

        while(low<=high){
            int mid = low + (high-low)/2;
            long hr = totalHrs(piles, mid);
            if(hr<=h){
                high = mid-1;
                ans = mid;
            } else {
                low = mid+1;
            }
        }
        return ans;
    }
}