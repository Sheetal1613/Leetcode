class Solution {
    public int divisorSubstrings(int num, int k) {
        int count = 0;
        String str = Integer.toString(num);
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<k; i++){
            sb.append(str.charAt(i));
        }
        int val1 = Integer.parseInt(sb.toString());
        if(val1 != 0 && num % val1 == 0){
            count++;
        }
        for(int j=k; j<str.length(); j++){
            sb.append(str.charAt(j));
            sb.deleteCharAt(0);
            int val2 = Integer.parseInt(sb.toString());
            if(val2 != 0 && num % val2 == 0){
                count++;
            }
        }
        return count;
    }
}