class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        PriorityQueue<int[]> pq = new PriorityQueue<>( (a, b) -> a[0] == b[0] ? a[1] - b[1] : a[0] - b[0]);
        List<Integer> res = new ArrayList<>();
        for(int i=0; i<arr.length; i++){
           int closest =  Math.abs(arr[i]-x);
            pq.add(new int[]{closest,arr[i]});
        }
        for(int i=0; i<k; i++){
            res.add(pq.poll()[1]);
        }
        Collections.sort(res);
        return res;
    }
}