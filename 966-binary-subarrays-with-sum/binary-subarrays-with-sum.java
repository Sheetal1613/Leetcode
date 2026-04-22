class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
        return atmost(nums,goal) - atmost(nums,goal-1);
    }
     public int atmost(int[] nums, int goal){
        if(goal < 0){
            return 0;
        }
        int subarr_count = 0;
        int left = 0;
        int sum = 0;
        for(int r=0; r<nums.length; r++){
            sum = sum+nums[r];
            while(sum > goal){
                sum = sum - nums[left];
                left++;
            }
            subarr_count = subarr_count + (r-left+1);
        }
        return subarr_count;
    }
}