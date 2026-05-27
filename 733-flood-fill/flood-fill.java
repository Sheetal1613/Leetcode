class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int m = image.length;
        int n = image[0].length;
        boolean[][] vis = new boolean[m][n];
        bfs(image[sr][sc], image, sr, sc, m, n, color, vis);
        return image;
    }
    public void bfs(int val, int[][] image, int sr, int sc, int m, int n, int color, boolean[][] vis){
        Queue<int[]> q = new LinkedList<>();
        q.offer(new int[]{sr,sc});
        vis[sr][sc] = true;
        image[sr][sc] = color;
        while(!q.isEmpty()){
           int[] front = q.remove();
           int a = front[0];
           int b = front[1];
            if(a-1 >=0 && image[a-1][b] == val && !vis[a-1][b]){
                q.offer(new int[]{a-1,b});
                vis[a-1][b] = true;
                image[a-1][b] = color;
            }
            if(b-1 >= 0 && image[a][b-1] == val && !vis[a][b-1]){
                q.offer(new int[]{a,b-1});
                vis[a][b-1] = true;
                image[a][b-1] = color;
            }
            if(a+1 < m && image[a+1][b] == val && !vis[a+1][b]){
                q.offer(new int[]{a+1,b});
                vis[a+1][b] = true;
                image[a+1][b] = color;
            }
            if(b+1 < n && image[a][b+1] == val && !vis[a][b+1]){
                q.offer(new int[]{a,b+1});
                vis[a][b+1] = true;
                image[a][b+1] = color;
            }
        }
    }
}