class Solution {
    public int[] topKFrequent(int[] nums, int k) {

        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i=0; i<nums.length; i++) {

            map.put(nums[i], map.getOrDefault(nums[i], 0) +1);
        }

        // Put all unique number into a list
        List<Integer> uniqueNumbers = new ArrayList<>(map.keySet());

        // sort number we can do in both way ascending descending
        // in ascending high frequency number move to end 
        // in descending high frequency number move to start

        uniqueNumbers.sort((a,b) -> map.get(b) - map.get(a));

        // take first k element from sorted list 
        int[] result = new int[k];

        for(int i=0; i<k; i++) {
            result[i] = uniqueNumbers.get(i);
        }
        return result;
    }
}
