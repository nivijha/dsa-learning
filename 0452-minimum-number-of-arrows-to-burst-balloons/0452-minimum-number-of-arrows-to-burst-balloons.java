class Solution {
    public int findMinArrowShots(int[][] points) {
        if(points.length==0) return 0;

        Arrays.sort(points, (a, b) -> Integer.compare(a[0], b[0]));
        int end1 = points[0][1];
        int burst = 1;

        for (int i = 0; i < points.length; i++) {            
            if (end1 < points[i][0]) {
                end1 = points[i][1];
                burst++;
            } else {
                end1 = Math.min(end1, points[i][1]);
            }
        }
        return burst;
    }
}