class Solution {
    public boolean isAnagram(String s, String t) {
    //     if(s.length()!=t.length()){
    //         return false;
    //     }
    // HashMap<Character, Integer> counter = new HashMap<>();
    // for(int i=0; i<s.length();i++){
    //    char ch = s.charAt(i);
    //    counter.put(ch,counter.getOrDefault(ch,0)+1);
    // }
    // for(int i=0;i<t.length();i++){
    //     char ch = t.charAt(i);
    //     if(!counter.containsKey(ch) || counter.get(ch) == 0){
    //         return false;
    //     }
    //     counter.put(ch,counter.get(ch)-1);
    // }
    // return true;


    // char[] sChars = s.toCharArray();
    // char[] tChars = t.toCharArray();

    // Arrays.sort(sChars);
    // Arrays.sort(tChars);

    // return Arrays.equals(sChars,tChars);

    if(s.length()!=t.length()){
        return false;
    }

    int[] hash = new int[26];
    for(int i=0; i<s.length(); i++){
        hash[t.charAt(i)-'a']++;
    }
     for(int i=0; i<t.length(); i++){
        hash[s.charAt(i)-'a']--;
    }
    for(int num : hash){
        if(num>0){
            return false;
        }
    }
    return true;
    }
}