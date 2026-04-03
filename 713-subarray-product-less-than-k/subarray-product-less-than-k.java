class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        // int count = 0;
        // for(int i = 0; i<nums.length; i++){
        //     int product=1;
        //     for(int j=i;j<nums.length;j++){
        //         product = product * nums[j];
        //         if(product<k){
        //             count++;
        //         }
        //         else {
        //             break;
        //         }
        //     }
        // }
        // return count;
        if(k<=1){
            return 0;
        }
        int count = 0;
        int prod = 1;
        int left = 0;
       
        for(int right=0; right<nums.length; right++){
            prod = prod*nums[right];
            while(prod >= k){
                prod = prod/nums[left];
                left++;
            }
            count = count + right-left+1;
        }
        return count;
    }
}