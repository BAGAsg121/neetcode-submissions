class Solution {
    public boolean isPalindrome(String s) {

        String str = s.toLowerCase().replaceAll("[^a-z0-9]", "");

        char[] chars = str.toCharArray();

        int i = 0;
        int j = chars.length - 1;

        while (i < j) {

            if (chars[i] != chars[j]) {
                return false;
            }

            i++;
            j--;
        }

        return true;
    }
}