class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> map = new HashMap<>();

        // turn word into key afer sorting eat or tea become aet and it is key to find similar word
        for(String s : strs) {
            char[] chars = s.toCharArray();
            Arrays.sort(chars);
            String key = new String(chars);

            // aet -> eat,tea looking for key bucket does this exist
            if(!map.containsKey(key)) {
                map.put(key, new ArrayList<>());  // if key is not matched thn create a new list
            }

            map.get(key).add(s);  //after finding keys add original words t o bucket
        }

        return new ArrayList<>(map.values());  // this takes only value and wrap them in new list
    }
}
