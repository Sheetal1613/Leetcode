class Solution {
    public boolean containsDuplicate(int[] nums) {
        // Arrays.sort(nums);  
        // for (int i = 1; i < nums.length; i++) {
        //     if (nums[i] == nums[i - 1]) {
        //         return true;
        //     }
        // } 
        // return false;      

        //using hash table
        Map<Integer,Integer> map = new HashMap<>();
        for(int num : nums){
            map.put(num,map.getOrDefault(num,0)+1);
            if(map.get(num)>1){
                return true;
            }
        }
        // for(Map.Entry<Integer,Integer> entry : map.entrySet()){
        //     if(entry.getValue()>1){
        //         return true;
        //     }
        // }
           return false;
    }
}