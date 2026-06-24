class Solution {
    public String mergeAlternately(String word1, String word2) {
        
        int n = word1.length();
        int m = word2.length();

        char[] w1 = word1.toCharArray();
        char[] w2 = word2.toCharArray();

        
        String and = "";

        int i = 0;
        int j = 0;

        while ( i< n && j<m){

            and += w1[i] ;
            and += w2[j] ;

            i++;
            j++;


        }
        if (i<n){

            and += word1.substring(i,n);

        } 
        if (j<m){
            and += word2.substring(j,m);


        }

        return and;


    }
}