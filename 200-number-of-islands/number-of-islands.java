class Solution {
    public int numIslands(char[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        boolean[][] vis = new boolean[m][n]; 
        int island = 0;
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                if(!vis[i][j] && grid[i][j] == '1'){
                    bfs(i,j,vis,grid,m,n);
                    island++;
                }
            }
        }
        return island;
    }
        public void bfs(int i, int j, boolean[][] vis, char[][] grid, int m, int n){
          Queue<int[]> q = new LinkedList<>();
          q.add(new int[]{i,j});
          vis[i][j] = true;
          while(!q.isEmpty()){
            int[] front = q.poll();
            int a = front[0];
            int b = front[1];
                if((a-1)>= 0 && !vis[a-1][b] && grid[a-1][b] == '1'){
                    q.offer(new int[]{a-1,b});
                    vis[a-1][b] = true;
                }
                if((b-1) >=0 && !vis[a][b-1] && grid[a][b-1] == '1'){
                    q.offer(new int[]{a,b-1});
                    vis[a][b-1] = true;
                }
                if((a+1) < m && !vis[a+1][b] && grid[a+1][b] == '1'){
                    q.offer(new int[]{a+1,b});
                    vis[a+1][b] = true;
                }
                if((b+1) < n && !vis[a][b+1] && grid[a][b+1] == '1'){
                    q.offer(new int[]{a,b+1});
                    vis[a][b+1] = true;
                }
            }
        }
}