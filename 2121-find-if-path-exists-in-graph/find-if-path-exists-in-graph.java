class Solution {
    public boolean validPath(int n, int[][] edges, int source, int destination) { 
        if(source == destination){
            return true;
        }
        boolean[] vis = new boolean[n];
        List<List<Integer>> adj = new ArrayList<>();
        for(int i=0; i<n; i++){
            List<Integer> li = new ArrayList<>();
            adj.add(li);
        }
        for(int i=0; i<edges.length; i++){
           int a = edges[i][0];
           int b = edges[i][1];
           adj.get(a).add(b);
           adj.get(b).add(a);
        }
        bfs(source, adj, vis, destination);
        return vis[destination];
    }
      private void bfs(int source, List<List<Integer>> adj, boolean[] vis, int destination){
        Queue<Integer> q = new LinkedList<>();
        q.add(source);
        while(!q.isEmpty()){
            int front = q.remove();
            for(int val : adj.get(front)){
                if(vis[val] == false){
                    q.add(val);
                    vis[val] = true;
                    if(val == destination){
                        return;
                    }
                }
            }
        }
      }
}