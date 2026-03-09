class Solution {
    public int[] twoSum(int[] nums, int target) {
    //     for(int i = 0; i<nums.length - 1; i++){
    //     for(int j = i+1;j<nums.length ; j++){
    //         if(nums[i]+nums[j]== target){
    //             return new int[]{i,j};
    //         }
    //     }
    // }
    // return new int[]{};


    // Arrays.sort(nums);
    // int left = 0;
    //  int right = nums.length-1;
    //  while(left<right){
    //     if(nums[left]+nums[right]==target){
    //         return new int[]{left,right};
    //     }
    //     else if(nums[left]+nums[right]>target){
    //         right--;
    //     }
    //     else{
    //         left++;
    //     }
    //  }
    //  return new int[]{};

    Map<Integer,Integer> map = new HashMap<>();
    for(int i=0; i<nums.length; i++){
        int more = target-nums[i];
        if(map.containsKey(more)){
            return new int[]{i,map.get(more)};
        }
        map.put(nums[i],i);
    }
    return new int[]{};
    }
}