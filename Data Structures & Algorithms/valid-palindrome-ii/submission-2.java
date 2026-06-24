class Solution {

        

    public boolean validPalindrome(String s) {

        int n = s.length();
        int i = 0;
        int j= n-1;

        String strs = s.toLowerCase().replaceAll("[^a-z0-9]", "");

        char[] chars = strs.toCharArray();


        while (i<j){

            if (chars[i] != chars[j]){

                return isPalindrome(s, i +1, j) || isPalindrome(s, i, j-1);
            }
            i++;
            j--;
        
        }   return true;


    }


    public boolean isPalindrome(String s, int i, int j){
        
        

        // char[] chars = strs.toCharArray();

    

        while (i<j){

            if (s.charAt(i) != s.charAt(j)){
                return false;
            }
            i++;
            j--;
        } 
        return true;

    }






}

