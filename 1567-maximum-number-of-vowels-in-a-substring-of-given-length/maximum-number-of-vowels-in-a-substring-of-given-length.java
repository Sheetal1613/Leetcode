class Solution {
    public int maxVowels(String s, int k) {
        int vowel = 0;
        int max_vowel = 0;
        String substr = s.substring(0,0+k);
        for(int i=0; i<substr.length(); i++){
            if(isVowel(substr.charAt(i))){
                vowel++;
            }
        }
       max_vowel = Math.max(vowel,max_vowel);
        for(int j=k; j<s.length(); j++){
            if(isVowel(s.charAt(j))){
                vowel++;
            }
            if(isVowel(s.charAt(j-k))){
                vowel--;
            }
            max_vowel = Math.max(vowel,max_vowel);
        }
        return max_vowel;
    }
     public boolean isVowel(char ch){
            if(ch == 'a' || ch == 'e' || ch == 'i'  || ch == 'o' || ch == 'u'){
                return true;
            }
            else{
                return false;
            }
        }
}