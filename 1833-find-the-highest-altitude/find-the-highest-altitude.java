class Solution {
    public int largestAltitude(int[] gain) {
        int max = 0;
        int n = gain.length;
        int[] points = new int[n+1];
        points[0] = 0;
        for(int i=1; i<=n; i++){
            points[i] = points[i-1] + gain[i-1];
            max = Math.max(max,points[i]);
        }
        return max;
    }
}