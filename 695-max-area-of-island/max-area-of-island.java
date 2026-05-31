class Solution {
    public int maxAreaOfIsland(int[][] grid) {
        int max = 0;
        int m = grid.length;
        int n = grid[0].length;
        boolean[][] vis = new boolean[m][n];
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                if(grid[i][j] == 1 && !vis[i][j]){
                    int area = dfs(i,j,m,n,vis,grid);
                    max = Math.max(area, max);
                }
            }
        }
        return max;
    }
    public int dfs(int i, int j, int m, int n, boolean[][] vis, int[][] grid){
       if(i<0 || j<0|| i>=m || j >= n ||  grid[i][j] == 0 || vis[i][j])
       return 0;

       vis[i][j] = true;

        return 1
         + dfs(i - 1, j, m, n, vis, grid)
         + dfs(i + 1, j, m, n, vis, grid)
         + dfs(i, j - 1, m, n, vis, grid)
         + dfs(i, j + 1, m, n, vis, grid);
    }
}