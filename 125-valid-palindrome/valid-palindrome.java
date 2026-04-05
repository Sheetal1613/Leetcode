class Solution {
    public boolean isPalindrome(String s) {
           String lower = s.toLowerCase();
           String updated_string = lower.replaceAll("[^a-z0-9]","");
           int l = 0;
           int r = updated_string.length()-1;
           while(l<r){
            if(updated_string.charAt(l) != updated_string.charAt(r)){
                return false;
            }
            l++;
            r--;
           }
           return true;
    }
}