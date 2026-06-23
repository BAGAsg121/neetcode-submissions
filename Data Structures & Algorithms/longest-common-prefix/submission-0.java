class Solution {
    public String longestCommonPrefix(String[] strs) {
        
        String s = strs[0];

        for (int i= 1; i < strs.length ; i++){
            int idx = 0;
            while ( idx < s.length() && idx<strs[i].length() && s.charAt(idx) == strs[i].charAt(idx)) idx++;


            s = s.substring(0,idx);


        }

        return s;

    }
}