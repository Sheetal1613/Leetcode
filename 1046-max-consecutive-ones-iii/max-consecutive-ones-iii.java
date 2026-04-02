class Solution {
    public int longestOnes(int[] nums, int k) {
        // int max_len = 0;
        // for(int i=0; i<nums.length; i++){
        //     int count = 0;
        //     for(int j=i; j<nums.length; j++){
        //         if(nums[j] == 0){
        //             count++;
        //         }
        //         if(count > k){
        //          break;
        //         }
        //         max_len = Math.max(max_len, j-i+1);
        //     }
        //  }
        //  return max_len;

        //sliding window approach
        int max_len = Integer.MIN_VALUE;
        int zero_count = 0;
        int left = 0;
        for(int right=0; right<nums.length; right++){
            if(nums[right] == 0){
                zero_count++;
            }
            while(zero_count > k){
                if(nums[left] == 0){
                  zero_count--;
                }
                left++;
            }
            max_len = Math.max(max_len,right-left+1);
        }
        return max_len;
    }
}