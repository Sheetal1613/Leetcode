class Solution {
    public int minimumRecolors(String blocks, int k) {
        int min = Integer.MAX_VALUE;
        for(int i=0; i<=blocks.length()-k; i++){
           String substr = blocks.substring(i,i+k);
           int count = 0;
           for(int j=0; j<k; j++){
            if(substr.charAt(j) == 'W'){
                count++;
            }
           }
            min = Math.min(min,count);
        }
        return min;
    }
}