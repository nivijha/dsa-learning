class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {

        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));
        int res = 0;
        int end1 = intervals[0][1];
        for(int i=1; i<intervals.length; i++){
            if(end1>intervals[i][0]){
                res++;
                end1 = Math.min(end1, intervals[i][1]);
            } else {
                end1 = intervals[i][1];
            }
        }

        return res;
    }
}