class Solution {
    public int[] twoSum(int[] nums, int target) {


        int n = nums.length;


        Map<Integer, Integer> numEscape = new HashMap<>();

        for (int i = 0; i < n ; i++){
            int remainder = target - nums[i];
            if (numEscape.containsKey(remainder)){

                

                return new int[] {(numEscape.get(remainder)), i} ;
            }

            numEscape.put(nums[i], i);
                
                

        
        
        }
         return new int[1];

        
    }
}
