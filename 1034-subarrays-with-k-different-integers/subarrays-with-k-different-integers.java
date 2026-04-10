class Solution {
    public int subarraysWithKDistinct(int[] nums, int k) {
        return atmost(nums,k) - atmost(nums,k-1);
    }
    private int atmost(int[] nums, int k){
      int count = 0;
      int left = 0;
      Map<Integer,Integer> map = new HashMap<>();
      for(int r=0; r<nums.length; r++){
        map.put(nums[r], map.getOrDefault(nums[r],0)+1);
        while(map.size()>k){
            map.put(nums[left], map.get(nums[left])-1);
            if(map.get(nums[left]) == 0){
                map.remove(nums[left]);
            }
            left++;
        }
        count = count + (r-left+1);
      }
      return count; 
    }
}