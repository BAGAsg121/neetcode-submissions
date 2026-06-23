class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>>  map = new HashMap<>();

        for(String str : strs){


           char[] chars = str.toCharArray();
            Arrays.sort(chars);
            String key = new String(chars);

            if (!map.containsKey(key)){

                map.put(key, new ArrayList<>());
            


            }
            map.get(key).add(str);


        }

        //List<List<String>> ans = new ArrayList<>();

        return new ArrayList<>(map.values());


        //for (List<String> value : map.valueSet()){
            //ans.add(value);
        //}


        //return ans;
        
     }
}
