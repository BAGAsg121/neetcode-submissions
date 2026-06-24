class Solution {
    public boolean validPalindrome(String s) {

        String strs = s.toLowerCase().replaceAll("[^a-z0-9]", ""); // ✅ ^ added
        char[] chars = strs.toCharArray();

        int i = 0;
        int j = chars.length - 1;

        while (i < j) {
            if (chars[i] != chars[j]) {
                // try skipping left OR right
                return isPalindrome(chars, i + 1, j) || isPalindrome(chars, i, j - 1);
            }
            i++;
            j--;
        }

        return true;
    }

    public boolean isPalindrome(char[] chars, int i, int j) { // ✅ takes char[]
        while (i < j) {
            if (chars[i] != chars[j]) { // ✅ chars exists now
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}