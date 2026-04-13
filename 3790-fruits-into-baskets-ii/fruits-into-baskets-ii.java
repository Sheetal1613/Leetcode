class Solution {
    public int numOfUnplacedFruits(int[] fruits, int[] baskets) {
        int count = 0;
        for(int i=0; i<fruits.length; i++){
              int found = 0;
            for(int j=0; j<baskets.length; j++){
            if(baskets[j] >= fruits[i]){
                baskets[j] = -1;
                found = -1;
                break;
            }
        }
        if(found == 0){
            count++;
          }
        }
        return count;
    }
}