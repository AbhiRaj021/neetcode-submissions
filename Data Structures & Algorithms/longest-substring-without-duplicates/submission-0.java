class Solution {
    public int lengthOfLongestSubstring(String s) {
        
        int str = s.length();
        int maxCount = 0;
        int left = 0;
        HashSet<Character> set = new HashSet<>();

        for(int i=0; i<str; i++) {

            while(set.contains(s.charAt(i))) {
                set.remove(s.charAt(left));
                left++;
            }
            set.add(s.charAt(i));
            int countSize = i - left + 1;
            maxCount = Math.max(countSize, maxCount);
        }
        return maxCount;
    }
}
