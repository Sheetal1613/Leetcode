class Solution {
    public boolean canBeEqual(String s1, String s2) {
        char[] str1 = s1.toCharArray();
        char[] str2 = s2.toCharArray();

        for(int i=0; i<2; i++){
            if(str1[i] != str2[i]){
                   char temp = str2[i];
                   str2[i] = str2[i+2];
                   str2[i+2] = temp;
            }
            if(Arrays.equals(str1,str2)){
                return true;
            }
        }
        return false;
    }
}