class Solution {
    Boolean t[][];

    public boolean isSubset(int[] nums, int s, int n){
        if(s==0) return true;
        if(n==0) return false;

        if(t[n][s]!=null){
            return t[n][s];
        }

        if(s-nums[n-1]<0){
            return t[n][s] = isSubset(nums, s, n-1);
        } else{
            return t[n][s] = isSubset(nums, s, n-1) || isSubset(nums, s-nums[n-1], n-1);
        }
    }    
    
    public boolean canPartition(int[] nums) {
        int n = nums.length;
        int sum = 0;
        for(int i=0; i<n; i++){
            sum+=nums[i];
        }

        if(sum%2!=0){
            return false;
        }

        t=new Boolean[n+1][sum/2+1];
        for(int i=0; i<n+1; i++){
            for(int j=0; j<(sum/2)+1; j++){
                if(i==0 && j!=0) t[i][j] = false;
                if(j==0) t[i][j] = true;
            }
        }

        return isSubset(nums, sum/2, n);
    }
}