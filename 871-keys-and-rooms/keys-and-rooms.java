class Solution {
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        int n = rooms.size();
        boolean[] vis = new boolean[n];
        //for(int i=0; i<n; i++){
           bfs(0, vis, rooms);
        //}
        for(int j=0; j<n; j++){
            if(vis[j] == false){
                return false;
            }
        }
        return true;
    }
    private void bfs(int i, boolean[] vis, List<List<Integer>> rooms){
        //int n = rooms.size();
        Queue<Integer> q = new LinkedList<>();
        q.add(i);
        vis[i] = true;
        while(!q.isEmpty()){
            int k = q.remove();
        for(int key : rooms.get(k)){
           if(vis[key]==false){
            q.add(key);
            vis[key] = true;
           }
        }
      }
    }
}