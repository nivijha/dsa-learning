class Solution {
    int dfs(List<List<Integer>> ad, boolean[] visited, int from) {
        int change = 0;
        visited[from] = true;
        for (int i=0; i<ad.get(from).size(); i++){
            int to = ad.get(from).get(i);
            if (!visited[Math.abs(to)])
                change += dfs(ad, visited, Math.abs(to)) + (to > 0 ? 1 : 0);
        }
        return change;   
    }
    public int minReorder(int n, int[][] connections) {
        List<List<Integer>> ad = new ArrayList<>();
        for(int i = 0; i < n; ++i) 
            ad.add(new ArrayList<>());
        for (int i=0; i<connections.length; i++) {
            ad.get(connections[i][0]).add(connections[i][1]);
            ad.get(connections[i][1]).add(-connections[i][0]);
        }
        return dfs(ad, new boolean[n], 0);
    }
}