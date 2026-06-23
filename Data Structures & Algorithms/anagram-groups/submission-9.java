class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        
        int n = strs.length;

        Map<String, List<String>> map = new HashMap<>();

        for (int i = 0; i < n; i++){

            char[] ch = strs[i].toCharArray();
            Arrays.sort(ch); // {a,n,t}
            String kuch = new String(ch);


        if (!map.containsKey(kuch)){
            map.put(kuch, new ArrayList<>());       

        }

        map.get(kuch).add(strs[i]);

            

        } return new ArrayList<>(map.values());



    }
}
