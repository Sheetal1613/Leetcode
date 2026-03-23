class Solution {
    public int longestConsecutive(int[] nums) {
        // Arrays.sort(nums);
        // if(nums.length==0){
        //     return 0;
        // }
        // int count = 1 ,  g = 1;
        // for(int i =0 ;i<nums.length-1;i++){
        //     if(nums[i+1]==nums[i]){
        //         continue;
        //     }
        //         if(nums[i+1]-nums[i]==1){
        //         count ++;
        //         g = Math.max(count,g);
        //     }
        //     else{
        //         count = 1;
        //     }
        // }
        // return g;

//         int count = 1;
//         for(int i=1;i<nums.length;i++){
//             if(nums[i-1]+1 == nums[i]){
//                count++;
//             }
//         }
//    return count;
     
     
     
     Set<Integer> set = new HashSet<>();
     for(int num : nums){
        set.add(num);
     }
     int longest = 0;
     for(int num : set){
        if(!set.contains(num - 1)){
            int length = 1;
            while(set.contains(num + length)){
               length++;
            }
            longest = Math.max(longest,length); 
        }
     }
     return longest;
    }
}