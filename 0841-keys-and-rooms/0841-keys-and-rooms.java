class Solution {
    private void dfs(List<List<Integer>> rooms, int room, boolean vis[]){
        vis[room] = true;
        for(int i=0; i<rooms.get(room).size(); i++){
            if(!vis[rooms.get(room).get(i)]){
                dfs(rooms, rooms.get(room).get(i), vis);
            }
        }
    }
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        boolean vis[] = new boolean[rooms.size()];
        dfs(rooms, 0, vis);

        for(int i=0; i<vis.length; i++){
            if(!vis[i]){
                return false;
            }
        }
        return true;
    }
}