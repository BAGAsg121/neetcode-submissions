class Solution {
    public int[] countBits(int n) {


        int[] ans = new int[n + 1];

        for (int i = 0; i< n+1 ; i++){
            int nums = i;
            int count = 0;

            while(nums > 0){

                nums = nums & (nums - 1);
                count++;

            }
            ans[i] = count;
        
        
        }return ans;



    }






}
