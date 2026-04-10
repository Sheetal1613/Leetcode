class Solution {
    public int characterReplacement(String s, int k) {
        Map<Character,Integer> map = new HashMap<>();
        int left = 0;
        int max_frq = 0;
        int longest = 0;
        for(int right = 0; right <s.length(); right++){
            char ch = s.charAt(right);
            map.put(ch,map.getOrDefault(ch,0)+1);
            max_frq = Math.max(max_frq,map.get(ch));
            while((right-left+1) - max_frq > k){
                char left_ch = s.charAt(left);
                map.put(left_ch,map.get(left_ch)-1);
                if(map.size() == 0){
                    map.remove(ch);
                }
                left++;
            }
            longest = Math.max(longest, right-left+1);
        }
        return longest;
    }
}