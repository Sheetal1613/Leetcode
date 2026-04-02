class Solution {
    public int lengthOfLongestSubstring(String s) {
      int left = 0;
      int right = 0;
      int max_len = 0;
      Set<Character> substring = new HashSet<>();
      while(right<s.length()){
       if(!substring.contains(s.charAt(right))){
        substring.add(s.charAt(right));
        max_len = Math.max(max_len,right-left+1);
        right++;
       }
       else{
        substring.remove(s.charAt(left));
        left++;
       }
      }
      return max_len;
    }
}