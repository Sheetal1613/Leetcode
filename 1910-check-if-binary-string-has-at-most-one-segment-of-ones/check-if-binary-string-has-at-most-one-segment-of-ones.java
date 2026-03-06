class Solution {
    public boolean checkOnesSegment(String s) {
    
        int index = -1;
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i) == '0'){
               index = i;
               break;
            }
        }
        if(index == -1){
            return true;
        }
        for(int i = index; i<s.length()-1; i++){
            if(s.charAt(i+1) == '1'){
                 return false;
            }
        }
        return true;
    }
}