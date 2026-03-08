class Solution {
    public String findDifferentBinaryString(String[] nums) {
        Set<Integer> set = new HashSet<>();
        int n = nums.length;
        for(String s : nums){
         set.add(Integer.parseInt(s,2));
       }
       for(int i=0; i<=n; i++){
        if(!set.contains(i)){
            return String.format("%0"+ n + "d", Integer.parseInt(Integer.toBinaryString(i)));
        }
       }
       return "";
    }
}