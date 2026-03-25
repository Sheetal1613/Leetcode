class Solution {
    public int[][] kClosest(int[][] points, int k) {
        int[][] res = new int[k][2];
        PriorityQueue<int[]> pq = new PriorityQueue<>((a,b) -> b[0] - a[0]);
        for(int[] a : points){
           pq.offer(new int[]{a[0]*a[0] + a[1]*a[1], a[0],a[1]});
           if(pq.size() > k){
            pq.remove();
           }
        }
           for(int i =0; i<k; i++){
            int[] curr = pq.poll();
             res[i][0] = curr[1];
             res[i][1] = curr[2];
           }
        return res;
    }
}